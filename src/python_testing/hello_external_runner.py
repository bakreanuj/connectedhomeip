#!/usr/bin/env -S python3 -B
#
#    Copyright (c) 2023 Project CHIP Authors
#    All rights reserved.
#
#    Licensed under the Apache License, Version 2.0 (the "License");
#    you may not use this file except in compliance with the License.
#    You may obtain a copy of the License at
#
#        http://www.apache.org/licenses/LICENSE-2.0
#
#    Unless required by applicable law or agreed to in writing, software
#    distributed under the License is distributed on an "AS IS" BASIS,
#    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#    See the License for the specific language governing permissions and
#    limitations under the License.
#

import os
import signal
import subprocess
import sys
from multiprocessing import Process
from multiprocessing.managers import BaseManager

from hello_test import HelloTest
from matter_testing_support import MatterTestConfig, get_test_info, run_tests

try:
    from matter_yamltests.hooks import TestRunnerHooks
except ImportError:
    class TestRunnerHooks:
        pass

DEFAULT_CHIP_ROOT = os.path.abspath(
    os.path.join(os.path.dirname(__file__), '..', '..'))

MATTER_DEVELOPMENT_PAA_ROOT_CERTS = "credentials/development/paa-root-certs"


class TestTestRunnerHooks(TestRunnerHooks):
    def reset(self):
        self.start_called = False
        self.stop_called = False
        self.test_start_called = False
        self.test_stop_called = False
        self.step_skipped_list = []
        self.step_start_list = []
        self.step_success_count = 0
        self.step_failure_count = 0
        self.step_unknown_count = 0

    def __init__(self):
        self.reset()

    def start(self, count: int):
        self.start_called = True

    def stop(self, duration: int):
        self.stop_called = True

    def test_start(self, filename: str, name: str, count: int):
        self.test_start_called = True

    def test_stop(self, exception: Exception, duration: int):
        self.test_stop_called = True

    def step_skipped(self, name: str, expression: str):
        self.step_skipped_list.append(name)

    def step_start(self, name: str):
        self.step_start_list.append(name)

    def step_success(self, logger, logs, duration: int, request):
        self.step_success_count = self.step_success_count + 1

    def step_failure(self, logger, logs, duration: int, request, received):
        self.step_failure_count = self.step_failure_count + 1

    def step_unknown(self):
        self.step_unknown_count = self.step_unknown_count + 1

    def summary(self):
        print(f'start_called = {self.start_called}')
        print(f'stop_called = {self.stop_called}')
        print(f'test_start_called = {self.test_start_called}')
        print(f'test_stop_called = {self.test_stop_called}')
        print(f'step_skipped_list = {self.step_skipped_list}')
        print(f'step_start_list = {self.step_start_list}')
        print(f'step_success_count = {self.step_success_count}')
        print(f'step_failure_count = {self.step_failure_count}')
        print(f'step_unknown_count = {self.step_unknown_count}')


def run_in_process(test_name: str, config: MatterTestConfig) -> None:
    BaseManager.register('TestTestRunnerHooks', TestTestRunnerHooks)
    manager = BaseManager()
    manager.start()
    my_hooks = manager.TestTestRunnerHooks()
    p = Process(target=run_tests, args=(HelloTest, config, my_hooks))
    p.start()
    p.join()
    print(f'Results from test {test_name}:')
    print(my_hooks.summary())


def commission() -> None:
    paa_path = os.path.join(DEFAULT_CHIP_ROOT, MATTER_DEVELOPMENT_PAA_ROOT_CERTS)
    config = MatterTestConfig(commissioning_method="on-network", commission_only=True, discriminators=[3840], setup_passcodes=[
                              20202021], dut_node_ids=[0x12344321], paa_trust_store_path=paa_path, storage_path='admin_storage.json')
    run_in_process("commission", config)


def one_test(test_name):
    # Run a test NOT using the default main. Pass in our own runner and make sure it
    # gets called back.

    # This config would be generated by the TH. PIXITs can be passed using the global_test_params["meta_config"] section.
    config = MatterTestConfig(tests=[test_name], dut_node_ids=[0x12344321], storage_path='admin_storage.json')

    # TH can use get_test_info to get a list of steps and a description
    list = get_test_info(HelloTest, config)
    print(f'Test info for test {test_name}')
    print(list)

    run_in_process(test_name, config)


def main():

    # Fire up an example app to test against
    # TODO: make factory reset and app path configurable, maybe the storage location too.
    subprocess.call("rm -rf /tmp/chip_* /tmp/repl* admin_storage.json", shell=True)
    app_path = os.path.abspath(os.path.join(DEFAULT_CHIP_ROOT, 'out',
                                            'linux-x64-all-clusters-ipv6only-no-ble-no-wifi-tsan-clang-test', 'chip-all-clusters-app'))
    app_cmd = str(app_path)
    app_process = subprocess.Popen([app_cmd], stdout=sys.stdout, stderr=sys.stderr, bufsize=0)

    commission()
    one_test('test_failure_on_wrong_endpoint')
    one_test('test_names_as_expected')
    one_test('test_pics')

    app_process.send_signal(signal.SIGINT.value)
    app_process.wait()
    print("app stopped")


if __name__ == "__main__":
    main()

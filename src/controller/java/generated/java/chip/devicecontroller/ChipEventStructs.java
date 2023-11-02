/*
 *
 *    Copyright (c) 2023 Project CHIP Authors
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package chip.devicecontroller;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class ChipEventStructs {
public static class AccessControlClusterAccessControlEntryChangedEvent {
  public @Nullable Long adminNodeID;
  public @Nullable Integer adminPasscodeID;
  public Integer changeType;
  public @Nullable ChipStructs.AccessControlClusterAccessControlEntryStruct latestValue;
  public Integer fabricIndex;
  public AccessControlClusterAccessControlEntryChangedEvent(
    @Nullable Long adminNodeID,
    @Nullable Integer adminPasscodeID,
    Integer changeType,
    @Nullable ChipStructs.AccessControlClusterAccessControlEntryStruct latestValue,
    Integer fabricIndex
  ) {
    this.adminNodeID = adminNodeID;
    this.adminPasscodeID = adminPasscodeID;
    this.changeType = changeType;
    this.latestValue = latestValue;
    this.fabricIndex = fabricIndex;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("AccessControlClusterAccessControlEntryChangedEvent {\n");
    output.append("\tadminNodeID: ");
    output.append(adminNodeID);
    output.append("\n");
    output.append("\tadminPasscodeID: ");
    output.append(adminPasscodeID);
    output.append("\n");
    output.append("\tchangeType: ");
    output.append(changeType);
    output.append("\n");
    output.append("\tlatestValue: ");
    output.append(latestValue);
    output.append("\n");
    output.append("\tfabricIndex: ");
    output.append(fabricIndex);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class AccessControlClusterAccessControlExtensionChangedEvent {
  public @Nullable Long adminNodeID;
  public @Nullable Integer adminPasscodeID;
  public Integer changeType;
  public @Nullable ChipStructs.AccessControlClusterAccessControlExtensionStruct latestValue;
  public Integer fabricIndex;
  public AccessControlClusterAccessControlExtensionChangedEvent(
    @Nullable Long adminNodeID,
    @Nullable Integer adminPasscodeID,
    Integer changeType,
    @Nullable ChipStructs.AccessControlClusterAccessControlExtensionStruct latestValue,
    Integer fabricIndex
  ) {
    this.adminNodeID = adminNodeID;
    this.adminPasscodeID = adminPasscodeID;
    this.changeType = changeType;
    this.latestValue = latestValue;
    this.fabricIndex = fabricIndex;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("AccessControlClusterAccessControlExtensionChangedEvent {\n");
    output.append("\tadminNodeID: ");
    output.append(adminNodeID);
    output.append("\n");
    output.append("\tadminPasscodeID: ");
    output.append(adminPasscodeID);
    output.append("\n");
    output.append("\tchangeType: ");
    output.append(changeType);
    output.append("\n");
    output.append("\tlatestValue: ");
    output.append(latestValue);
    output.append("\n");
    output.append("\tfabricIndex: ");
    output.append(fabricIndex);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class ActionsClusterStateChangedEvent {
  public Integer actionID;
  public Long invokeID;
  public Integer newState;
  public ActionsClusterStateChangedEvent(
    Integer actionID,
    Long invokeID,
    Integer newState
  ) {
    this.actionID = actionID;
    this.invokeID = invokeID;
    this.newState = newState;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("ActionsClusterStateChangedEvent {\n");
    output.append("\tactionID: ");
    output.append(actionID);
    output.append("\n");
    output.append("\tinvokeID: ");
    output.append(invokeID);
    output.append("\n");
    output.append("\tnewState: ");
    output.append(newState);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class ActionsClusterActionFailedEvent {
  public Integer actionID;
  public Long invokeID;
  public Integer newState;
  public Integer error;
  public ActionsClusterActionFailedEvent(
    Integer actionID,
    Long invokeID,
    Integer newState,
    Integer error
  ) {
    this.actionID = actionID;
    this.invokeID = invokeID;
    this.newState = newState;
    this.error = error;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("ActionsClusterActionFailedEvent {\n");
    output.append("\tactionID: ");
    output.append(actionID);
    output.append("\n");
    output.append("\tinvokeID: ");
    output.append(invokeID);
    output.append("\n");
    output.append("\tnewState: ");
    output.append(newState);
    output.append("\n");
    output.append("\terror: ");
    output.append(error);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class BasicInformationClusterStartUpEvent {
  public Long softwareVersion;
  public BasicInformationClusterStartUpEvent(
    Long softwareVersion
  ) {
    this.softwareVersion = softwareVersion;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("BasicInformationClusterStartUpEvent {\n");
    output.append("\tsoftwareVersion: ");
    output.append(softwareVersion);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class BasicInformationClusterLeaveEvent {
  public Integer fabricIndex;
  public BasicInformationClusterLeaveEvent(
    Integer fabricIndex
  ) {
    this.fabricIndex = fabricIndex;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("BasicInformationClusterLeaveEvent {\n");
    output.append("\tfabricIndex: ");
    output.append(fabricIndex);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class BasicInformationClusterReachableChangedEvent {
  public Boolean reachableNewValue;
  public BasicInformationClusterReachableChangedEvent(
    Boolean reachableNewValue
  ) {
    this.reachableNewValue = reachableNewValue;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("BasicInformationClusterReachableChangedEvent {\n");
    output.append("\treachableNewValue: ");
    output.append(reachableNewValue);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class OtaSoftwareUpdateRequestorClusterStateTransitionEvent {
  public Integer previousState;
  public Integer newState;
  public Integer reason;
  public @Nullable Long targetSoftwareVersion;
  public OtaSoftwareUpdateRequestorClusterStateTransitionEvent(
    Integer previousState,
    Integer newState,
    Integer reason,
    @Nullable Long targetSoftwareVersion
  ) {
    this.previousState = previousState;
    this.newState = newState;
    this.reason = reason;
    this.targetSoftwareVersion = targetSoftwareVersion;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("OtaSoftwareUpdateRequestorClusterStateTransitionEvent {\n");
    output.append("\tpreviousState: ");
    output.append(previousState);
    output.append("\n");
    output.append("\tnewState: ");
    output.append(newState);
    output.append("\n");
    output.append("\treason: ");
    output.append(reason);
    output.append("\n");
    output.append("\ttargetSoftwareVersion: ");
    output.append(targetSoftwareVersion);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class OtaSoftwareUpdateRequestorClusterVersionAppliedEvent {
  public Long softwareVersion;
  public Integer productID;
  public OtaSoftwareUpdateRequestorClusterVersionAppliedEvent(
    Long softwareVersion,
    Integer productID
  ) {
    this.softwareVersion = softwareVersion;
    this.productID = productID;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("OtaSoftwareUpdateRequestorClusterVersionAppliedEvent {\n");
    output.append("\tsoftwareVersion: ");
    output.append(softwareVersion);
    output.append("\n");
    output.append("\tproductID: ");
    output.append(productID);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class OtaSoftwareUpdateRequestorClusterDownloadErrorEvent {
  public Long softwareVersion;
  public Long bytesDownloaded;
  public @Nullable Integer progressPercent;
  public @Nullable Long platformCode;
  public OtaSoftwareUpdateRequestorClusterDownloadErrorEvent(
    Long softwareVersion,
    Long bytesDownloaded,
    @Nullable Integer progressPercent,
    @Nullable Long platformCode
  ) {
    this.softwareVersion = softwareVersion;
    this.bytesDownloaded = bytesDownloaded;
    this.progressPercent = progressPercent;
    this.platformCode = platformCode;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("OtaSoftwareUpdateRequestorClusterDownloadErrorEvent {\n");
    output.append("\tsoftwareVersion: ");
    output.append(softwareVersion);
    output.append("\n");
    output.append("\tbytesDownloaded: ");
    output.append(bytesDownloaded);
    output.append("\n");
    output.append("\tprogressPercent: ");
    output.append(progressPercent);
    output.append("\n");
    output.append("\tplatformCode: ");
    output.append(platformCode);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class PowerSourceClusterWiredFaultChangeEvent {
  public ArrayList<Integer> current;
  public ArrayList<Integer> previous;
  public PowerSourceClusterWiredFaultChangeEvent(
    ArrayList<Integer> current,
    ArrayList<Integer> previous
  ) {
    this.current = current;
    this.previous = previous;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("PowerSourceClusterWiredFaultChangeEvent {\n");
    output.append("\tcurrent: ");
    output.append(current);
    output.append("\n");
    output.append("\tprevious: ");
    output.append(previous);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class PowerSourceClusterBatFaultChangeEvent {
  public ArrayList<Integer> current;
  public ArrayList<Integer> previous;
  public PowerSourceClusterBatFaultChangeEvent(
    ArrayList<Integer> current,
    ArrayList<Integer> previous
  ) {
    this.current = current;
    this.previous = previous;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("PowerSourceClusterBatFaultChangeEvent {\n");
    output.append("\tcurrent: ");
    output.append(current);
    output.append("\n");
    output.append("\tprevious: ");
    output.append(previous);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class PowerSourceClusterBatChargeFaultChangeEvent {
  public ArrayList<Integer> current;
  public ArrayList<Integer> previous;
  public PowerSourceClusterBatChargeFaultChangeEvent(
    ArrayList<Integer> current,
    ArrayList<Integer> previous
  ) {
    this.current = current;
    this.previous = previous;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("PowerSourceClusterBatChargeFaultChangeEvent {\n");
    output.append("\tcurrent: ");
    output.append(current);
    output.append("\n");
    output.append("\tprevious: ");
    output.append(previous);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class GeneralDiagnosticsClusterHardwareFaultChangeEvent {
  public ArrayList<Integer> current;
  public ArrayList<Integer> previous;
  public GeneralDiagnosticsClusterHardwareFaultChangeEvent(
    ArrayList<Integer> current,
    ArrayList<Integer> previous
  ) {
    this.current = current;
    this.previous = previous;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("GeneralDiagnosticsClusterHardwareFaultChangeEvent {\n");
    output.append("\tcurrent: ");
    output.append(current);
    output.append("\n");
    output.append("\tprevious: ");
    output.append(previous);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class GeneralDiagnosticsClusterRadioFaultChangeEvent {
  public ArrayList<Integer> current;
  public ArrayList<Integer> previous;
  public GeneralDiagnosticsClusterRadioFaultChangeEvent(
    ArrayList<Integer> current,
    ArrayList<Integer> previous
  ) {
    this.current = current;
    this.previous = previous;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("GeneralDiagnosticsClusterRadioFaultChangeEvent {\n");
    output.append("\tcurrent: ");
    output.append(current);
    output.append("\n");
    output.append("\tprevious: ");
    output.append(previous);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class GeneralDiagnosticsClusterNetworkFaultChangeEvent {
  public ArrayList<Integer> current;
  public ArrayList<Integer> previous;
  public GeneralDiagnosticsClusterNetworkFaultChangeEvent(
    ArrayList<Integer> current,
    ArrayList<Integer> previous
  ) {
    this.current = current;
    this.previous = previous;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("GeneralDiagnosticsClusterNetworkFaultChangeEvent {\n");
    output.append("\tcurrent: ");
    output.append(current);
    output.append("\n");
    output.append("\tprevious: ");
    output.append(previous);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class GeneralDiagnosticsClusterBootReasonEvent {
  public Integer bootReason;
  public GeneralDiagnosticsClusterBootReasonEvent(
    Integer bootReason
  ) {
    this.bootReason = bootReason;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("GeneralDiagnosticsClusterBootReasonEvent {\n");
    output.append("\tbootReason: ");
    output.append(bootReason);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class SoftwareDiagnosticsClusterSoftwareFaultEvent {
  public Long id;
  public Optional<String> name;
  public Optional<byte[]> faultRecording;
  public SoftwareDiagnosticsClusterSoftwareFaultEvent(
    Long id,
    Optional<String> name,
    Optional<byte[]> faultRecording
  ) {
    this.id = id;
    this.name = name;
    this.faultRecording = faultRecording;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("SoftwareDiagnosticsClusterSoftwareFaultEvent {\n");
    output.append("\tid: ");
    output.append(id);
    output.append("\n");
    output.append("\tname: ");
    output.append(name);
    output.append("\n");
    output.append("\tfaultRecording: ");
    output.append(faultRecording.isPresent() ? Arrays.toString(faultRecording.get()) : "");
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class ThreadNetworkDiagnosticsClusterConnectionStatusEvent {
  public Integer connectionStatus;
  public ThreadNetworkDiagnosticsClusterConnectionStatusEvent(
    Integer connectionStatus
  ) {
    this.connectionStatus = connectionStatus;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("ThreadNetworkDiagnosticsClusterConnectionStatusEvent {\n");
    output.append("\tconnectionStatus: ");
    output.append(connectionStatus);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class ThreadNetworkDiagnosticsClusterNetworkFaultChangeEvent {
  public ArrayList<Integer> current;
  public ArrayList<Integer> previous;
  public ThreadNetworkDiagnosticsClusterNetworkFaultChangeEvent(
    ArrayList<Integer> current,
    ArrayList<Integer> previous
  ) {
    this.current = current;
    this.previous = previous;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("ThreadNetworkDiagnosticsClusterNetworkFaultChangeEvent {\n");
    output.append("\tcurrent: ");
    output.append(current);
    output.append("\n");
    output.append("\tprevious: ");
    output.append(previous);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class WiFiNetworkDiagnosticsClusterDisconnectionEvent {
  public Integer reasonCode;
  public WiFiNetworkDiagnosticsClusterDisconnectionEvent(
    Integer reasonCode
  ) {
    this.reasonCode = reasonCode;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("WiFiNetworkDiagnosticsClusterDisconnectionEvent {\n");
    output.append("\treasonCode: ");
    output.append(reasonCode);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class WiFiNetworkDiagnosticsClusterAssociationFailureEvent {
  public Integer associationFailureCause;
  public Integer status;
  public WiFiNetworkDiagnosticsClusterAssociationFailureEvent(
    Integer associationFailureCause,
    Integer status
  ) {
    this.associationFailureCause = associationFailureCause;
    this.status = status;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("WiFiNetworkDiagnosticsClusterAssociationFailureEvent {\n");
    output.append("\tassociationFailureCause: ");
    output.append(associationFailureCause);
    output.append("\n");
    output.append("\tstatus: ");
    output.append(status);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class WiFiNetworkDiagnosticsClusterConnectionStatusEvent {
  public Integer connectionStatus;
  public WiFiNetworkDiagnosticsClusterConnectionStatusEvent(
    Integer connectionStatus
  ) {
    this.connectionStatus = connectionStatus;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("WiFiNetworkDiagnosticsClusterConnectionStatusEvent {\n");
    output.append("\tconnectionStatus: ");
    output.append(connectionStatus);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class TimeSynchronizationClusterDSTStatusEvent {
  public Boolean DSTOffsetActive;
  public TimeSynchronizationClusterDSTStatusEvent(
    Boolean DSTOffsetActive
  ) {
    this.DSTOffsetActive = DSTOffsetActive;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("TimeSynchronizationClusterDSTStatusEvent {\n");
    output.append("\tDSTOffsetActive: ");
    output.append(DSTOffsetActive);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class TimeSynchronizationClusterTimeZoneStatusEvent {
  public Long offset;
  public Optional<String> name;
  public TimeSynchronizationClusterTimeZoneStatusEvent(
    Long offset,
    Optional<String> name
  ) {
    this.offset = offset;
    this.name = name;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("TimeSynchronizationClusterTimeZoneStatusEvent {\n");
    output.append("\toffset: ");
    output.append(offset);
    output.append("\n");
    output.append("\tname: ");
    output.append(name);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class BridgedDeviceBasicInformationClusterStartUpEvent {
  public Long softwareVersion;
  public BridgedDeviceBasicInformationClusterStartUpEvent(
    Long softwareVersion
  ) {
    this.softwareVersion = softwareVersion;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("BridgedDeviceBasicInformationClusterStartUpEvent {\n");
    output.append("\tsoftwareVersion: ");
    output.append(softwareVersion);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class BridgedDeviceBasicInformationClusterReachableChangedEvent {
  public Boolean reachableNewValue;
  public BridgedDeviceBasicInformationClusterReachableChangedEvent(
    Boolean reachableNewValue
  ) {
    this.reachableNewValue = reachableNewValue;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("BridgedDeviceBasicInformationClusterReachableChangedEvent {\n");
    output.append("\treachableNewValue: ");
    output.append(reachableNewValue);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class SwitchClusterSwitchLatchedEvent {
  public Integer newPosition;
  public SwitchClusterSwitchLatchedEvent(
    Integer newPosition
  ) {
    this.newPosition = newPosition;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("SwitchClusterSwitchLatchedEvent {\n");
    output.append("\tnewPosition: ");
    output.append(newPosition);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class SwitchClusterInitialPressEvent {
  public Integer newPosition;
  public SwitchClusterInitialPressEvent(
    Integer newPosition
  ) {
    this.newPosition = newPosition;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("SwitchClusterInitialPressEvent {\n");
    output.append("\tnewPosition: ");
    output.append(newPosition);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class SwitchClusterLongPressEvent {
  public Integer newPosition;
  public SwitchClusterLongPressEvent(
    Integer newPosition
  ) {
    this.newPosition = newPosition;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("SwitchClusterLongPressEvent {\n");
    output.append("\tnewPosition: ");
    output.append(newPosition);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class SwitchClusterShortReleaseEvent {
  public Integer previousPosition;
  public SwitchClusterShortReleaseEvent(
    Integer previousPosition
  ) {
    this.previousPosition = previousPosition;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("SwitchClusterShortReleaseEvent {\n");
    output.append("\tpreviousPosition: ");
    output.append(previousPosition);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class SwitchClusterLongReleaseEvent {
  public Integer previousPosition;
  public SwitchClusterLongReleaseEvent(
    Integer previousPosition
  ) {
    this.previousPosition = previousPosition;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("SwitchClusterLongReleaseEvent {\n");
    output.append("\tpreviousPosition: ");
    output.append(previousPosition);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class SwitchClusterMultiPressOngoingEvent {
  public Integer newPosition;
  public Integer currentNumberOfPressesCounted;
  public SwitchClusterMultiPressOngoingEvent(
    Integer newPosition,
    Integer currentNumberOfPressesCounted
  ) {
    this.newPosition = newPosition;
    this.currentNumberOfPressesCounted = currentNumberOfPressesCounted;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("SwitchClusterMultiPressOngoingEvent {\n");
    output.append("\tnewPosition: ");
    output.append(newPosition);
    output.append("\n");
    output.append("\tcurrentNumberOfPressesCounted: ");
    output.append(currentNumberOfPressesCounted);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class SwitchClusterMultiPressCompleteEvent {
  public Integer previousPosition;
  public Integer totalNumberOfPressesCounted;
  public SwitchClusterMultiPressCompleteEvent(
    Integer previousPosition,
    Integer totalNumberOfPressesCounted
  ) {
    this.previousPosition = previousPosition;
    this.totalNumberOfPressesCounted = totalNumberOfPressesCounted;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("SwitchClusterMultiPressCompleteEvent {\n");
    output.append("\tpreviousPosition: ");
    output.append(previousPosition);
    output.append("\n");
    output.append("\ttotalNumberOfPressesCounted: ");
    output.append(totalNumberOfPressesCounted);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class BooleanStateClusterStateChangeEvent {
  public Boolean stateValue;
  public BooleanStateClusterStateChangeEvent(
    Boolean stateValue
  ) {
    this.stateValue = stateValue;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("BooleanStateClusterStateChangeEvent {\n");
    output.append("\tstateValue: ");
    output.append(stateValue);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class RefrigeratorAlarmClusterNotifyEvent {
  public Long active;
  public Long inactive;
  public Long state;
  public Long mask;
  public RefrigeratorAlarmClusterNotifyEvent(
    Long active,
    Long inactive,
    Long state,
    Long mask
  ) {
    this.active = active;
    this.inactive = inactive;
    this.state = state;
    this.mask = mask;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("RefrigeratorAlarmClusterNotifyEvent {\n");
    output.append("\tactive: ");
    output.append(active);
    output.append("\n");
    output.append("\tinactive: ");
    output.append(inactive);
    output.append("\n");
    output.append("\tstate: ");
    output.append(state);
    output.append("\n");
    output.append("\tmask: ");
    output.append(mask);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class SmokeCoAlarmClusterSmokeAlarmEvent {
  public Integer alarmSeverityLevel;
  public SmokeCoAlarmClusterSmokeAlarmEvent(
    Integer alarmSeverityLevel
  ) {
    this.alarmSeverityLevel = alarmSeverityLevel;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("SmokeCoAlarmClusterSmokeAlarmEvent {\n");
    output.append("\talarmSeverityLevel: ");
    output.append(alarmSeverityLevel);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class SmokeCoAlarmClusterCOAlarmEvent {
  public Integer alarmSeverityLevel;
  public SmokeCoAlarmClusterCOAlarmEvent(
    Integer alarmSeverityLevel
  ) {
    this.alarmSeverityLevel = alarmSeverityLevel;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("SmokeCoAlarmClusterCOAlarmEvent {\n");
    output.append("\talarmSeverityLevel: ");
    output.append(alarmSeverityLevel);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class SmokeCoAlarmClusterLowBatteryEvent {
  public Integer alarmSeverityLevel;
  public SmokeCoAlarmClusterLowBatteryEvent(
    Integer alarmSeverityLevel
  ) {
    this.alarmSeverityLevel = alarmSeverityLevel;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("SmokeCoAlarmClusterLowBatteryEvent {\n");
    output.append("\talarmSeverityLevel: ");
    output.append(alarmSeverityLevel);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class SmokeCoAlarmClusterInterconnectSmokeAlarmEvent {
  public Integer alarmSeverityLevel;
  public SmokeCoAlarmClusterInterconnectSmokeAlarmEvent(
    Integer alarmSeverityLevel
  ) {
    this.alarmSeverityLevel = alarmSeverityLevel;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("SmokeCoAlarmClusterInterconnectSmokeAlarmEvent {\n");
    output.append("\talarmSeverityLevel: ");
    output.append(alarmSeverityLevel);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class SmokeCoAlarmClusterInterconnectCOAlarmEvent {
  public Integer alarmSeverityLevel;
  public SmokeCoAlarmClusterInterconnectCOAlarmEvent(
    Integer alarmSeverityLevel
  ) {
    this.alarmSeverityLevel = alarmSeverityLevel;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("SmokeCoAlarmClusterInterconnectCOAlarmEvent {\n");
    output.append("\talarmSeverityLevel: ");
    output.append(alarmSeverityLevel);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class DishwasherAlarmClusterNotifyEvent {
  public Long active;
  public Long inactive;
  public Long state;
  public Long mask;
  public DishwasherAlarmClusterNotifyEvent(
    Long active,
    Long inactive,
    Long state,
    Long mask
  ) {
    this.active = active;
    this.inactive = inactive;
    this.state = state;
    this.mask = mask;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("DishwasherAlarmClusterNotifyEvent {\n");
    output.append("\tactive: ");
    output.append(active);
    output.append("\n");
    output.append("\tinactive: ");
    output.append(inactive);
    output.append("\n");
    output.append("\tstate: ");
    output.append(state);
    output.append("\n");
    output.append("\tmask: ");
    output.append(mask);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class OperationalStateClusterOperationalErrorEvent {
  public ChipStructs.OperationalStateClusterErrorStateStruct errorState;
  public OperationalStateClusterOperationalErrorEvent(
    ChipStructs.OperationalStateClusterErrorStateStruct errorState
  ) {
    this.errorState = errorState;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("OperationalStateClusterOperationalErrorEvent {\n");
    output.append("\terrorState: ");
    output.append(errorState);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class OperationalStateClusterOperationCompletionEvent {
  public Integer completionErrorCode;
  public @Nullable Optional<Long> totalOperationalTime;
  public @Nullable Optional<Long> pausedTime;
  public OperationalStateClusterOperationCompletionEvent(
    Integer completionErrorCode,
    @Nullable Optional<Long> totalOperationalTime,
    @Nullable Optional<Long> pausedTime
  ) {
    this.completionErrorCode = completionErrorCode;
    this.totalOperationalTime = totalOperationalTime;
    this.pausedTime = pausedTime;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("OperationalStateClusterOperationCompletionEvent {\n");
    output.append("\tcompletionErrorCode: ");
    output.append(completionErrorCode);
    output.append("\n");
    output.append("\ttotalOperationalTime: ");
    output.append(totalOperationalTime);
    output.append("\n");
    output.append("\tpausedTime: ");
    output.append(pausedTime);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class RvcOperationalStateClusterOperationalErrorEvent {
  public ChipStructs.RvcOperationalStateClusterErrorStateStruct errorState;
  public RvcOperationalStateClusterOperationalErrorEvent(
    ChipStructs.RvcOperationalStateClusterErrorStateStruct errorState
  ) {
    this.errorState = errorState;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("RvcOperationalStateClusterOperationalErrorEvent {\n");
    output.append("\terrorState: ");
    output.append(errorState);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class RvcOperationalStateClusterOperationCompletionEvent {
  public Integer completionErrorCode;
  public @Nullable Optional<Long> totalOperationalTime;
  public @Nullable Optional<Long> pausedTime;
  public RvcOperationalStateClusterOperationCompletionEvent(
    Integer completionErrorCode,
    @Nullable Optional<Long> totalOperationalTime,
    @Nullable Optional<Long> pausedTime
  ) {
    this.completionErrorCode = completionErrorCode;
    this.totalOperationalTime = totalOperationalTime;
    this.pausedTime = pausedTime;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("RvcOperationalStateClusterOperationCompletionEvent {\n");
    output.append("\tcompletionErrorCode: ");
    output.append(completionErrorCode);
    output.append("\n");
    output.append("\ttotalOperationalTime: ");
    output.append(totalOperationalTime);
    output.append("\n");
    output.append("\tpausedTime: ");
    output.append(pausedTime);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class DoorLockClusterDoorLockAlarmEvent {
  public Integer alarmCode;
  public DoorLockClusterDoorLockAlarmEvent(
    Integer alarmCode
  ) {
    this.alarmCode = alarmCode;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("DoorLockClusterDoorLockAlarmEvent {\n");
    output.append("\talarmCode: ");
    output.append(alarmCode);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class DoorLockClusterDoorStateChangeEvent {
  public Integer doorState;
  public DoorLockClusterDoorStateChangeEvent(
    Integer doorState
  ) {
    this.doorState = doorState;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("DoorLockClusterDoorStateChangeEvent {\n");
    output.append("\tdoorState: ");
    output.append(doorState);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class DoorLockClusterLockOperationEvent {
  public Integer lockOperationType;
  public Integer operationSource;
  public @Nullable Integer userIndex;
  public @Nullable Integer fabricIndex;
  public @Nullable Long sourceNode;
  public @Nullable Optional<ArrayList<ChipStructs.DoorLockClusterCredentialStruct>> credentials;
  public DoorLockClusterLockOperationEvent(
    Integer lockOperationType,
    Integer operationSource,
    @Nullable Integer userIndex,
    @Nullable Integer fabricIndex,
    @Nullable Long sourceNode,
    @Nullable Optional<ArrayList<ChipStructs.DoorLockClusterCredentialStruct>> credentials
  ) {
    this.lockOperationType = lockOperationType;
    this.operationSource = operationSource;
    this.userIndex = userIndex;
    this.fabricIndex = fabricIndex;
    this.sourceNode = sourceNode;
    this.credentials = credentials;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("DoorLockClusterLockOperationEvent {\n");
    output.append("\tlockOperationType: ");
    output.append(lockOperationType);
    output.append("\n");
    output.append("\toperationSource: ");
    output.append(operationSource);
    output.append("\n");
    output.append("\tuserIndex: ");
    output.append(userIndex);
    output.append("\n");
    output.append("\tfabricIndex: ");
    output.append(fabricIndex);
    output.append("\n");
    output.append("\tsourceNode: ");
    output.append(sourceNode);
    output.append("\n");
    output.append("\tcredentials: ");
    output.append(credentials);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class DoorLockClusterLockOperationErrorEvent {
  public Integer lockOperationType;
  public Integer operationSource;
  public Integer operationError;
  public @Nullable Integer userIndex;
  public @Nullable Integer fabricIndex;
  public @Nullable Long sourceNode;
  public @Nullable Optional<ArrayList<ChipStructs.DoorLockClusterCredentialStruct>> credentials;
  public DoorLockClusterLockOperationErrorEvent(
    Integer lockOperationType,
    Integer operationSource,
    Integer operationError,
    @Nullable Integer userIndex,
    @Nullable Integer fabricIndex,
    @Nullable Long sourceNode,
    @Nullable Optional<ArrayList<ChipStructs.DoorLockClusterCredentialStruct>> credentials
  ) {
    this.lockOperationType = lockOperationType;
    this.operationSource = operationSource;
    this.operationError = operationError;
    this.userIndex = userIndex;
    this.fabricIndex = fabricIndex;
    this.sourceNode = sourceNode;
    this.credentials = credentials;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("DoorLockClusterLockOperationErrorEvent {\n");
    output.append("\tlockOperationType: ");
    output.append(lockOperationType);
    output.append("\n");
    output.append("\toperationSource: ");
    output.append(operationSource);
    output.append("\n");
    output.append("\toperationError: ");
    output.append(operationError);
    output.append("\n");
    output.append("\tuserIndex: ");
    output.append(userIndex);
    output.append("\n");
    output.append("\tfabricIndex: ");
    output.append(fabricIndex);
    output.append("\n");
    output.append("\tsourceNode: ");
    output.append(sourceNode);
    output.append("\n");
    output.append("\tcredentials: ");
    output.append(credentials);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class DoorLockClusterLockUserChangeEvent {
  public Integer lockDataType;
  public Integer dataOperationType;
  public Integer operationSource;
  public @Nullable Integer userIndex;
  public @Nullable Integer fabricIndex;
  public @Nullable Long sourceNode;
  public @Nullable Integer dataIndex;
  public DoorLockClusterLockUserChangeEvent(
    Integer lockDataType,
    Integer dataOperationType,
    Integer operationSource,
    @Nullable Integer userIndex,
    @Nullable Integer fabricIndex,
    @Nullable Long sourceNode,
    @Nullable Integer dataIndex
  ) {
    this.lockDataType = lockDataType;
    this.dataOperationType = dataOperationType;
    this.operationSource = operationSource;
    this.userIndex = userIndex;
    this.fabricIndex = fabricIndex;
    this.sourceNode = sourceNode;
    this.dataIndex = dataIndex;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("DoorLockClusterLockUserChangeEvent {\n");
    output.append("\tlockDataType: ");
    output.append(lockDataType);
    output.append("\n");
    output.append("\tdataOperationType: ");
    output.append(dataOperationType);
    output.append("\n");
    output.append("\toperationSource: ");
    output.append(operationSource);
    output.append("\n");
    output.append("\tuserIndex: ");
    output.append(userIndex);
    output.append("\n");
    output.append("\tfabricIndex: ");
    output.append(fabricIndex);
    output.append("\n");
    output.append("\tsourceNode: ");
    output.append(sourceNode);
    output.append("\n");
    output.append("\tdataIndex: ");
    output.append(dataIndex);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class UnitTestingClusterTestEventEvent {
  public Integer arg1;
  public Integer arg2;
  public Boolean arg3;
  public ChipStructs.UnitTestingClusterSimpleStruct arg4;
  public ArrayList<ChipStructs.UnitTestingClusterSimpleStruct> arg5;
  public ArrayList<Integer> arg6;
  public UnitTestingClusterTestEventEvent(
    Integer arg1,
    Integer arg2,
    Boolean arg3,
    ChipStructs.UnitTestingClusterSimpleStruct arg4,
    ArrayList<ChipStructs.UnitTestingClusterSimpleStruct> arg5,
    ArrayList<Integer> arg6
  ) {
    this.arg1 = arg1;
    this.arg2 = arg2;
    this.arg3 = arg3;
    this.arg4 = arg4;
    this.arg5 = arg5;
    this.arg6 = arg6;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("UnitTestingClusterTestEventEvent {\n");
    output.append("\targ1: ");
    output.append(arg1);
    output.append("\n");
    output.append("\targ2: ");
    output.append(arg2);
    output.append("\n");
    output.append("\targ3: ");
    output.append(arg3);
    output.append("\n");
    output.append("\targ4: ");
    output.append(arg4);
    output.append("\n");
    output.append("\targ5: ");
    output.append(arg5);
    output.append("\n");
    output.append("\targ6: ");
    output.append(arg6);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
public static class UnitTestingClusterTestFabricScopedEventEvent {
  public Integer fabricIndex;
  public UnitTestingClusterTestFabricScopedEventEvent(
    Integer fabricIndex
  ) {
    this.fabricIndex = fabricIndex;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    output.append("UnitTestingClusterTestFabricScopedEventEvent {\n");
    output.append("\tfabricIndex: ");
    output.append(fabricIndex);
    output.append("\n");
    output.append("}\n");
    return output.toString();
  }
}
}

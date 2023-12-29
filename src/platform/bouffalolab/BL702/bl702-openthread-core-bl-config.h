/*
 *  Copyright (c) 2016, The OpenThread Authors.
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. Neither the name of the copyright holder nor the
 *     names of its contributors may be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 *  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 *  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 *  ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 *  LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 *  SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 *  INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 *  CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 *  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *  POSSIBILITY OF SUCH DAMAGE.
 */

#ifndef OPENTHREAD_CORE_BL702_CONFIG_H_
#define OPENTHREAD_CORE_BL702_CONFIG_H_

/**
 * @def OPENTHREAD_CONFIG_NCP_HDLC_ENABLE
 *
 * Define to 1 to enable NCP HDLC support.
 *
 */
#ifndef OPENTHREAD_CONFIG_NCP_HDLC_ENABLE
#define OPENTHREAD_CONFIG_NCP_HDLC_ENABLE 0
#endif

/**
 * @def OPENTHREAD_CONFIG_PLATFORM_FLASH_API_ENABLE
 *
 * Define to 1 to enable otPlatFlash* APIs to support non-volatile storage.
 *
 * When defined to 1, the platform MUST implement the otPlatFlash* APIs instead of the otPlatSettings* APIs.
 *
 */
#define OPENTHREAD_CONFIG_PLATFORM_FLASH_API_ENABLE 0

#define OPENTHREAD_RADIO 0

#ifndef LMAC154_RADIO_RECEIVE_SENSITIVITY
#define LMAC154_RADIO_RECEIVE_SENSITIVITY -103
#endif

#ifndef OPENTHREAD_CONFIG_PLATFORM_XTAL_ACCURACY
#define OPENTHREAD_CONFIG_PLATFORM_XTAL_ACCURACY 40
#endif

#define OPENTHREAD_CONFIG_MAC_SOFTWARE_ACK_TIMEOUT_ENABLE 0
#define OPENTHREAD_CONFIG_MAC_SOFTWARE_RETRANSMIT_ENABLE 1
#define OPENTHREAD_CONFIG_MAC_SOFTWARE_CSMA_BACKOFF_ENABLE 0
#define OPENTHREAD_CONFIG_MAC_SOFTWARE_TX_SECURITY_ENABLE 0
#define OPENTHREAD_CONFIG_MAC_SOFTWARE_TX_TIMING_ENABLE 0
#define OPENTHREAD_CONFIG_MAC_SOFTWARE_ENERGY_SCAN_ENABLE 1

#define OPENTHREAD_CONFIG_PLATFORM_USEC_TIMER_ENABLE 1

#define OPENTHREAD_CONFIG_HEAP_EXTERNAL_ENABLE 1

#define OPENTHREAD_CONFIG_IP6_SLAAC_ENABLE 1
#define OPENTHREAD_CONFIG_ECDSA_ENABLE 1
#define OPENTHREAD_CONFIG_SRP_CLIENT_ENABLE 1
#define OPENTHREAD_CONFIG_DNS_CLIENT_ENABLE 1
#define OPENTHREAD_CONFIG_DNS_CLIENT_SERVICE_DISCOVERY_ENABLE 1

#define OPENTHREAD_CONFIG_MLE_LINK_METRICS_SUBJECT_ENABLE 0
#define OPENTHREAD_CONFIG_MAC_CSL_RECEIVER_ENABLE 0
// #define OPENTHREAD_CONFIG_MAC_CSL_TRANSMITTER_ENABLE 0
#define OPENTHREAD_CONFIG_TCP_ENABLE 0
#define OPENTHREAD_CONFIG_TLS_ENABLE 0

#define OPENTHREAD_CONFIG_PING_SENDER_ENABLE 1
// #define OPENTHREAD_CONFIG_LOG_LEVEL OT_LOG_LEVEL_DEBG

#define OPENTHREAD_ENABLE_VENDOR_EXTENSION 0
#define OPENTHREAD_EXAMPLES_SIMULATION 0

#ifndef OPENTHREAD_CONFIG_DIAG_ENABLE
#define OPENTHREAD_CONFIG_DIAG_ENABLE 0
#endif

#define ENABLE_OPENTHREAD_BORDER_ROUTER 0

#endif // OPENTHREAD_CORE_BL702_CONFIG_H_

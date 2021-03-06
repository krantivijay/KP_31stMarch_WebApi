/*
Copyright (c) Microsoft
All Rights Reserved
Apache 2.0 License
 
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
 
     http://www.apache.org/licenses/LICENSE-2.0
 
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

See the Apache Version 2.0 License for specific language governing permissions and limitations under the License.
 */

package com.microsoft.aad.taskapplication.helpers;

import com.microsoft.aad.adal.AuthenticationResult;

public class
Constants {

    public static final String SDK_VERSION = "1.0";
//
    /**
     * UTF-8 encoding
     */
    public static final String UTF8_ENCODING = "UTF-8";

    public static final String HEADER_AUTHORIZATION = "Authorization";

    public static final String HEADER_AUTHORIZATION_VALUE_PREFIX = "Bearer ";

    // -------------------------------AAD
    // PARAMETERS----------------------------------
    public static String AUTHORITY_URL = "https://login.microsoftonline.com/kencloudb2c.onmicrosoft.com/oauth2/v2.0/authorize?";
    public static String CLIENT_ID = "1152da34-6983-4706-940a-68458aa65af1";
    public static String[] SCOPES = {"1152da34-6983-4706-940a-68458aa65af1"};
    public static String[] ADDITIONAL_SCOPES = {""};
    public static String REDIRECT_URL = "urn:ietf:wg:oauth:2.0:oob";
    public static String CORRELATION_ID = "";
    public static String USER_HINT = "";
    public static String EXTRA_QP = "";
    public static String FB_POLICY = "B2C_1_1789682321300192";
//    public static String EMAIL_SIGNIN_POLICY = "B2C_1_KenCloudCustomerSignIn";
    public static String EMAIL_SIGNIN_POLICY = "B2C_1_KenCenteralSignIn";
    public static String EMAIL_SIGNUP_POLICY = "B2C_1_KenCenterlSigUp";
    public static boolean FULL_SCREEN = true;
    public static AuthenticationResult CURRENT_RESULT = null;
    // Endpoint we are targeting for the deployed WebAPI service
    public static String SERVICE_URL = "http://testsuchismita.azurewebsites.net/";

    // ------------------------------------------------------------------------------------------

    static final String TABLE_WORKITEM = "WorkItem";

    public static final String SHARED_PREFERENCE_NAME = "com.example.com.test.settings";

    public static final String KEY_NAME_ASK_BROKER_INSTALL = "test.settings.ask.broker";
    public static final String KEY_NAME_CHECK_BROKER = "test.settings.check.broker";

}

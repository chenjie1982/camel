/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.box.springboot;

import java.util.Map;
import com.box.boxjavalibv2.BoxConnectionManagerBuilder;
import com.box.boxjavalibv2.IBoxConfig;
import com.box.boxjavalibv2.authorization.IAuthSecureStorage;
import com.box.boxjavalibv2.authorization.OAuthRefreshListener;
import org.apache.camel.component.box.internal.BoxApiName;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * For uploading downloading and managing files folders groups collaborations
 * etc on box DOT com.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.box")
public class BoxComponentConfiguration {

    /**
     * To use the shared configuration
     */
    private BoxConfigurationNestedConfiguration configuration;

    public BoxConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            BoxConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public static class BoxConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.box.BoxConfiguration.class;
        /**
         * What kind of operation to perform
         */
        private BoxApiName apiName;
        /**
         * What sub operation to use for the selected operation
         */
        private String methodName;
        /**
         * Box application client ID
         */
        private String clientId;
        /**
         * Box application client secret
         */
        private String clientSecret;
        /**
         * OAuth Secure Storage callback, can be used to provide and or save
         * OAuth tokens. The callback may return null on first call to allow the
         * component to login and authorize application and obtain an OAuth
         * token, which can then be saved in the secure storage. For the
         * component to be able to create a token automatically a user password
         * must be provided.
         */
        @NestedConfigurationProperty
        private IAuthSecureStorage authSecureStorage;
        /**
         * Box user name, MUST be provided
         */
        private String userName;
        /**
         * Box user password, MUST be provided if authSecureStorage is not set,
         * or returns null on first call
         */
        private String userPassword;
        /**
         * OAuth listener for token updates, if the Camel application needs to
         * use the access token outside the route
         */
        @NestedConfigurationProperty
        private OAuthRefreshListener refreshListener;
        /**
         * Flag to revoke OAuth refresh token on route shutdown, default false.
         * Will require a fresh refresh token on restart using either a custom
         * IAuthSecureStorage or automatic component login by providing a user
         * password
         */
        private Boolean revokeOnShutdown;
        /**
         * Box shared link for shared endpoints, can be a link for a shared
         * comment, file or folder
         */
        private String sharedLink;
        /**
         * Password associated with the shared link, MUST be provided with
         * sharedLink
         */
        private String sharedPassword;
        /**
         * Custom Box SDK configuration, not required normally
         */
        @NestedConfigurationProperty
        private IBoxConfig boxConfig;
        /**
         * Custom Box connection manager builder, used to override default
         * settings like max connections for underlying HttpClient.
         */
        @NestedConfigurationProperty
        private BoxConnectionManagerBuilder connectionManagerBuilder;
        /**
         * Custom HTTP params for settings like proxy host
         */
        private Map httpParams;
        /**
         * To configure security using SSLContextParameters.
         */
        @NestedConfigurationProperty
        private SSLContextParameters sslContextParameters;
        /**
         * Amount of time the component will wait for a response from Box.com,
         * default is 30 seconds
         */
        private Integer loginTimeout;

        public BoxApiName getApiName() {
            return apiName;
        }

        public void setApiName(BoxApiName apiName) {
            this.apiName = apiName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public String getClientSecret() {
            return clientSecret;
        }

        public void setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
        }

        public IAuthSecureStorage getAuthSecureStorage() {
            return authSecureStorage;
        }

        public void setAuthSecureStorage(IAuthSecureStorage authSecureStorage) {
            this.authSecureStorage = authSecureStorage;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserPassword() {
            return userPassword;
        }

        public void setUserPassword(String userPassword) {
            this.userPassword = userPassword;
        }

        public OAuthRefreshListener getRefreshListener() {
            return refreshListener;
        }

        public void setRefreshListener(OAuthRefreshListener refreshListener) {
            this.refreshListener = refreshListener;
        }

        public Boolean getRevokeOnShutdown() {
            return revokeOnShutdown;
        }

        public void setRevokeOnShutdown(Boolean revokeOnShutdown) {
            this.revokeOnShutdown = revokeOnShutdown;
        }

        public String getSharedLink() {
            return sharedLink;
        }

        public void setSharedLink(String sharedLink) {
            this.sharedLink = sharedLink;
        }

        public String getSharedPassword() {
            return sharedPassword;
        }

        public void setSharedPassword(String sharedPassword) {
            this.sharedPassword = sharedPassword;
        }

        public IBoxConfig getBoxConfig() {
            return boxConfig;
        }

        public void setBoxConfig(IBoxConfig boxConfig) {
            this.boxConfig = boxConfig;
        }

        public BoxConnectionManagerBuilder getConnectionManagerBuilder() {
            return connectionManagerBuilder;
        }

        public void setConnectionManagerBuilder(
                BoxConnectionManagerBuilder connectionManagerBuilder) {
            this.connectionManagerBuilder = connectionManagerBuilder;
        }

        public Map getHttpParams() {
            return httpParams;
        }

        public void setHttpParams(Map httpParams) {
            this.httpParams = httpParams;
        }

        public SSLContextParameters getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(
                SSLContextParameters sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }

        public Integer getLoginTimeout() {
            return loginTimeout;
        }

        public void setLoginTimeout(Integer loginTimeout) {
            this.loginTimeout = loginTimeout;
        }
    }
}
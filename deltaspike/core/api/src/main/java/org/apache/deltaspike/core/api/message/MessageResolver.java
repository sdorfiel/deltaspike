/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.deltaspike.core.api.message;

import java.io.Serializable;
import java.util.Locale;

/**
 * Implementations have to resolve the text stored for a given key in the message-source they are aware of.
 * Implementations should always be &#064;Dependent scoped!
 */
public interface MessageResolver extends Serializable
{
    String MISSING_RESOURCE_MARKER = "???";

    /**
     * @param messageTemplate the message key (or in-lined text) of the current message
     * @return the final but not interpolated message text
     */
    String getMessage(String messageTemplate);

    /**
     * Initialize the MessageResolver with the message bundle and Locale
     * which should be used.
     * TODO review! It might be better to pass a whole configuration
     */
    void initialize(String messageBundleName, Locale locale);
}

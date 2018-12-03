/*
 * Copyright (c) Bosch Software Innovations GmbH 2018.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.eclipse.sw360.antenna.model.reporting;

import java.util.List;

public abstract class ProcessingMessageWithPayload extends ProcessingMessage {

    public ProcessingMessageWithPayload(MessageType type, String message) {
        super(type, message);
    }

    public ProcessingMessageWithPayload(MessageType type, String identifier, String message) {
        super(type, identifier, message);
    }

    public abstract List<String> getPayload();
}

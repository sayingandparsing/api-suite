/*
 * Copyright 2015 Cycorp, Inc..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cyc.session.compatibility;

/*
 * #%L
 * File: NotCycMaintRequirement.java
 * Project: Session API Implementation
 * %%
 * Copyright (C) 2013 - 2015 Cycorp, Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.cyc.session.CycServerReleaseType;
import com.cyc.session.CycSession;
import com.cyc.session.SessionCommandException;
import com.cyc.session.SessionCommunicationException;
import com.cyc.session.exception.UnsupportedCycOperationException;

/**
 *
 * @author nwinant
 */
public class NotCycMaintRequirement implements CycSessionRequirement {
  
  public static final NotCycMaintRequirement NOT_CYC_MAINT = new NotCycMaintRequirement();
  
  final private String msg;
  
  public NotCycMaintRequirement(String msg) {
    this.msg = msg;
  }
  
  public NotCycMaintRequirement() {
    this("This feature is not supported in Cyc Maint.");
  }
  
  @Override
  public boolean isCompatible(CycSession session) throws SessionCommunicationException, SessionCommandException {
    return !CycServerReleaseType.MAINT.equals(
            session.getServerInfo().getSystemReleaseType());
  }
  
  @Override
  public void testCompatibility(CycSession session) throws UnsupportedCycOperationException, SessionCommunicationException, SessionCommandException {
    if (!isCompatible(session)) {
      throw new UnsupportedCycOperationException(msg);
    }
  }
  
}

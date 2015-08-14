package com.cyc.baseclient.subl.variables;

/*
 * #%L
 * File: SubLGlobalVariablesTest.java
 * Project: Base Client
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

import com.cyc.base.CycAccess;
import com.cyc.base.CycAccessManager;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.baseclient.subl.SubLGlobalVariable;
import static com.cyc.baseclient.subl.variables.SubLGlobalVariables.*;
import com.cyc.session.SessionApiException;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SubLGlobalVariablesTest {
  
  private CycAccess access;
  
  @Before
  public void setUp() throws SessionApiException {
    access = CycAccessManager.getCurrentAccess();
  }
  
  
  // Tests
  
  @Test
  public void testExistence() throws Exception {
    assertVariableExistsAndIsBound("*KE-PURPOSE*", KE_PURPOSE);
    assertVariableExistsAndIsBound("*THE-CYCLIST*", THE_CYCLIST);
    assertVariableExistsAndIsBound("*REQUIRE-CASE-INSENSITIVE-NAME-UNIQUENESS*", REQUIRE_CASE_INSENSITIVE_NAME_UNIQUENESS);
    assertVariableExistsAndIsBound("*SYSTEM-CODE-VERSION-STRING*", SYSTEM_CODE_VERSION_STRING);
    assertVariableExistsAndIsBound("*SYSTEM-CODE-RELEASE-STRING*", SYSTEM_CODE_RELEASE_STRING);
  }
  
  @Test
  public void testInequality() throws Exception {
    assertNotEquals(KE_PURPOSE, THE_CYCLIST);
    assertNotEquals(KE_PURPOSE, REQUIRE_CASE_INSENSITIVE_NAME_UNIQUENESS);
    assertNotEquals(THE_CYCLIST, REQUIRE_CASE_INSENSITIVE_NAME_UNIQUENESS);
  }
  
  
  // Protected
  
  protected void assertVariableExistsAndIsBound(String name, SubLGlobalVariable variable) throws CycApiException, CycConnectionException {
    assertEquals(name, variable.toString());
    assertEquals(variable, variable);
    assertTrue(variable.isBound(access));
  }

}

package com.cyc.base.cycobject;

/*
 * #%L
 * File: CycVariable.java
 * Project: Base Client
 * %%
 * Copyright (C) 2013 - 2014 Cycorp, Inc.
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

import java.io.Serializable;

/**
 *
 * @author nwinant
 */
public interface CycVariable extends CycObject, Serializable {
  
  /**
   * Returns the Cyc representation of the <tt>CycVariable</tt>
   *
   * @return the Cyc representation of the <tt>CycVariable</tt> as a
   * <tt>String</tt> prefixed by "?"
   */
  public String cyclify();

  public boolean isDontCareVariable();

  /**
   * Returns whether this is an HL variable.
   *
   * @return whether this is an HL variable
   */
  public boolean isHLVariable();

  /**
   * Returns whether this is a meta variable.
   *
   * @return whether this is a meta variable
   */
  public boolean isMetaVariable();

  /**
   * Is <code>name</code> a valid Cyc variable name?
   */
  public boolean isValidName(String name);

  public String toCanonicalString();
  
  public String getName();
}
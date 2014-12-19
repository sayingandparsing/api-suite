package com.cyc.base.cycobject;

/*
 * #%L
 * File: DenotationalTerm.java
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

/** 
 * <P>DenotationalTerm is designed to...
 *
 * @author baxter, Jul 6, 2009, 10:28:22 AM
 * @version $Id: DenotationalTerm.java 155483 2014-12-10 21:56:51Z nwinant $
 */
public interface DenotationalTerm extends CycObject {

  public boolean equalsAtEL(Object id);
  
}
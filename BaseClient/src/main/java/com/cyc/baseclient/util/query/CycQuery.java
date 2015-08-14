package com.cyc.baseclient.util.query;

import com.cyc.query.InferenceStatus;

/*
 * #%L
 * File: CycQuery.java
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

/**
 * @version $Id: CycQuery.java 158569 2015-05-19 21:51:08Z daves $
 * @author  mreimers
 */
public interface CycQuery extends Query {
  
  public InferenceStatus getInferenceStatus();
}

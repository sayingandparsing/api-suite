package com.cyc.kb.wrapper;

/*
 * #%L
 * File: SymbolWrapper.java
 * Project: Core API
 * %%
 * Copyright (C) 2015 - 2018 Cycorp, Inc
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
import com.cyc.kb.Symbol;

/**
 * An abstract base class for implementing Symbols per the decorator pattern. To use, extend this
 * class and implement the {@link #wrapped() } method to return the wrapped object.
 *
 * @author nwinant
 */
public abstract class SymbolWrapper extends KbObjectWrapper implements Symbol {

  //====|    Abstract methods    |================================================================//
  
  @Override
  protected abstract Symbol wrapped();

}

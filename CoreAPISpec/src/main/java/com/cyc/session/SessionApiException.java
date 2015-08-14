package com.cyc.session;

/*
 * #%L
 * File: SessionApiException.java
 * Project: Core API Specification
 * %%
 * Copyright (C) 2013 - 2015 Cycorp, Inc
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
 * SessionApiException is the base exception which indicates that an application library has 
 * encountered a problem in interacting with a Cyc server. Subclasses of CycSessionException 
 * indicate specific types of issues, such as configuration issues, communications issues, etc.
 * 
 * @see com.cyc.session.exception.SessionApiRuntimeException
 * @author nwinant
 */
public class SessionApiException extends Exception {
  
  /**
   * Constructs a new exception with no specified message.
   */
  public SessionApiException() {
    super();
  }
  
  /**
   * Constructs a new exception with a specified message.
   * @param message a message describing the exception.
   */
  public SessionApiException(String message) {
    super(message);
  }
  
  /**
   * Constructs a new exception with a specified message and throwable.
   * @param message the message string
   * @param cause the Throwable that caused this exception
   */
  public SessionApiException(String message, Throwable cause) {
    super(message, cause);
  }
  
  /**
   * Constructs a new exception with a specified throwable.
   * @param cause the throwable that caused this exception
   */
  public SessionApiException(Throwable cause) {
    super(cause);
  }
}

/**
 * 
 */
package org.jutility.events;

/*
 * #%L
 * jutility-incubation
 * %%
 * Copyright (C) 2013 - 2014 jutility.org
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
 * The <CODE>IPropertyChangeVetoException</CODE> models an exception that is thrown
 * when a change to a piece of data is vetoed.
 * 
 * It provides access to the vetoed event.
 * 
 * @author Peter J. Radics
 * @version 1.0
 * 
 */
public interface IPropertyChangeVetoException {


    /**
     * Getter for the vetoed event.
     * 
     * @return The event that was vetoed.
     */
    public IPropertyChangeEvent getVetoedEvent();
}

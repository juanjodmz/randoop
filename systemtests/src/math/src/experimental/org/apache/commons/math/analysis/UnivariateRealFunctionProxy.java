/*
 * 
 * Copyright (c) 2003-2004 The Apache Software Foundation. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *  
 */

package org.apache.commons.math.analysis;

/**
 * @todo add javadoc comment
 * @version $Revision: 1.4 $ $Date: 2004/02/18 03:24:19 $
 */
public abstract class UnivariateRealFunctionProxy
    implements UnivariateRealFunction {

    private UnivariateRealFunction function;
    
    /**
     * @todo add javadoc comment
     */
    public UnivariateRealFunctionProxy(UnivariateRealFunction function) {
        super();
        setFunction(function);
    }

    /**
     * @todo add javadoc comment
     */
    protected UnivariateRealFunction getFunction() {
        return function;
    }

    /**
     * @todo add javadoc comment
     */
    private void setFunction(UnivariateRealFunction function) {
        this.function = function;
    }

}
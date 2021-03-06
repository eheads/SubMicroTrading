/*******************************************************************************
 * Copyright (c) 2015 Low Latency Trading Limited  :  Author Richard Rose
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at	http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing,  software distributed under the License 
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *******************************************************************************/
package com.rr.core.codec;

import com.rr.core.lang.ZString;

public class RuntimeDecodingException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    
    private ZString _fixMsg = null;

    public RuntimeDecodingException( String message, Throwable cause ) {
        super( message, cause );
    }

    public RuntimeDecodingException( String message ) {
        super( message );
    }

    public RuntimeDecodingException( String message, ZString fixMsg ) {
        super( message );
        
        _fixMsg = fixMsg;
    }
    
    // @TODO remove GC from exceptions
    public RuntimeDecodingException( ZString errMsg ) {
        super( errMsg.toString() );
    }

    public ZString getFixMsg() {
        return _fixMsg;
    }
}

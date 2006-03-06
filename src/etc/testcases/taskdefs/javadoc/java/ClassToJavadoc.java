/*
 * Copyright 2006 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package etc.testcases.taskdefs.javadoc.java;

/**
 * This is a simple class to provide grist for the javadoc mill
 * while testing it.
 */
public class ClassToJavadoc {
    /**
     * @param anArgument A String that is ignored
     */
    public void methodToJavadoc(String anArgument) { }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString() { return this.getClass().getName(); }
    
    /**
     * @return An arbitrary string.
     */
    public String anotherString() {return "An arbitrary string.";}
}
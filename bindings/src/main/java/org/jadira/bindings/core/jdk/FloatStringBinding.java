/*
 *  Copyright 2010, 2011 Chris Pheby
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
 */
package org.jadira.bindings.core.jdk;

import org.jadira.bindings.core.api.Binding;

/**
 * Binds a Float to a String
 */
public class FloatStringBinding extends AbstractStringBinding<Float> implements Binding<Float, String> {

    /**
     * {@inheritDoc}
     */
    @Override
    public Float unmarshal(String object) {
        return Float.valueOf(Float.parseFloat(object));
    }

    /**
     * {@inheritDoc}
     */
    /* @Override */
	public Class<Float> getBoundClass() {
		return Float.class;
	}
}

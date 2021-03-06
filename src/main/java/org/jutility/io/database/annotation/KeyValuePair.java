package org.jutility.io.database.annotation;

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
 * The generic <CODE>KeyValuePair</CODE> class provides a pairwise mapping
 * between keys and values.
 * 
 * @param <KEY>
 *            The key type.
 * @param <VALUE>
 *            The value type.
 * @author Peter J. Radics
 * @version 0.1
 */
public class KeyValuePair<KEY, VALUE> {

    private final KEY key;

    private VALUE     value;


    /**
     * Returns the key.
     * 
     * @return the key.
     */
    public KEY getKey() {

        return key;
    }

    /**
     * Returns the value.
     * 
     * @return the value.
     */
    public VALUE getValue() {

        return value;
    }

    /**
     * Sets the value to the value provided.
     * 
     * @param value
     *            the new value.
     */
    public void setValue(VALUE value) {

        this.value = value;
    }


    /**
     * Creates a new instance of the <CODE>KeyValuePair</CODE> class with the
     * provided key.
     * 
     * @param key
     *            the key.
     */
    public KeyValuePair(KEY key) {

        this(key, null);
    }

    /**
     * Creates a new instance of the <CODE>KeyValuePair</CODE> class with the
     * provided key and value.
     * 
     * @param key
     *            the key.
     * @param value
     *            the value.
     */
    public KeyValuePair(KEY key, VALUE value) {

        if (key == null) {
            throw new IllegalArgumentException("Cannot create key-value pair "
                    + "without key!");
        }

        this.key = key;
        this.value = value;
    }


    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KeyValuePair<?, ?> other = (KeyValuePair<?, ?>) obj;

        if (this.getKey() != other.getKey()
                && (this.getKey() == null || !this.getKey().equals(
                        other.getKey()))) {
            return false;
        }
        if (this.getValue() != other.getValue()
                && (this.getValue() == null || !this.getValue().equals(
                        other.getValue()))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {

        int hash = 7;
        hash = 83 * hash
                + (this.getKey() != null ? this.getKey().hashCode() : 0);
        hash = 83 * hash
                + (this.getValue() != null ? this.getValue().hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {

        String string = this.getKey().toString() + ": ";
        if (this.getValue() != null) {
            string += this.getValue().toString();
        }
        else {
            string += "<null>";
        }
        return string;
    }


}

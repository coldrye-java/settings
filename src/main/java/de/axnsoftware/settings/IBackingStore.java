/*
 * Copyright 2013 axn software UG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.axnsoftware.settings;

import java.util.Set;
import java.util.prefs.BackingStoreException;

/**
 * The interface IBackingStore models a backing store which is responsible for
 * both retrieving configuration data from and persistently storing
 * configuration data to an underlying storage.
 *
 * @author Carsten Klein "cklein" <carsten.klein@axn-software.de>
 * @since 1.0.0
 */
public interface IBackingStore
{

    /**
     * Returns a copy of the loaded properties.
     *
     * This will throw an {@code IllegalStateException} if the properties have
     * not been loaded.
     *
     * @return the properties
     * @throws BackingStoreException
     */
    Object getProperties() throws BackingStoreException;

    /**
     * Deletes the properties. Depending on the implementation this could mean
     * that the file will be removed from the file system, or that the entries
     * in a registry will be removed.
     *
     * @throws BackingStoreException
     */
    void deleteProperties() throws BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @return the value or null
     * @throws BackingStoreException
     */
    Boolean getBoolean(final String key) throws BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @return the value or null
     */
    Byte getByte(final String key) throws BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @return the value or null
     * @throws BackingStoreException
     */
    Character getCharacter(final String key) throws BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @return the value or null
     * @throws BackingStoreException
     */
    Double getDouble(final String key) throws BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @return the value or null
     */
    Float getFloat(final String key) throws BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @return the value or null
     * @throws BackingStoreException
     */
    Integer getInteger(final String key) throws BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @return the value or null
     */
    Long getLong(final String key) throws BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @return the value or null
     * @throws BackingStoreException
     */
    Short getShort(final String key) throws BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @return the value or null
     */
    String getString(final String key) throws BackingStoreException;

    /**
     * Returns all available keys from the underlying properties object.
     *
     * @return all available keys in no specific order
     * @throws BackingStoreException
     */
    Set<String> keySet() throws BackingStoreException;

    /**
     * Loads the properties into memory.
     *
     * @throws BackingStoreException
     */
    void loadProperties() throws BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @param value
     * @throws BackingStoreException
     */
    void setBoolean(String key, Object value) throws BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @param value
     */
    void setByte(final String key, final Byte value) throws
            BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @param value
     * @throws BackingStoreException
     */
    void setCharacter(final String key, final Character value) throws
            BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @param value
     * @throws BackingStoreException
     */
    void setDouble(final String key, final Double value) throws
            BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @param value
     * @throws BackingStoreException
     */
    void setFloat(final String key, final Float value) throws
            BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @param value
     * @throws BackingStoreException
     */
    void setInteger(final String key, final Integer value) throws
            BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @param value
     * @throws BackingStoreException
     */
    void setLong(final String key, final Long value) throws
            BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @param value
     * @throws BackingStoreException
     */
    void setShort(final String key, final Short value) throws
            BackingStoreException;

    /**
     * Gets the value of the property identified by the specified {@code key}.
     *
     * @param key
     * @param value
     * @throws BackingStoreException
     */
    void setString(final String key, final String value) throws
            BackingStoreException;

    /**
     * Stored the properties and makes them permanent.
     *
     * @throws BackingStoreException
     */
    void storeProperties() throws BackingStoreException;
}

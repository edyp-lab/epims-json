/*
 * Copyright (C) 2021
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the CeCILL FREE SOFTWARE LICENSE AGREEMENT
 * ; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * CeCILL License V2.1 for more details.
 *
 * You should have received a copy of the CeCILL License
 * along with this program; If not, see <http://www.cecill.info/licences/Licence_CeCILL_V2.1-en.html>.
 */

package fr.edyp.epims.json;

import java.util.HashMap;

public class DatabaseVersionJson implements java.io.Serializable {

    private HashMap<String, Integer> versions;
    private HashMap<String, String> versionUserModifierMap;

    private int serverVersion;

    public DatabaseVersionJson() {
        versions = new HashMap();
        versionUserModifierMap = new HashMap();
    }

    public int getServerVersion() {
        return serverVersion;
    }
    public void setServerVersion(int serverVersion) {
        this.serverVersion = serverVersion;
    }

    public HashMap<String, Integer> getVersions() {
        return this.versions;
    }
    public void setVersions(HashMap<String, Integer> versions) {
        this.versions = versions;
    }

    public HashMap<String, String> getVersionUserModifierMap() {
        return this.versionUserModifierMap;
    }
    public void setVersionUserModifierMap(HashMap<String, String> versionUserModifierMap) {
        this.versionUserModifierMap = versionUserModifierMap;
    }


    public Integer bumpVersion(Class c, String login) {
        return bumpVersion(c.getSimpleName(), login);
    }
    public Integer bumpVersion(String classAsString, String login) {

        Integer version = versions.get(classAsString);
        if (version == null) {
            version = new Integer(1);
        } else {
            version = version +1;
        }
        versions.put(classAsString, version);
        versionUserModifierMap.put(classAsString, login);


        return version;
    }

    public Integer getVersion(Class c) {
        return (getVersion(c.getSimpleName()));
    }
    public Integer getVersion(String classAsString) {
        Integer version = versions.get(classAsString);
        if (version == null) {
            version = new Integer(0);
            versions.put(classAsString, version);
        }

        return version;
    }

    public String getLogin(Class c) {
        return (getLogin(c.getSimpleName()));
    }
    public String getLogin(String classAsString) {
        return versionUserModifierMap.get(classAsString);
    }

    public ClassVersionJson getClassVersion(Class c) {
        return getClassVersion(c.getSimpleName());
    }
    public ClassVersionJson getClassVersion(String classAsString) {
        Integer version = getVersion(classAsString);

        return new ClassVersionJson(classAsString, version);
    }

    public void setVersion(Class c, Integer version) {
        setVersion(c.getSimpleName(), version);
    }
    public void setVersion(String classAsString, Integer version) {
        versions.put(classAsString, version);
    }

}

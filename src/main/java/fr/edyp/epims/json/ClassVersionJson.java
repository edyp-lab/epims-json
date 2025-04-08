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


public class ClassVersionJson implements java.io.Serializable {

    private String classAsString;
    private Integer version;

    public ClassVersionJson() {
    }

    public ClassVersionJson(String classAsString, Integer version) {
        this.classAsString = classAsString;
        this.version = version;
    }

    public String getClassAsString() {
        return this.classAsString;
    }
    public void setClassAsString(String classAsString) {
        this.classAsString = classAsString;
    }

    public Integer getVersion() {
        return this.version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }

}

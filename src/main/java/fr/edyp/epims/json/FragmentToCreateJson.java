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

public class FragmentToCreateJson implements java.io.Serializable {

    private String parentSampleKey;
    private String name;
    private Float volume;
    private Float quantity;
    private String comment;
    private String description;

    public FragmentToCreateJson() {

    }

    public String getParentSampleKey() {
        return this.parentSampleKey;
    }
    public void setParentSampleKey(String parentSampleKey) {
        this.parentSampleKey = parentSampleKey;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Float getVolume() {
        return this.volume;
    }
    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Float getQuantity() {
        return this.quantity;
    }
    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getComment() {
        return this.comment;
    }
    public void setComment(String comment) {
        this.comment = description;
    }
}

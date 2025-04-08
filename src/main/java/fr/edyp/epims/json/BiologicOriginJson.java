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



public class BiologicOriginJson implements java.io.Serializable {

    private Integer id;

    private Integer sampleKind = null;
    private int sampleSpecies;
    private Integer sampleSubcellularLocalisation = null;
    private Integer sampleType = null;

    private String commentOrigin;


    public BiologicOriginJson() {
    }


    public BiologicOriginJson(Integer id, Integer sampleKind, int sampleSpecies,
                              Integer sampleSubcellularLocalisation, Integer sampleType,
                          String commentOrigin) {
        this.id = id;
        this.sampleKind = sampleKind;
        this.sampleSpecies = sampleSpecies;
        this.sampleSubcellularLocalisation = sampleSubcellularLocalisation;
        this.sampleType = sampleType;
        this.commentOrigin = commentOrigin;
    }


    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getSampleKind() {
        return this.sampleKind;
    }
    public void setSampleKind(Integer sampleKind) {
        this.sampleKind = sampleKind;
    }


    public int getSampleSpecies() {
        return this.sampleSpecies;
    }

    public void setSampleSpecies(int sampleSpecies) {
        this.sampleSpecies = sampleSpecies;
    }


    public Integer getSampleSubcellularLocalisation() {
        return this.sampleSubcellularLocalisation;
    }

    public void setSampleSubcellularLocalisation(Integer sampleSubcellularLocalisation) {
        this.sampleSubcellularLocalisation = sampleSubcellularLocalisation;
    }


    public Integer getSampleType() {
        return this.sampleType;
    }
    public void setSampleType(Integer sampleType) {
        this.sampleType = sampleType;
    }

    public String getCommentOrigin() {
        return this.commentOrigin;
    }
    public void setCommentOrigin(String commentOrigin) {
        this.commentOrigin = commentOrigin;
    }


}

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

import java.util.Date;

public class AnalysisMapJson implements java.io.Serializable {

    private int id;
    private int proAnalyseId;
    private int priceListId;
    private String studyRef;
    private Date saveDate;
    private Date exportDate;
    private String data;  // contains HashMap<String, String> as Json




    public AnalysisMapJson() {
    }

    public AnalysisMapJson( int id, int proAnalyseId, int priceListId, String studyRef, String data) {
        this.id = id;
        this.proAnalyseId = proAnalyseId;
        this.priceListId = priceListId;
        this.studyRef = studyRef;
        this.data = data;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProAnalyseId() {
        return this.proAnalyseId;
    }

    public void setProAnalyseId(int proAnalyseId) {
        this.proAnalyseId = proAnalyseId;
    }

    public int getPriceListId() {
        return this.priceListId;
    }

    public void setPriceListId(int priceListId) {
        this.priceListId = priceListId;
    }

    public String getStudyRef() {
        return this.studyRef;
    }

    public void setStudyRef(String studyRef) {
        this.studyRef = studyRef;
    }

    public Date getSaveDate() {
        return this.saveDate;
    }

    public void setSaveDate(Date saveDate) {
        this.saveDate = saveDate;
    }

    public Date getExportDate() {
        return this.exportDate;
    }

    public void setExportDate(Date exportDate) {
        this.exportDate = exportDate;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

}

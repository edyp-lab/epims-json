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

/**
 * Information associated with MGF in ePims datastore
 * This information is file name, size, date and also the acquisition name or study id
 *
 *  Used to retrieve mgf information from the server or to add new mgf and associated information to ePims db
 */
public class MgfFileInfoJson implements java.io.Serializable {

    private String fileName;
    private String directoryPath;
    private String acqName;
    private int studyId;
    private Date date;
    private Double sizeMo;

    public MgfFileInfoJson() {
    }


    public MgfFileInfoJson(String filename, String acqName, String directoryPath, int studyId, Date date, Double sizeMo) {
        this.fileName = filename;
        this.directoryPath = directoryPath;
        this.acqName = acqName;
        this.studyId = studyId;
        this.date = date;
        this.sizeMo = sizeMo;
    }


    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDirectoryPath() {
        return this.directoryPath;
    }

    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    public String getAcqName() {
        return acqName;
    }

    public void setAcqName(String acqName) {
        this.acqName = acqName;
    }

    public int getStudyId() {
        return this.studyId;
    }

    public void setStudyId(int studyId) {
        this.studyId = studyId;
    }

    public Double getSizeMo() {
        return sizeMo;
    }

    public void setSizeMo(Double sizeMo) {
        this.sizeMo = sizeMo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}

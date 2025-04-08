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

public class AcquisitionFileDescriptorJson implements java.io.Serializable {
    private String tag;
    private Date date;
    private ProtocolApplicationJson acquisition;
    private String path;
    private Double fileSize;
    private String fileName;

    public AcquisitionFileDescriptorJson() {
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ProtocolApplicationJson getAcquisition() {
        return this.acquisition;
    }

    public void setAcquisition(ProtocolApplicationJson acquisition) {
        this.acquisition = acquisition;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Double getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String file) {
        this.fileName = file;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
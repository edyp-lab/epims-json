/*
 * Copyright (C) 2021
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the CeCILL FREE SOFTWARE LICENSE AGREEMENT
 * ; either version 2.1 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * CeCILL License V2.1 for more details.
 *
 * You should have received a copy of the CeCILL License
 * along with this program;
 * If not, see <http://www.cecill.info/licences/Licence_CeCILL_V2.1-en.html>.
 */
package fr.edyp.epims.json;

import java.util.Date;

public class AnalyseProgressJson implements java.io.Serializable {

    private Date lastRobotDate;
    private Date lastAcquisitionDate;
    private int acquisitionsNumber;


    public AnalyseProgressJson() {
    }

    public AnalyseProgressJson(Date lastRobotDate, Date lastAcquisitionDate, int acquisitionsNumber) {
        this.lastRobotDate = lastRobotDate;
        this.lastAcquisitionDate = lastAcquisitionDate;
        this.acquisitionsNumber = acquisitionsNumber;
    }


    public Date getLastRobotDate() {
        return this.lastRobotDate;
    }
    public void setLastRobotDate(Date lastRobotDate) {
        this.lastRobotDate = lastRobotDate;
    }

    public Date getLastAcquisitionDate() {
        return this.lastAcquisitionDate;
    }
    public void setLastAcquisitionDate(Date lastAcquisitionDate) {
        this.lastAcquisitionDate = lastAcquisitionDate;
    }

    public int getAcquisitionsNumber() {
        return this.acquisitionsNumber;
    }
    public void setAcquisitionsNumber(int acquisitionsNumber) {
        this.acquisitionsNumber = acquisitionsNumber;
    }

}



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

public class ControlAcquisitionArchivableJson implements java.io.Serializable {

    public Integer month;
    public Integer year;
    public String instrument;

    public ControlAcquisitionArchivableJson() {

    }


    public ControlAcquisitionArchivableJson(Integer month, Integer year, String instrument) {
        this.month = month;
        this.year = year;
        this.instrument = instrument;
    }

    public Integer getMonth() {
        return this.month;
    }
    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return this.year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    public String getInstrument() {
        return this.instrument;
    }
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return instrument+":"+year+"-"+month;
    }
}

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


public class InstrumentJson implements java.io.Serializable, Comparable<InstrumentJson> {

    private int id;
    private String name;
    private String manufacturer;
    private String model;
    private String status;
    private Boolean isSpectrometer;


    public InstrumentJson() {
    }


    public InstrumentJson(int id, String name, String manufacturer, String model, String status, Boolean isSpectrometer) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.status = status;
        this.isSpectrometer = isSpectrometer;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isAvailable() {
        return this.status.equals("available");
    }

    public Boolean getIsSpectrometer() {
        return this.isSpectrometer;
    }
    public void setIsSpectrometer(Boolean confidential) {
        this.isSpectrometer = confidential;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(InstrumentJson o) {
        return name.compareToIgnoreCase(o.name);
    }
}

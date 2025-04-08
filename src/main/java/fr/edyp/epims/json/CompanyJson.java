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

public class CompanyJson implements java.io.Serializable, Comparable<CompanyJson>  {


    private String name;
    private String manager;
    private String address;
    private String postalCode;
    //private Set<Contact> contacts = new HashSet<Contact>(0);

    public CompanyJson() {
    }

    public CompanyJson(String name, String manager, String address, String postalCode) {
        this.name = name;
        this.manager = manager;
        this.address = address;
        this.postalCode = postalCode;
        //this.contacts = contacts;
    }


    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getManager() {
        return this.manager;
    }
    public void setManager(String manager) {
        this.manager = manager;
    }


    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public String getPostalCode() {
        return this.postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public int compareTo(CompanyJson o) {
        return name.compareToIgnoreCase(o.getName());
    }

}

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


public class AnalysePriceItemJson implements java.io.Serializable  {

    public final static String SDS_PRICE_LABEL = "SDS_PRICE_LABEL";
    public final static String MSMS_NONCOLLABORATIVE_PRICE_LABEL = "MSMS_NONCOLLABORATIVE_PRICE_LABEL";
    public final static String MSMS_COLLABORATIVE_PRICE_LABEL = "MSMS_COLLABORATIVE_PRICE_LABEL";
    public final static String MSMS_GRAALCOLLABORATIVE_PRICE_LABEL = "MSMS_GRAALCOLLABORATIVE_PRICE_LABEL";

    private int id;

    private float price;
    private String label;

    public AnalysePriceItemJson() {

    }

    public AnalysePriceItemJson(int id, float price, String label) {
        this.id = id;
        this.price = price;
        this.label = label;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}


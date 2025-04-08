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
import java.util.HashMap;

public class AnalysisPriceListJson implements java.io.Serializable, Comparable<AnalysisPriceListJson>  {

    private int id;

    private Date date;

    private HashMap<String, AnalysePriceItemJson> priceMap;


    public AnalysisPriceListJson() {
    }

    public AnalysisPriceListJson(int id, Date date, HashMap<String, AnalysePriceItemJson> priceMap) {
        this.id = id;
        this.date = date;
        this.priceMap = priceMap;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public HashMap<String, AnalysePriceItemJson> getPriceMap() {
        return this.priceMap;
    }

    public void setPriceMap(HashMap<String, AnalysePriceItemJson> priceMap) {
        this.priceMap = priceMap;
    }

    @Override
    public int compareTo(AnalysisPriceListJson o) {

        if (date.before(o.date)) {
            return -1;
        } else {
            return 1;
        }
    }
}


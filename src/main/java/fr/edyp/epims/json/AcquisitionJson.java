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

public class AcquisitionJson implements java.io.Serializable {

    public enum Nature {
        RESEARCH,
        CONTROL_INSTRUMENT,
        CONTROL_LC,
        BLANK;
    }

    private Integer id;
    private Integer instrumentId;
    private String nature;
    private Float durationMin;

    private String instrumentName;

    public AcquisitionJson() {
    }

    public AcquisitionJson(Integer id, Integer instrumentId, String nature, Float durationMin, String instrumentName) {
        this.id = id;
        this.instrumentId = instrumentId;
        this.nature = nature;
        this.durationMin = durationMin;
        this.instrumentName = instrumentName;
    }


    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

	public Integer getInstrumentId() {
		return this.instrumentId;
	}

	public void setInstrumentId(Integer instrumentId) {
		this.instrumentId = instrumentId;
	}


    public String getNature() {
        return this.nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Nature getNatureAsEnum() {
        return convertNatureToEnum(nature);
    }

    public Float getDurationMin() {
        return this.durationMin;
    }

    public void setDurationMin(Float durationMin) {
        this.durationMin = durationMin;
    }

    public String getInstrumentName() {
        return this.instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public static Nature convertNatureToEnum(String nature) {

        if (nature.equals("Recherche")) {
            return Nature.RESEARCH;
        }
        if (nature.equals("ControleInstrument")) {
            return Nature.CONTROL_INSTRUMENT;
        }
        if (nature.equals("ControleLC")) {
            return Nature.CONTROL_LC;
        }
        if (nature.equals("Blanc")) {
            return Nature.BLANK;
        }

        return null;

    }

    public static String convertNatureToString(Nature nature) {
        switch (nature) {
            case BLANK:
                return "Blanc";
            case CONTROL_INSTRUMENT:
                return "ControleInstrument";
            case CONTROL_LC:
                return "ControleLC";
            default:
                return "Recherche";
        }

    }

}

/*
 * Copyright (C) 2024
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * SingleCell CellenOne Run JSON model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellenOneRunJson implements Serializable {

    private String name;
    private ArrayList<String> sources = new ArrayList<>();
    private ArrayList<CellenOnePlateJson> plates = new ArrayList<>();
    private ArrayList<CellenOneSample> cellenOneRunSamples = new ArrayList<>();
    private Integer samplesCount;

    public CellenOneRunJson() {
    }

    public CellenOneRunJson(String name, ArrayList<String> sources, ArrayList<CellenOnePlateJson> plates, Integer samplesCount) {
        this(name, sources, plates, new ArrayList<>(), samplesCount);
    }

    public CellenOneRunJson(String name, ArrayList<String> sources, ArrayList<CellenOnePlateJson> plates, ArrayList<CellenOneSample> runSamples, Integer samplesCount) {
        this.name = name;
        this.sources = sources != null ? sources : new ArrayList<>();
        this.plates = plates != null ? plates : new ArrayList<>();
        this.cellenOneRunSamples = runSamples != null ? runSamples : new ArrayList<>();
        this.samplesCount = samplesCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSources() {
        return sources;
    }

    public void setSources(ArrayList<String> sources) {
        this.sources = sources != null ? sources : new ArrayList<>();
    }

    public ArrayList<CellenOnePlateJson> getPlates() {
        return plates;
    }

    public void setPlates(ArrayList<CellenOnePlateJson> plates) {
        this.plates = plates != null ? plates : new ArrayList<>();
    }

    public ArrayList<CellenOneSample> getCellenOneRunSamples() {
        return cellenOneRunSamples;
    }

    public void setCellenOneRunSamples(ArrayList<CellenOneSample> cellenOneRunSamples) {
        this.cellenOneRunSamples = cellenOneRunSamples != null ? cellenOneRunSamples : new ArrayList<>();
    }

    public ArrayList<CellenOneSample> getSamplesForSource(String source) {
        ArrayList<CellenOneSample> result = new ArrayList<>();
        for (CellenOneSample sample : cellenOneRunSamples) {
            if (containsSource(sample, source)) {
                result.add(sample);
            }
        }
        return result;
    }

    public ArrayList<CellenOneSample> getSamplesForPlate(String plate) {
        ArrayList<CellenOneSample> result = new ArrayList<>();
        for (CellenOneSample sample : cellenOneRunSamples) {
            if (plate == null ? sample.getPlate() == null : plate.equals(sample.getPlate())) {
                result.add(sample);
            }
        }
        return result;
    }

    private boolean containsSource(CellenOneSample sample, String source) {
        return source == null ? sample.getSource() == null : source.equals(sample.getSource());
    }

    public Integer getSamplesCount() {
        return samplesCount;
    }

    public void setSamplesCount(Integer samplesCount) {
        this.samplesCount = samplesCount;
    }

}

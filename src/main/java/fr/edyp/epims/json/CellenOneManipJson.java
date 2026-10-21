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

//import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * SingleCell CellenOne Manipulation JSON model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellenOneManipJson implements Serializable {

    private String name;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate creationDate;
    private String information;
    private Map<String, CellenOneRunJson> runByName = new HashMap<>();

    public CellenOneManipJson() {
    }

    public CellenOneManipJson(String name, LocalDate date, String information, ArrayList<CellenOneRunJson> runs) {
        this.name = name;
        this.creationDate = date;
        this.information = information;
        if (runs != null) {
            runByName = runs.stream().collect(Collectors.toMap(CellenOneRunJson::getName, Function.identity()));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return creationDate;
    }

    public void setDate(LocalDate date) {
        this.creationDate = date;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public List<CellenOneRunJson> getRuns() {
        return new ArrayList<>(runByName.values());
    }

    public CellenOneRunJson getRun(String runName) {
        return runByName.get(runName);
    }

    public void setRuns(ArrayList<CellenOneRunJson> runs) {
        if (runs != null) {
            runByName = runs.stream().collect(Collectors.toMap(CellenOneRunJson::getName, Function.identity()));
        } else
            runByName = new HashMap<>();
    }

}

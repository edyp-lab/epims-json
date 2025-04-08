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
import java.util.HashSet;
import java.util.Set;


public class RobotPlanningJson implements java.io.Serializable, Comparable<RobotPlanningJson> {


    private int id;
    private String actorKey;
    private SampleJson sample;
    private Float trypsineVol;
    private Float proteinQty;
    private String separationResultClass;
    private Date date;
    private Integer loadCount;
    private String description;
    private Boolean sampleConsumed;
    private String name;
    private Set<Integer> virtualWellsId = new HashSet<>(0);

    public RobotPlanningJson() {
    }

    public RobotPlanningJson(int id, SampleJson sample, Integer loadCount) {
        this.id = id;
        this.sample = sample;
        this.loadCount = loadCount;
    }

    public RobotPlanningJson(int id, String actorKey,  SampleJson sample, Float trypsineVol, Float proteinQty,
                             String separationResultClass, Date date, Integer loadCount, String description,
                             Boolean sampleConsumed, String name , Set<Integer> virtualWellsId) {
        this.id = id;
        this.actorKey = actorKey;
        this.sample = sample;
        this.trypsineVol = trypsineVol;
        this.proteinQty = proteinQty;
        this.separationResultClass = separationResultClass;
        this.date = date;
        this.loadCount = loadCount;
        this.description = description;
        this.sampleConsumed = sampleConsumed;
        this.name = name;
        this.virtualWellsId = virtualWellsId;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getActorKey() {
        return this.actorKey;
    }
    public void setActorKey(String actorKey) {
        this.actorKey = actorKey;
    }


    public SampleJson getSample() {
        return this.sample;
    }
    public void setSample(SampleJson sample) {
        this.sample = sample;
    }

    public Float getTrypsineVol() {
        return this.trypsineVol;
    }
    public void setTrypsineVol(Float trypsineVol) {
        this.trypsineVol = trypsineVol;
    }

    public Float getProteinQty() {
        return this.proteinQty;
    }
    public void setProteinQty(Float proteinQty) {
        this.proteinQty = proteinQty;
    }

    public String getSeparationResultClass() {
        return this.separationResultClass;
    }
    public void setSeparationResultClass(String separationResultClass) {
        this.separationResultClass = separationResultClass;
    }

    public Date getDate() {
        return this.date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getLoadCount() {
        return this.loadCount;
    }
    public void setLoadCount(Integer loadCount) {
        this.loadCount = loadCount;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getSampleConsumed() {
        return this.sampleConsumed;
    }
    public void setSampleConsumed(Boolean sampleConsumed) {
        this.sampleConsumed = sampleConsumed;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Set<Integer> getVirtualWellsId() {
        return this.virtualWellsId;
    }
    public void setVirtualWellsId(Set<Integer> virtualWellsId) {
        this.virtualWellsId = virtualWellsId;
    }

    @Override
    public int compareTo(RobotPlanningJson o) {
        String sampleName1 = (sample == null) ? "" : sample.getName();
        String sampleName2 = (o.sample == null) ? "" : o.sample.getName();
        return sampleName1.compareToIgnoreCase(sampleName2);
    }
}

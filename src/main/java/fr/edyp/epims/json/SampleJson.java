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

import java.util.ArrayList;
import java.util.Date;

public class SampleJson implements java.io.Serializable , Comparable<SampleJson> {


    private String name;
    private String actorKey;
    private BiologicOriginJson biologicOriginJson;
    private int study;
    private String description;
    private Float volume;
    private String status;
    private Float quantity;
    private String originalName;
    private Boolean radioactivity;
    private Boolean toxicity;
    private Date creationDate;

    private StudyPathJson studyPath;

    private ArrayList<ProtocolApplicationJson> orderedProtocolApplications;


    public SampleJson() {
    }


    public SampleJson(String name , String actorKey, BiologicOriginJson biologicOriginJson , int study,
                      String description, Float volume, String status, Float quantity,
                      String originalName, Boolean radioactivity, Boolean toxicity, Date creationDate,
                      ArrayList<ProtocolApplicationJson> orderedProtocolApplications) {
        this.name = name;
        this.actorKey = actorKey;
        this.biologicOriginJson = biologicOriginJson;
        this.study = study;
        this.description = description;
        this.volume = volume;
        this.status = status;
        this.quantity = quantity;
        this.originalName = originalName;
        this.radioactivity = radioactivity;
        this.toxicity = toxicity;
        this.creationDate = creationDate;
        this.orderedProtocolApplications = orderedProtocolApplications;
    }

    public ArrayList<ProtocolApplicationJson> getOrderedProtocolApplications() {
        return this.orderedProtocolApplications;
    }
    public void setOrderedProtocolApplications(ArrayList<ProtocolApplicationJson> orderedProtocolApplications) {
        this.orderedProtocolApplications = orderedProtocolApplications;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getActorKey() {
        return this.actorKey;
    }
    public void setActorKey(String actorKey) {
        this.actorKey = actorKey;
    }


    public BiologicOriginJson getBiologicOriginJson() {
        return this.biologicOriginJson;
    }
    public void setBiologicOrigin(BiologicOriginJson biologicOriginJson) {
        this.biologicOriginJson = biologicOriginJson;
    }


    public int getStudy() {
        return this.study;
    }
    public void setStudy(int study) {
        this.study = study;
    }

    /*
    public Treatments getTreatments() {
        return this.treatments;
    }
    public void setTreatments(Treatments treatments) {
        this.treatments = treatments;
    }*/


    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    public Float getVolume() {
        return this.volume;
    }
    public void setVolume(Float volume) {
        this.volume = volume;
    }


    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    public Float getQuantity() {
        return this.quantity;
    }
    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }


    public String getOriginalName() {
        return this.originalName;
    }
    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }


    public Boolean getRadioactivity() {
        return this.radioactivity;
    }
    public void setRadioactivity(Boolean radioactivity) {
        this.radioactivity = radioactivity;
    }


    public Boolean getToxicity() {
        return this.toxicity;
    }
    public void setToxicity(Boolean toxicity) {
        this.toxicity = toxicity;
    }


    public Date getCreationDate() {
        return this.creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public StudyPathJson getStudyPath() {
        return this.studyPath;
    }
    public void setStudyPath(StudyPathJson studyPath) {
        this.studyPath = studyPath;
    }

    @Override
    public int compareTo(SampleJson o) {
        return name.compareToIgnoreCase(o.name);
    }
}

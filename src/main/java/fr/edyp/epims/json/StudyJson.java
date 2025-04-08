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


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Date;


public class StudyJson implements java.io.Serializable, Comparable<StudyJson> {

    private int id;
    private String actorKey;
    private int projectId;
    private String title;
    private String nomenclatureTitle;
    private String longTitle;
    private String description;
    private String identificationType;
    private String contractualFrame;
    private Boolean billed;
    private Date creationDate;
    private Date closingDate;
    private Date estimatedClosingDate;
    private String status;
    private Boolean confidential;
    private ArrayList<String> actorsKey = new ArrayList<String>(0);
    private ArrayList<Integer> contactsKey = new ArrayList<Integer>(0);

    private String comment;


    public StudyJson() {
    }

    public StudyJson(int id, String title, String nomenclatureTitle, Date creationDate,
                     String status, String comment) {
        this.id = id;
        this.title = title;
        this.nomenclatureTitle = nomenclatureTitle;
        this.creationDate = creationDate;
        this.status = status;
        this.comment = comment;
    }

    public StudyJson(int id , String actorKey, int projectId, String title, String nomenclatureTitle,
                     String longTitle, String description, String identificationType,
                     String contractualFrame, Boolean billed, Date creationDate, Date closingDate,
                     Date estimatedClosingDate, String status, Boolean confidential, String comment) {
        this.id = id;
        this.actorKey = actorKey;
        this.projectId = projectId;
        this.title = title;
        this.nomenclatureTitle = nomenclatureTitle;
        this.longTitle = longTitle;
        this.description = description;
        this.identificationType = identificationType;
        this.contractualFrame = contractualFrame;
        this.billed = billed;
        this.creationDate = creationDate;
        this.closingDate = closingDate;
        this.estimatedClosingDate = estimatedClosingDate;
        this.status = status;
        this.confidential = confidential;
        this.comment = comment;
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

    public int getProjectId() {
        return this.projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }




    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getNomenclatureTitle() {
        return this.nomenclatureTitle;
    }

    public void setNomenclatureTitle(String nomenclatureTitle) {
        this.nomenclatureTitle = nomenclatureTitle;
    }


    public String getLongTitle() {
        return this.longTitle;
    }

    public void setLongTitle(String longTitle) {
        this.longTitle = longTitle;
    }


    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getIdentificationType() {
        return this.identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }


    public String getContractualFrame() {
        return this.contractualFrame;
    }

    public void setContractualFrame(String contractualFrame) {
        this.contractualFrame = contractualFrame;
    }

    public Boolean getBilled() {
        return this.billed;
    }

    public void setBilled(Boolean billed) {
        this.billed = billed;
    }


    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    public Date getClosingDate() {
        return this.closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }


    public Date getEstimatedClosingDate() {
        return this.estimatedClosingDate;
    }

    public void setEstimatedClosingDate(Date estimatedClosingDate) {
        this.estimatedClosingDate = estimatedClosingDate;
    }


    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @JsonIgnore
    public boolean isRunningStatus() {
        return status.equals("en cours");
    }

    @JsonIgnore
    public boolean isCloseStatus() {
        return status.equals("close");
    }

    @JsonIgnore
    public boolean isArchivableStatus() {
        return status.equals("archivable");
    }

    @JsonIgnore
    public boolean isArchiveeStatus() {
        return status.equals("archivée");
    }

    public Boolean getConfidential() {
        return this.confidential;
    }

    public void setConfidential(Boolean confidential) {
        this.confidential = confidential;
    }


    public ArrayList<String> getActorsKey() {
        return this.actorsKey;
    }

    public void setActorsKey(ArrayList<String> actorsKey) {
        this.actorsKey = actorsKey;
    }


    public ArrayList<Integer> getContactsKey() {
        return this.contactsKey;
    }

    public void setContactsKey(ArrayList<Integer> contactsKey) {
        this.contactsKey = contactsKey;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(StudyJson o) {
        return title.compareToIgnoreCase(o.title);
    }
}

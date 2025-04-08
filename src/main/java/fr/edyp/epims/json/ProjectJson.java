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
import java.util.Collections;
import java.util.Date;


public class ProjectJson implements java.io.Serializable, Comparable<ProjectJson> {

    private int id;
    private String actorKey;
    private int programId;
    private String title;
    private String nomenclatureTitle;
    private String longTitle;
    private String description;
    private String contractualFrame;
    private String identificationType;
    private Date creationDate;
    private Date closingDate;
    private Boolean confidential;

    private ArrayList<Integer> studiesKeys = null;
    private ArrayList<StudyJson> studies = null;


    private ArrayList<String> actorsKey = new ArrayList<String>(0);
    private ArrayList<Integer> contactsKey = new ArrayList<Integer>(0);


    public ProjectJson() {

    }

    public ProjectJson(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public ProjectJson(int id, String actorKey, int programId, String title, String nomenclatureTitle,
                   String longTitle, String description, String contractualFrame,
                   String identificationType, Date creationDate, Date closingDate, Boolean confidential) {
        this.id = id;
        this.actorKey = actorKey;
        this.programId = programId;
        this.title = title;
        this.nomenclatureTitle = nomenclatureTitle;
        this.longTitle = longTitle;
        this.description = description;
        this.contractualFrame = contractualFrame;
        this.identificationType = identificationType;
        this.creationDate = creationDate;
        this.closingDate = closingDate;
        this.confidential = confidential;
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

    public int getProgramId() {
        return this.programId;
    }
    public void setProgramId(int programId) {
        this.programId = programId;
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


    public String getContractualFrame() {
        return this.contractualFrame;
    }
    public void setContractualFrame(String contractualFrame) {
        this.contractualFrame = contractualFrame;
    }


    public String getIdentificationType() {
        return this.identificationType;
    }
    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
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


    public Boolean getConfidential() {
        return this.confidential;
    }
    public void setConfidential(Boolean confidential) {
        this.confidential = confidential;
    }


    public ArrayList<Integer> getStudiesKeys() {
        return this.studiesKeys;
    }
    public void setStudiesKeys(ArrayList<Integer> studiesKeys) {
        this.studiesKeys = studiesKeys;
    }

    public ArrayList<StudyJson> getStudies() {
        return this.studies;
    }
    public void setStudies(ArrayList<StudyJson> studies) {
        this.studies = studies;
    }

    public void addStudy(StudyJson study) {
        studies.add(study);
        studiesKeys.add(study.getId());
        Collections.sort(studies);
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

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(ProjectJson o) {
        if (getId()==-1) {
            return -1;
        }
        if (o.getId()==-1) {
            return 1;
        }
        return title.compareToIgnoreCase(o.title);
    }
}

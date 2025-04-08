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
import java.util.List;

public class ProgramJson implements java.io.Serializable, Comparable<ProgramJson> {

    private int id;
    private String title;
    private String nomenclatureTitle;
    private String longTitle;
    private String description;
    private String contractualFrame;
    private String responsible;
    private Date closingDate;
    private Date creationDate;
    private Boolean confidential;

    private List<Integer> projectsKeys = null;
    private List<ProjectJson> projects = null;

    private ArrayList<String> actorsKey = new ArrayList<String>(0);
    private ArrayList<Integer> contactsKey = new ArrayList<Integer>(0);

    public ProgramJson() {

    }

    public ProgramJson(int id, String title, String nomenclatureTitle, String longTitle,
                       String description, String contractualFrame, String responsible, Date closingDate,
                       Date creationDate, Boolean confidential) {
        this.id = id;
        this.title = title;
        this.nomenclatureTitle = nomenclatureTitle;
        this.longTitle = longTitle;
        this.description = description;
        this.contractualFrame = contractualFrame;
        this.responsible = responsible;
        this.closingDate = closingDate;
        this.creationDate = creationDate;
        this.confidential = confidential;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
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


    public String getResponsible() {
        return this.responsible;
    }
    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }


    public Date getClosingDate() {
        return this.closingDate;
    }
    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }


    public Date getCreationDate() {
        return this.creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getConfidential() {
        return this.confidential;
    }
    public void setConfidential(Boolean confidential) {
        this.confidential = confidential;
    }

    public List<Integer> getProjectsKeys() {
        return this.projectsKeys;
    }
    public void setProjectsKeys(List<Integer> projectsKeys) {
        this.projectsKeys = projectsKeys;
    }

    public List<ProjectJson> getProjects() {
        return this.projects;
    }
    public void setProjects(List<ProjectJson> projects) {
        this.projects = projects;
    }

    public void addProject(ProjectJson project) {
        projects.add(project);
        projectsKeys.add(project.getId());
        Collections.sort(projects);
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
    public int compareTo(ProgramJson o) {
        if (id == -1) {
            return -1;
        }
        if (o.id == -1) {
            return 1;
        }
        return title.compareToIgnoreCase(o.title);
    }
}

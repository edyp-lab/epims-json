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

public class StudyPathJson extends StudyJson {

    private String path;
    private String projectNomenclatureTitle;
    private String programNomenclatureTitle;

    public StudyPathJson() {

    }

    public StudyPathJson(int id , String actorKey, int projectId, String title, String nomenclatureTitle,
                     String longTitle, String description, String identificationType,
                     String contractualFrame, Boolean billed, Date creationDate, Date closingDate,
                     Date estimatedClosingDate, String status, Boolean confidential, String path, String projectNomenclatureTitle, String programNomenclatureTitle) {
        super(id , actorKey, projectId, title, nomenclatureTitle,
                longTitle, description, identificationType,
                contractualFrame, billed, creationDate, closingDate,
                estimatedClosingDate, status, confidential, "");

        this.path = path;
        this.projectNomenclatureTitle = projectNomenclatureTitle;
        this.programNomenclatureTitle = programNomenclatureTitle;
    }

    public String getPath() {
        return this.path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public String getProjectNomenclatureTitle() {
        return this.projectNomenclatureTitle;
    }

    public void setProjectNomenclatureTitle(String projectNomenclatureTitle) {
        this.projectNomenclatureTitle = projectNomenclatureTitle;
    }

    public String getProgramNomenclatureTitle() {
        return this.programNomenclatureTitle;
    }

    public void setProgramNomenclatureTitle(String programNomenclatureTitle) {
        this.programNomenclatureTitle = programNomenclatureTitle;
    }

}

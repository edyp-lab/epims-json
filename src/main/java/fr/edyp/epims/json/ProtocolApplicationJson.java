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


public class ProtocolApplicationJson implements java.io.Serializable, Comparable<ProtocolApplicationJson> {

    private Integer id;
    private String actorKey;
    private String sampleKey;
    private String sampleActorKey;
    private String name;
    private Date date;
    private String comment;
    private Integer studyId;
    private AcquisitionJson acquisitionJson;
    private RunRobotJson runRobotJson;
    private AliquotageJson aliquotageJson;
    private Integer rank;


    public ProtocolApplicationJson() {
    }

    public ProtocolApplicationJson(Integer id, String sampleKey, String sampleActorKey, String actorKey, String name, Date date,
                                   String comment, Integer studyId, Integer acquisitionId, Integer instrumentId, String nature, Float durationMin) {
        this.id = id;
        this.sampleKey = sampleKey;
        this.sampleActorKey = sampleActorKey;
        this.actorKey = actorKey;
        this.name = name;
        this.date = date;
        this.comment = comment;
        this.studyId = studyId;
        this.acquisitionJson = new AcquisitionJson(acquisitionId, instrumentId, nature, durationMin, null);
    }


    public ProtocolApplicationJson(Integer id, String sampleKey, String sampleActorKey, String actorKey, /*Protocol protocol,*/ String name, Date date,
                                   String comment, /*Separation separation,*/ Integer studyId, AcquisitionJson acquisitionJson, RunRobotJson runRobotJson, AliquotageJson aliquotageJson,  Integer rank) {
        this.id = id;
        this.sampleKey = sampleKey;
        this.sampleActorKey = sampleActorKey;
        this.actorKey = actorKey;
        this.name = name;
        this.date = date;
        this.comment = comment;
        this.studyId = studyId;
        this.acquisitionJson = acquisitionJson;
        this.runRobotJson = runRobotJson;
        this.aliquotageJson = aliquotageJson;
        this.rank = rank;
    }


    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getSampleKey() {
        return this.sampleKey;
    }
    public void setSampleKey(String sampleKey) {
        this.sampleKey = sampleKey;
    }

    public String getSampleActorKey() {
        return this.sampleActorKey;
    }
    public void setSampleActorKey(String sampleActorKey) {
        this.sampleActorKey = sampleActorKey;
    }


    public String getActorKey() {
        return this.actorKey;
    }
    public void setActor(String actorKey) {
        this.actorKey = actorKey;
    }

/*
    public Protocol getProtocol() {
        return this.protocol;
    }
    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }*/

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Date getDate() {
        return this.date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    public String getComment() {
        return this.comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }



    public Integer getStudyId() {
        return this.studyId;
    }
    public void setStudyId(Integer studyId) {
        this.studyId = studyId;
    }


    public AcquisitionJson getAcquisitionJson() {
        return this.acquisitionJson;
    }
    public void setAcquisitionJson(AcquisitionJson acquisitionJson) {
        this.acquisitionJson = acquisitionJson;
    }

    public RunRobotJson getRunRobotJson() {
        return this.runRobotJson;
    }
    public void setRunRobotJson(RunRobotJson runRobotJson) {
        this.runRobotJson = runRobotJson;
    }

    public AliquotageJson getAliquotageJson() {
        return this.aliquotageJson;
    }
    public void setAliquotageJson(AliquotageJson aliquotageJson) {
        this.aliquotageJson = aliquotageJson;
    }


    @Override
    public int compareTo(ProtocolApplicationJson o) {
        return name.compareToIgnoreCase(o.name);
    }

    public Integer getRank() {
        return this.rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }


}

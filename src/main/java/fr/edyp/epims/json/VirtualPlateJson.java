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

public class VirtualPlateJson implements java.io.Serializable, Comparable<VirtualPlateJson> {

    private String name;
    private String actorKey;
    private Date plannedDate;
    private Boolean locked;
    private Integer XSize;
    private Integer YSize;
    private Set<VirtualWellJson> virtualWells = new HashSet<>(0);

    public VirtualPlateJson() {
    }

    public VirtualPlateJson(String name) {
        this.name = name;
    }

    public VirtualPlateJson(String name, String actorKey, Date plannedDate, Boolean locked, Integer XSize,
                        Integer YSize, Set<VirtualWellJson> virtualWells) {
        this.name = name;
        this.actorKey = actorKey;
        this.plannedDate = plannedDate;
        this.locked = locked;
        this.XSize = XSize;
        this.YSize = YSize;
        this.virtualWells = virtualWells;
    }


    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getActor() {
        return this.actorKey;
    }
    public void setActor(String actorKey) {
        this.actorKey = actorKey;
    }


    public Date getPlannedDate() {
        return this.plannedDate;
    }
    public void setPlannedDate(Date plannedDate) {
        this.plannedDate = plannedDate;
    }


    public Boolean getLocked() {
        return this.locked;
    }
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }


    public Integer getXSize() {
        return this.XSize;
    }
    public void setXSize(Integer XSize) {
        this.XSize = XSize;
    }


    public Integer getYSize() {
        return this.YSize;
    }
    public void setYSize(Integer YSize) {
        this.YSize = YSize;
    }


    public Set<VirtualWellJson> getVirtualWells() {
        return this.virtualWells;
    }
    public void setVirtualWells(Set<VirtualWellJson> virtualWells) {
        this.virtualWells = virtualWells;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(VirtualPlateJson o) {
        return name.compareToIgnoreCase(o.name);
    }
}

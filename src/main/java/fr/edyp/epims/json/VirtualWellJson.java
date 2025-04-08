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



public class VirtualWellJson implements java.io.Serializable {

    private int id;
    private RobotPlanningJson robotPlanning;
    private String virtualPlateKey;
    private Integer XCoord;
    private Integer YCoord;

    public VirtualWellJson() {
    }

    public VirtualWellJson(int id) {
        this.id = id;
    }

    public VirtualWellJson(int id, RobotPlanningJson robotPlanning, String virtualPlateKey, Integer XCoord, Integer YCoord) {
        this.id = id;
        this.robotPlanning = robotPlanning;
        this.virtualPlateKey = virtualPlateKey;
        this.XCoord = XCoord;
        this.YCoord = YCoord;
    }


    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public RobotPlanningJson getRobotPlanning() {
        return this.robotPlanning;
    }
    public void setRobotPlanning(RobotPlanningJson robotPlanning) {
        this.robotPlanning = robotPlanning;
    }

    public String getVirtualPlateKey() {
        return this.virtualPlateKey;
    }
    public void setVirtualPlateKey(String virtualPlateKey) {
        this.virtualPlateKey = virtualPlateKey;
    }

    public Integer getXCoord() {
        return this.XCoord;
    }
    public void setXCoord(Integer XCoord) {
        this.XCoord = XCoord;
    }

    public Integer getYCoord() {
        return this.YCoord;
    }
    public void setYCoord(Integer YCoord) {
        this.YCoord = YCoord;
    }

}

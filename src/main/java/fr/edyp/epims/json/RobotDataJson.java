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
import java.util.HashMap;

public class RobotDataJson  implements java.io.Serializable {

    private HashMap<String, VirtualPlateJson> m_platesMap;
    private ArrayList<RobotPlanningJson> m_freeRobotPlanningList;

    public RobotDataJson() {

    }

    public void setPlatesMap(HashMap<String, VirtualPlateJson> platesMap) {
        m_platesMap = platesMap;
    }
    public HashMap<String, VirtualPlateJson> getPlatesMap() {
        return m_platesMap;
    }

    public void setFreeRobotPlanningList(ArrayList<RobotPlanningJson> freeRobotPlanningList) {
        m_freeRobotPlanningList = freeRobotPlanningList;
    }

    public ArrayList<RobotPlanningJson> getFreeRobotPlanningList() {
        return m_freeRobotPlanningList;
    }
}

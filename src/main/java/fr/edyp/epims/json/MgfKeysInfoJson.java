/*
 * Copyright (C) 2021
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the CeCILL FREE SOFTWARE LICENSE AGREEMENT
 * ; either version 2.1 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * CeCILL License V2.1 for more details.
 *
 * You should have received a copy of the CeCILL License
 * along with this program;
 * If not, see <http://www.cecill.info/licences/Licence_CeCILL_V2.1-en.html>.
 */
package fr.edyp.epims.json;

import java.io.Serializable;

/**
 * Information to get/set contextual data from ePims
 * This information is the acquisition name, mgfFile name and study id
 *
 *  Used to exchange information between client - server by GetInfoForMgfFileTask/MGFController
 */
public class MgfKeysInfoJson implements Serializable {

  private String fileName;
  private Integer studyId;
  private String acquisitionName;
  private Double acquisitionNameConfidence = 0.0;

  public MgfKeysInfoJson() {

  }

  public MgfKeysInfoJson(String name, Integer studyId, String acquisitionName, Double acquisitionNameConfidence) {
    this.fileName = name;
    this.studyId = studyId;
    this.acquisitionName = acquisitionName;
    this.acquisitionNameConfidence = acquisitionNameConfidence;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Integer getStudyId() {
    return studyId;
  }

  public void setStudyId(Integer studyId) {
    this.studyId = studyId;
  }

  public String getAcquisitionName() {
    return acquisitionName;
  }

  public void setAcquisitionName(String acquisitionName) {
    this.acquisitionName = acquisitionName;
  }

  public Double getAcquisitionNameConfidence() {
    return acquisitionNameConfidence;
  }

  public void setAcquisitionNameConfidence(Double acquisitionNameConfidence) {
    this.acquisitionNameConfidence = acquisitionNameConfidence;
  }
}

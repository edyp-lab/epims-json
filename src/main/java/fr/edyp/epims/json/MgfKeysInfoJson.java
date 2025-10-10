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

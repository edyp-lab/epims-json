package fr.edyp.epims.json;

import java.io.Serializable;

/**
 * Information to get/set contextual data from ePims
 * This information is the acquisition name, mgfFile name and study id
 *
 */
public class MgfKeysInfoJson implements Serializable {

  private String name;
  private Integer studyId;
  private String acquisitionName;
  private Double acquisitionNameConfidence = 0.0;

  public MgfKeysInfoJson() {

  }

  public MgfKeysInfoJson(String name, Integer studyId, String acquisitionName, Double acquisitionNameConfidence) {
    this.name = name;
    this.studyId = studyId;
    this.acquisitionName = acquisitionName;
    this.acquisitionNameConfidence = acquisitionNameConfidence;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

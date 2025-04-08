package fr.edyp.epims.json;

import java.util.Date;

public class AnalyseProgressJson implements java.io.Serializable {

    private Date lastRobotDate;
    private Date lastAcquisitionDate;
    private int acquisitionsNumber;


    public AnalyseProgressJson() {
    }

    public AnalyseProgressJson(Date lastRobotDate, Date lastAcquisitionDate, int acquisitionsNumber) {
        this.lastRobotDate = lastRobotDate;
        this.lastAcquisitionDate = lastAcquisitionDate;
        this.acquisitionsNumber = acquisitionsNumber;
    }


    public Date getLastRobotDate() {
        return this.lastRobotDate;
    }
    public void setLastRobotDate(Date lastRobotDate) {
        this.lastRobotDate = lastRobotDate;
    }

    public Date getLastAcquisitionDate() {
        return this.lastAcquisitionDate;
    }
    public void setLastAcquisitionDate(Date lastAcquisitionDate) {
        this.lastAcquisitionDate = lastAcquisitionDate;
    }

    public int getAcquisitionsNumber() {
        return this.acquisitionsNumber;
    }
    public void setAcquisitionsNumber(int acquisitionsNumber) {
        this.acquisitionsNumber = acquisitionsNumber;
    }

}



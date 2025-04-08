package fr.edyp.epims.json;

public class ArchivingInfoJson implements java.io.Serializable {

    public enum ArchiveEnum {
        WAITING(0),
        RUNNING(1),
        SUCCESS(2),
        FAILED(3);

        private ArchiveEnum(int index) {
            m_index = index;
        }

        public int getIndex() {
            return m_index;
        }

        private int m_index;
    }

    private ArchivingInfoJson.ArchiveEnum state;

    private ControlAcquisitionArchivableJson controlAcquisitionArchivableJson;
    private StudyJson studyJson;
    private String message;


    public ArchivingInfoJson() {

    }

    public ArchivingInfoJson(ControlAcquisitionArchivableJson controlAcquisitionArchivableJson, StudyJson studyJson) {
        state = ArchivingInfoJson.ArchiveEnum.WAITING;
        this.controlAcquisitionArchivableJson = controlAcquisitionArchivableJson;
        this.studyJson = studyJson;
        message = "";
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


    public void setState(ArchivingInfoJson.ArchiveEnum state) {
        this.state = state;
    }

    public ArchivingInfoJson.ArchiveEnum getState() {
        return state;
    }


    public void setStudyJson(StudyJson studyJson) {
        this.studyJson = studyJson;
    }

    public StudyJson getStudyJson() {
        return studyJson;
    }


    public void setControlAcquisitionArchivableJson(ControlAcquisitionArchivableJson controlAcquisitionArchivableJson) {
        this.controlAcquisitionArchivableJson = controlAcquisitionArchivableJson;
    }

    public ControlAcquisitionArchivableJson getControlAcquisitionArchivableJson() {
        return controlAcquisitionArchivableJson;
    }

    public void setRunning() {
        state = ArchivingInfoJson.ArchiveEnum.RUNNING;
    }

    public void setFailed() {
        state = ArchivingInfoJson.ArchiveEnum.FAILED;
    }

    public void setDone() {
        state = ArchivingInfoJson.ArchiveEnum.SUCCESS;
    }

    public boolean isWaiting() {
        return state.equals(ArchivingInfoJson.ArchiveEnum.WAITING);
    }

    public boolean isRunning() {
        return state.equals(ArchivingInfoJson.ArchiveEnum.RUNNING);
    }

    @Override
    public String toString() {
        if (studyJson != null) {
            return String.valueOf(studyJson.getId());
        } else {
            return controlAcquisitionArchivableJson.toString();
        }
    }
}


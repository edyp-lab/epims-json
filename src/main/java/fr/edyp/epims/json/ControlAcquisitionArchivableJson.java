package fr.edyp.epims.json;

public class ControlAcquisitionArchivableJson implements java.io.Serializable {

    public Integer month;
    public Integer year;
    public String instrument;

    public ControlAcquisitionArchivableJson() {

    }


    public ControlAcquisitionArchivableJson(Integer month, Integer year, String instrument) {
        this.month = month;
        this.year = year;
        this.instrument = instrument;
    }

    public Integer getMonth() {
        return this.month;
    }
    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return this.year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    public String getInstrument() {
        return this.instrument;
    }
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return instrument+":"+year+"-"+month;
    }
}

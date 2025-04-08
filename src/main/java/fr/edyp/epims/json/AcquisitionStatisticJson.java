package fr.edyp.epims.json;

public class AcquisitionStatisticJson implements java.io.Serializable {

    private int acquisitionTotal;
    private double acquisitionSizeTotal;
    private int researchAcquisitionTotal;
    private double researchAcquisitionSizeTotal;
    private int week;
    private int year;
    private String instrument;

    public AcquisitionStatisticJson() {

    }


    public AcquisitionStatisticJson(int acquisitionTotal, double acquisitionSizeTotal, int researchAcquisitionTotal, double researchAcquisitionSizeTotal, int week, int year, String instrument) {
        this.acquisitionTotal = acquisitionTotal;
        this.acquisitionSizeTotal = acquisitionSizeTotal;
        this.researchAcquisitionTotal = researchAcquisitionTotal;
        this.researchAcquisitionSizeTotal = researchAcquisitionSizeTotal;
        this.week = week;
        this.year = year;
        this.instrument = instrument;
    }

    public int getAcquisitionTotal() {
        return this.acquisitionTotal;
    }
    public void setAcquisitionTotal(int acquisitionTotal) {
        this.acquisitionTotal = acquisitionTotal;
    }

    public double getAcquisitionSizeTotal() {
        return this.acquisitionSizeTotal;
    }
    public void setAcquisitionSizeTotal(double acquisitionSizeTotal) {
        this.acquisitionSizeTotal = acquisitionSizeTotal;
    }

    public int getResearchAcquisitionTotal() {
        return this.researchAcquisitionTotal;
    }
    public void setResearchAcquisitionTotal(int researchAcquisitionTotal) {
        this.researchAcquisitionTotal = researchAcquisitionTotal;
    }

    public double getResearchAcquisitionSizeTotal() {
        return this.researchAcquisitionSizeTotal;
    }
    public void setResearchAcquisitionSizeTotal(double researchAcquisitionSizeTotal) {
        this.researchAcquisitionSizeTotal = researchAcquisitionSizeTotal;
    }

    public int getWeek() {
        return this.week;
    }
    public void setWeek(int week) {
        this.week = week;
    }

    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getInstrument() {
        return this.instrument;
    }
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}

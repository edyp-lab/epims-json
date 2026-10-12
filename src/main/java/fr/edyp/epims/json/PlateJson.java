package fr.edyp.epims.json;

public class PlateJson implements java.io.Serializable, Comparable<PlateJson> {

    private String name;
    private Integer XSize;
    private Integer YSize;

    public PlateJson() {
    }

    public PlateJson(String name, Integer XSize, Integer YSize) {
        this.name = name;
        this.XSize = XSize;
        this.YSize = YSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getXSize() {
        return XSize;
    }

    public void setXSize(Integer XSize) {
        this.XSize = XSize;
    }

    public Integer getYSize() {
        return YSize;
    }

    public void setYSize(Integer YSize) {
        this.YSize = YSize;
    }

    @Override
    public int compareTo(PlateJson other) {
        return name.compareToIgnoreCase(other.name);
    }
}
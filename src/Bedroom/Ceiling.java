package Bedroom;

public class Ceiling {

    private int numberOfOverheadLamps;
    private String colorOfCeiling;
    private double height;
    private String pattern; // e.g. popcorn ceiling
    private boolean isCeilingFan ;
    private int vents;

    public Ceiling(int numberOfOverheadLamps, String colorOfCeiling, double height, String pattern, boolean isCeilingFan, int vents) {
        this.numberOfOverheadLamps = numberOfOverheadLamps;
        this.colorOfCeiling = colorOfCeiling;
        this.height = height;
        this.pattern = pattern;
        this.isCeilingFan = isCeilingFan;
        this.vents = vents;
    }

    public int getNumberOfOverheadLamps() {
        return numberOfOverheadLamps;
    }

    public void setNumberOfOverheadLamps(int numberOfOverheadLamps) {
        this.numberOfOverheadLamps = numberOfOverheadLamps;
    }

    public String getColorOfCeiling() {
        return colorOfCeiling;
    }

    public void setColorOfCeiling(String colorOfCeiling) {
        this.colorOfCeiling = colorOfCeiling;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public boolean isCeilingFan() {
        return isCeilingFan;
    }

    public void setCeilingFan(boolean ceilingFan) {
        isCeilingFan = ceilingFan;
    }

    public int getVents() {
        return vents;
    }

    public void setVents(int vents) {
        this.vents = vents;
    }
}

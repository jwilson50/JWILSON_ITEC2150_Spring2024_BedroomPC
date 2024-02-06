package Bedroom;

public class Lamp {
    private String color;
    private double length;
    private int lumens; //e.g. 50

    public Lamp(String color, double length, int lumens) {
        this.color = color;
        this.length = length;
        this.lumens = lumens;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getLumens() {
        return lumens;
    }

    public void setLumens(int lumens) {
        this.lumens = lumens;
    }
}

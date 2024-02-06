package Bedroom;

public class Bed {

    private String size ; //e.g.  Queen, King, Twin, Double  - null
    private String color;  // null
    private String materialsOfSheets; //cotton  - null
    private int numberOfSheets; //1,2,3,4   --> default value of numberOfSheets 0
    private int numberOfPillows; //0


    //no-arg constructor or default constructor
    public Bed(){
        size = "Double";
        color = "White";
        materialsOfSheets = "Cotton";
        numberOfSheets = 1;
        numberOfPillows = 1;
    }

    //this constructor takes 5 parameters
    public Bed(String size, String color, String materialsOfSheets, int numberOfSheets, int numberOfPillows) {
        this.size = size;
        this.color = color;
        this.materialsOfSheets = materialsOfSheets;
        this.numberOfSheets = numberOfSheets;
        this.numberOfPillows = numberOfPillows;
    }

    public Bed(String size, String color){
        this.size = size;
        this.color = color;

    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getMaterialsOfSheets() {
        return materialsOfSheets;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public int getNumberOfPillows() {
        return numberOfPillows;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterialsOfSheets(String materialsOfSheets) {
        this.materialsOfSheets = materialsOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public void setNumberOfPillows(int numberOfPillows) {
        this.numberOfPillows = numberOfPillows;
    }



    public void make(){
        System.out.println("from Bed class --> calling make() method ");
    }


   //public Bed(String size, String color, String materialsOfSheets, int numberOfSheets, int numberOfPillows)
    @Override
    public String toString(){
        return "From Bed class: size:  " + size + ", color: " + color;
    }
}

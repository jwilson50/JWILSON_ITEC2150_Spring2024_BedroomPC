package PC;

public class Case {

    private String brand;

//    private double width;
//    private double height;
//    private double depth;

    private Dimension dimension;

    public Case(String brand, Dimension nDimension){
        this.brand = brand;
        this.dimension = nDimension;
    }

    public String getBrand() {
        return brand;
    }

    public Dimension getDimension() {
        return dimension;
    }

    //create toString method

}

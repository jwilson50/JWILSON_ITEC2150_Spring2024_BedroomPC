package Bedroom;

public class Bedroom {

    // name, Wall (4 walls), Ceiling, Bed, Lamp



    private String name ; //default value: null
    private Wall wall1; //null
    private Wall wall2; //null
    private Wall wall3; //null
    private Wall wall4; //null

    private Ceiling ceiling; //null
    private Bed bed; //null
    private Lamp lamp; //null


    //constructor

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp){
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;

        this.ceiling = ceiling;

        this.bed = bed;
        this.lamp = lamp;

    }

    //getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public void setWall1(Wall wall1) {
        this.wall1 = wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public void setWall2(Wall wall2) {
        this.wall2 = wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public void setWall3(Wall wall3) {
        this.wall3 = wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public void setWall4(Wall wall4) {
        this.wall4 = wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }


    //setters
    //other methods.

  public void makeBed(){
      System.out.println("Bedroom class: makeBed()");
      this.make(); //calling make() method - this is from make() method from Bedroom class.
      bed.make(); //i want to call make() method which is created in Bed class.
  }

  public void make(){
        straightenedSheet();
  }


  public void straightenedSheet(){
      System.out.println("Straightening the bed sheet");
  }

    @Override
    public String toString() {
        return  "From Bedroom class: name:  " + name  + "\nInformation about Direction of Walls: " + wall1 + ", " + wall2 + ", " + wall3 + ", " + wall4 + "\n" + bed;
    }
}

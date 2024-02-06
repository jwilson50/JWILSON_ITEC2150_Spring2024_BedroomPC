package Bedroom;

public class BuildBedroom {
    public static void main(String[] args) {

        //public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp){

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("South-East");

        //public Ceiling(int numberOfOverheadLamps, String colorOfCeiling, double height, String pattern, boolean isCeilingFan) {
        Ceiling ceiling = new Ceiling(1, "White",7, "Popcorn", true);

        //public Bed(String size, String color, String materialsOfSheets, int numberOfSheets, int numberOfPillows) {
        //public Lamp(String color, double length, int lumens) {
        Bedroom farhana = new Bedroom("Bedroom", wall1, wall2, wall3, wall4, ceiling, new Bed("Queen","Grey","Cotton",1,2), new Lamp("White",1.5, 50));

        System.out.println(farhana);




    }
}

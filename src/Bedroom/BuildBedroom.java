package Bedroom;

public class BuildBedroom {
    public static void main(String[] args) {

        //public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp){

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("South-East");

        //public Ceiling(int numberOfOverheadLamps, String colorOfCeiling, double height, String pattern, boolean isCeilingFan) {
        Ceiling ceiling = new Ceiling(1, "White",7, "Popcorn", true, 2);
        Ceiling nCeiling = new Ceiling(2,"Blue", 9, "Smooth",false, 3);

        //public Bed(String size, String color, String materialsOfSheets, int numberOfSheets, int numberOfPillows) {
        //public Lamp(String color, double length, int lumens) {
        Bedroom farhana = new Bedroom("Bedroom", wall1, wall2, wall3, wall4, ceiling, new Bed("Queen","Grey","Cotton",2), new Lamp("White",1.5, 50));

        Bedroom Taj = new Bedroom("Mi casa", wall1, wall2, wall3, wall4,nCeiling, new Bed("Twin XL","Blue","Satin",3), new Lamp("Turquiose", 1, 65));
        System.out.println(farhana);
        System.out.println(Taj);




    }
}

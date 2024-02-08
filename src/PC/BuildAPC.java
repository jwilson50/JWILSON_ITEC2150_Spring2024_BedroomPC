package PC;

public class BuildAPC {
    public static void main(String[] args) {


        //public Dimension(double width, double height, double depth) {
        //public Resolution(int hor, int ver){
        //public Motherboard(String brand, String model, int pciSlots, int memorySlots, int maxMemory)
        //public Case(String brand, Dimension nDimension){
        //public Monitor(String nBrand, Resolution nResolution, int nResponseTimeInMilliseconds, int nScreenSize)
        // public PC(Monitor monitor, Case theCase, Motherboard motherboard){

        PC richardPC = new PC(new Monitor("XYZ", new Resolution(1080,1910), 4, 27 ), new Case("AAA",new Dimension(20,18,30)), new Motherboard("ZZZ","UUU123",4, 2, 192));

         Motherboard motherboard = new Motherboard("Ronoquades Best", "RB00001", 3, 4, 200);
         Dimension dim = new Dimension(18, 25, 32);
         Case rCase = new Case("Ronoquades Best", dim);
         Resolution resolution = new Resolution(1080, 1910 );
         Monitor monitor = new Monitor("BBB",  resolution, 4,32 );
         PC ronoquadesPC = new PC(monitor, rCase,  motherboard);


        System.out.println("Richard's PC: " + richardPC);
        System.out.println("Ronoquade's PC: " + ronoquadesPC);
    }
}

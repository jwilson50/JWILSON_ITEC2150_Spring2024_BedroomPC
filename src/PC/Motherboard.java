package PC;

/**
 * Brand name: MSI
 * Model:B550GPLUSSKU:6424047
 * Number Of PCI Slots: 4
 * Number Of Memory Slots: 4
 * Maximum Memory Supported: 128 gigabytes
 */
public class Motherboard {

    private String brand;
    private String model;
    private int pciSlots;
    private int memorySlots;
    private int maxMemory;

    public Motherboard(String brand, String model, int pciSlots, int memorySlots, int maxMemory) {
        this.brand = brand;
        this.model = model;
        this.pciSlots = pciSlots;
        this.memorySlots = memorySlots;
        this.maxMemory = maxMemory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPciSlots() {
        return pciSlots;
    }

    public void setPciSlots(int pciSlots) {
        this.pciSlots = pciSlots;
    }

    public int getMemorySlots() {
        return memorySlots;
    }

    public void setMemorySlots(int memorySlots) {
        this.memorySlots = memorySlots;
    }

    public int getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(int maxMemory) {
        this.maxMemory = maxMemory;
    }

    /**
     *     private String brand;
     *     private String model;
     *     private int pciSlots;
     *     private int memorySlots;
     *     private int maxMemory;
     * @return
     */
    @Override
    public String toString() {
        return String.format("Motherboard: Brand Name: %s%n, Model: %s\n, Number of PCI Slots: %d\n,  No of Memory Slots: %d\n, Max Memory: %d\n", brand, model,pciSlots,memorySlots, maxMemory );
    }


}

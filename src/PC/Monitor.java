package PC;

/**
 * String: Brand: Samsung - 27" T350 Series IPS FHD, AMD FreeSync Monitor (VESA, HDMI, VGA) - Dark Blue Gray
 * Maximum Resolution: 1920 x 1080 (horizontal * vertical)
 * Response Time: 4 milliseconds
 * Screen Size: 27 inches
 */
public class Monitor {

    private String brand;
//    private int horizontal;
//    private int vertical;
    private Resolution resolution; //horizontal * vertical
    private int responseTimeInMilliseconds;
    private int screenSize;

    public Monitor(String nBrand, Resolution nResolution, int nResponseTimeInMilliseconds, int nScreenSize) {
        this.brand = nBrand;
        this.resolution = nResolution;
        this.responseTimeInMilliseconds = nResponseTimeInMilliseconds;
        this.screenSize = nScreenSize;
    }

    public String getBrand() {
        return brand;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public int getResponseTimeInMilliseconds() {
        return responseTimeInMilliseconds;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String toString(){
        return String.format("\nMonitor\n\nBrand Name: %s\nResolution: %s\nResponse Time: %d\nScreen Size: %d\n",brand,resolution,responseTimeInMilliseconds,screenSize);

    }
}

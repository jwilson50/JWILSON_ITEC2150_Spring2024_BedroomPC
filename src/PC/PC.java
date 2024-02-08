package PC;

public class PC {


    //Monitor
    //Case
    //Motherboard


    private Monitor monitor;

    private Case theCase; //case is a reserved/keyword for switch-case

    private Motherboard motherboard;

    public PC(Monitor monitor, Case theCase, Motherboard motherboard){
        this.monitor = monitor;
        this.theCase = theCase;
        this.motherboard = motherboard;
    }

    public Monitor getMonitor(){
        return monitor;
    }

    public Case getTheCase(){
        return theCase;
    }

    public Motherboard getMotherboard(){
        return motherboard;
    }


    public String toString(){
        return "Specification - PC: \n\n"  + "Case: " + theCase + "\nMonitor: " + monitor + "\nMotherboard: " + motherboard;
    }

}

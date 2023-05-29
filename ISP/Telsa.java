package ISP;

public class Telsa implements Car,ElectricCar {
    public String autoDrive() {
        return "autoDrive";
    }

    public String autoParking() {
        return "autoParking";
    }

    public String drive() {
        return "drive";
    }
    
    public String breaks() {
        return "break";
    }
}
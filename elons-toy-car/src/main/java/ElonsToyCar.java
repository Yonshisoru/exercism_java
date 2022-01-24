public class ElonsToyCar {
    private int battery;
    private int meterDriven;
    ElonsToyCar() {
        battery = 100;
        meterDriven = 0;
    }
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+meterDriven+" meters";
    }

    public String batteryDisplay() {
        String output = "";
        if(battery<=0){
            output = "Battery empty";
        }else{
            output ="Battery at "+battery+"%";
        }
        return output;
    }

    public void drive() {
        if(battery!=0)
        meterDriven+=20;
        battery--;
    }
}

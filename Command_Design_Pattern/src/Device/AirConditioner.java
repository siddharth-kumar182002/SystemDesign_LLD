package Device;

public class AirConditioner {
    boolean isON;
    int temperature;

    public void turnOnAC(){
        isON = true;
        System.out.println("AC is ON");
    }
    public void turnOffAC(){
        isON = false;
        System.out.println("AC is OFF");
    }

    public void setTemperature(int temp){
        this.temperature = temp;
        System.out.println("temperature = " + temperature);
    }

}

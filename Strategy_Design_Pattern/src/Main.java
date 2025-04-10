import Strategy.SportsDriveStrategy;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(new SportsDriveStrategy());
        vehicle.drive();
    }
}
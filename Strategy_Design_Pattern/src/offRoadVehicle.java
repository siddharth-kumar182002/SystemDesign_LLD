import Strategy.SportsDriveStrategy;

public class offRoadVehicle extends Vehicle{
    public offRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}

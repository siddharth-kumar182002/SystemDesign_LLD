package Command;
import Device.AirConditioner;
public class TurnACOffCommand implements ICommand {
    AirConditioner ac;
    public TurnACOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.turnOffAC();
    }

    public void undo() {
        ac.turnOnAC();
    }
}

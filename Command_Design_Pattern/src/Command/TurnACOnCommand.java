package Command;

import Device.AirConditioner;
public class TurnACOnCommand implements ICommand {
     AirConditioner ac;

   public TurnACOnCommand(AirConditioner ac){
        this.ac = ac;
    }

    public void execute(){
        ac.turnOnAC();
    }

    public void undo(){
        ac.turnOffAC();
    }

}

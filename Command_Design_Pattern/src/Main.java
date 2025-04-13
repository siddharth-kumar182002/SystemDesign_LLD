import Command.ICommand;
import Command.TurnACOffCommand;
import Command.TurnACOnCommand;
import Device.AirConditioner;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl remoteObj = new MyRemoteControl();
        remoteObj.setCommand(new TurnACOffCommand(airConditioner));

        remoteObj.pressButton();
        remoteObj.undo();
    }
}
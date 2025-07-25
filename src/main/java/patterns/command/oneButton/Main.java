package patterns.command.oneButton;

public class Main {

    public static void main(String[] args) {

       Fan fanOff = new Fan();
       Fan fanOn = new Fan();
        ICommand lightOn = new FanOnCommand(fanOn);
        ICommand lightOff = new FanOffCommand(fanOff);

        RemoteController remoteController = new RemoteController(lightOn,lightOff);
        remoteController.pressButton();
        remoteController.pressButton();


    }
}

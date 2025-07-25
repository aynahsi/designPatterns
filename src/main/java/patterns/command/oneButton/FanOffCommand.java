package patterns.command.oneButton;

public class FanOffCommand implements ICommand {
private Fan fan;

public FanOffCommand(Fan fan) {
    this.fan = fan;
}
    @Override
    public void execute() {
        fan.switchOff();
    }
}

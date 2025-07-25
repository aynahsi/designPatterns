package patterns.command.oneButton;

public class FanOnCommand implements ICommand {

    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {

        fan.switchOn();
    }


}

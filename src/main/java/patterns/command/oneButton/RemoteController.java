package patterns.command.oneButton;

//invoker
public class RemoteController {

private ICommand commandOn;
private ICommand commandOff;
boolean flag = true;
public RemoteController(ICommand commandOn, ICommand commandOff) {
    this.commandOn = commandOn;
    this.commandOff = commandOff;
}

    public void pressButton() {
    if(flag) {
        commandOn.execute();
        flag = !flag;
    }
    else{
        commandOff.execute();
        flag = !flag;
    }
    }

}

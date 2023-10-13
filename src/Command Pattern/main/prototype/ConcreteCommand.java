package main.prototype;

public class ConcreteCommand extends Command{
    Receiver receiver = new Receiver();
    @Override
    public void execute() {
        receiver.action();
    }
}

package main.prototype;

public class Invoker {
    private Command command;

    Invoker(Command command){
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}

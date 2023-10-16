package main.prototype;

public class ConcreteStateA extends State{
    @Override
    public void handle() {
        System.out.println("ConcreteStateA");
    }
}

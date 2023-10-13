package main.prototype;

public class Client {
    public static void main(String[] args) {
        ConcreteCommand concreteCommand = new ConcreteCommand();
        Invoker invoker = new Invoker(concreteCommand);
        invoker.call();
    }
}

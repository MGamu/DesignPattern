package main.prototype;

public class Client {
    public static void main(String[] args) {
        AbstractStrategy strategy = new ConcreteStrategyA();
        Context context = new Context();
        context.setStrategy(strategy);
        context.algorithm();
    }
}

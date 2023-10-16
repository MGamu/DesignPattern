package main.prototype;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA productA = factory.getProductA();
        AbstractProductB productB = factory.getProductB();
        productA.showinfo();
        productB.showinfo();
    }
}

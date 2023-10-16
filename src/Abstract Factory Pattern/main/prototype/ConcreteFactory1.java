package main.prototype;

public class ConcreteFactory1 extends AbstractFactory{
    @Override
    public AbstractProductA getProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB getProductB() {
        return new ConcreteProductB1();
    }
}

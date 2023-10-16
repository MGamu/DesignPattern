package main.prototype;

public class ConcreteFactory2 extends AbstractFactory{
    @Override
    public AbstractProductA getProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB getProductB() {
        return new ConcreteProductB2();
    }
}

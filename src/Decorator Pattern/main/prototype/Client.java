package main.prototype;

public class Client {
    public static void main(String[] args) {

        //此时还未对component进行装饰
        ConcreteComponent concreteComponent = new ConcreteComponent();
        concreteComponent.operation();

        //对component进行装饰
        Decorator decorator = new ConcreteDecorator(concreteComponent);
        decorator.operation();
    }
}

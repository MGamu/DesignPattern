package main.prototype;

public class Client {
    public static void main(String[] args) {
        ConcreteObserver observer = new ConcreteObserver();
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(observer);
        concreteSubject.attach(observer1);
        concreteSubject.notice();
    }
}

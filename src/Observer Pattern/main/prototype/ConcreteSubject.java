package main.prototype;

public class ConcreteSubject extends Subject{
    @Override
    public void notice() {
        for(Observer observer : observers){
            observer.update();
        }
    }
}

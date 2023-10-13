package main.prototype;

public class RealSubject extends Subject{
    @Override
    public void request() {
        System.out.println("业务方法1的调用");
    }
}

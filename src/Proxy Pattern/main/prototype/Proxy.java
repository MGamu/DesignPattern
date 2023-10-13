package main.prototype;

public class Proxy extends Subject{
    private RealSubject realSubject = new RealSubject();
    //维持一个对真实主题对象的引用

    public void pre_request(){
        System.out.println("前置业务方法的调用");
    }
    @Override
    public void request() {
        pre_request();
        realSubject.request();
        post_request();
    }

    public void post_request(){
        System.out.println("后置业务方法的调用");
    }
}

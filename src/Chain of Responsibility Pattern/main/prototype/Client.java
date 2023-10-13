package main.prototype;

public class Client {
    public static void main(String[] args) {
         Handler handler1 = new ConcreteHandlerA();
         Handler handler2 = new ConcreteHandlerB();
         handler1.setSuccessor(handler2);//设置继承者

        int cost = 15;
        handler1.request(cost);
    }
}

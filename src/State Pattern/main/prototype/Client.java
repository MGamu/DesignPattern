package main.prototype;

public class Client {
    public static void main(String[] args) {
        State state = new ConcreteStateA();
        Context context = new Context();

        context.setState(state);
        context.value = 1;
        context.request();//此时状态还未转换
        context.changeState();//根据value转换一次状态
        context.request();
    }
}

package main.prototype;

public class ConcreteHandlerB extends Handler{
    @Override
    public void request(int cost) {
        if(cost < 20){
            System.out.println("cost大于10小于20 由b解决");
        }else{
            System.out.println("cost大于20 无法解决");
        }
    }
}

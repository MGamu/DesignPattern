package main.prototype;

public class ConcreteHandlerA extends Handler{
    @Override
    public void request(int cost) {
        if(cost < 10){
            System.out.println("cost小于10 由A解决");
        }else{
            this.successor.request(cost);
        }
    }
}

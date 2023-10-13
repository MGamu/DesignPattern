package main.question5;

public class Decorator extends Beverage{
    Beverage beverage;
    Decorator(Beverage beverage){
        this.beverage = beverage;
    }

    //调用原有的业务方法
    @Override
    public int getCost() {
        return beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}

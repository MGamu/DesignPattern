package main.question5;

public class Mocha extends Decorator{
    Mocha(Beverage beverage){
        super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "，摩卡";
    }
}

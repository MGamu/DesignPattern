package main.question5;

public class Espresso extends Beverage{
    @Override
    public int getCost() {
        return 25;
    }

    @Override
    public String getDescription() {
        return "浓缩咖啡";
    }
}

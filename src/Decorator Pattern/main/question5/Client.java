package main.question5;

public class Client {
    public static void main(String[] args) {
        Beverage beverage = new Dark_Roast();
        Mocha mocha = new Mocha(beverage);
        int cost = mocha.getCost();
        String Description = mocha.getDescription();
        System.out.println(Description);
        System.out.println("花费：" + cost);
    }
}

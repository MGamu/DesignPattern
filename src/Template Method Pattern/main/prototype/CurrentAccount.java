package main.prototype;

public class CurrentAccount extends Account{
    @Override
    public void calculateInterest() {
        System.out.println("计算活期利率");
    }
}

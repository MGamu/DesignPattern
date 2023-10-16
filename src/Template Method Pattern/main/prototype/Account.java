package main.prototype;

public abstract class Account {
    public boolean validate(int password){
        if(password == 1){
            return true;
        }else{
            return false;
        }
    }

    //基本方法 抽象方法
    public abstract void calculateInterest();

    public void display(){
        System.out.println("显示利息");
    }

    public void handle(int password){
        if(!validate(password)){
            System.out.println("Wrong password!");
        }else{
            calculateInterest();
            display();
        }
    }
}

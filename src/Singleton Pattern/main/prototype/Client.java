package main.prototype;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1 == s2){
            System.out.println("两个对象是相同实例");
        }else{
            System.out.println("两个对象是不同实例");
        }
    }
}

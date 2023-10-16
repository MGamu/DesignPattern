package main.prototype;

public class Factory {
    public Product creatProduct(String arg){
        if(arg.equalsIgnoreCase("A")){
            return new ConcreteProductA();
        }else if(arg.equalsIgnoreCase("B")){
            return new ConcreteProductB();
        }
        return null;
    }
}

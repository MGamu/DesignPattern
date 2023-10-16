package main.prototype;

public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product = factory.creatProduct("A");
        product.methodSame();
        product.methodDiff();
    }
}

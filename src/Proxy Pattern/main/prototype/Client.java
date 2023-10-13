package main.prototype;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();
    }
}

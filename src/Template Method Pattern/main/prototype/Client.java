package main.prototype;

public class Client {
    public static void main(String[] args) {
        Account account = new CurrentAccount();
        account.handle(1);
    }
}

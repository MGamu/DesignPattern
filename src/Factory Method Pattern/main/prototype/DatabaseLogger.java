package main.prototype;

public class DatabaseLogger implements Logger{
    @Override
    public void writelog() {
        System.out.println("使用数据库型式记录");
    }
}

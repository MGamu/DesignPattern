package main.prototype;

public class FileLogger implements Logger{
    @Override
    public void writelog() {
        System.out.println("使用文件型式记录");
    }
}

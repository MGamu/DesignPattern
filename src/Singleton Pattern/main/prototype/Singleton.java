package main.prototype;

public class Singleton {
    private static Singleton instance = null;//静态私有成员变量

    private Singleton(){
        //私有构造函数
    }

    //静态公有工厂方法，返回唯一实例
    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}

package main.prototype;

public class Context {
    private AbstractStrategy abstractStrategy;//维持一个抽象对象的引用

    public void setStrategy(AbstractStrategy strategy){
        this.abstractStrategy = strategy;
    }

    public void algorithm(){//实现策略类中的算法
        abstractStrategy.algorithm();
    }
}

package main.prototype;

public class Client {
    public static void main(String[] args) {
        //创建根目录
        Composite composite1;
        composite1 = new Composite();

        //创建子目录
        Composite composite2;
        composite2 = new Composite();

        //将子目录并入根目录
        composite1.add(composite2);

        //创建叶子
        Leaf leaf;
        leaf = new Leaf();

        //将叶子并入子目录
        composite2.add(leaf);

        composite1.operation();
    }
}

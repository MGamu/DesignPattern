package main.prototype;

public abstract class Handler {
    protected Handler successor;//对下家的引用

    //设置继承者
    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    //处理业务方法
    public abstract void request(int cost);
}

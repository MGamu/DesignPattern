package main.prototype;

public class Context {
    private State state;//维持一个对抽象状态类的引用
    public int value;//维持一个引起状态变化的变量
    public void setState(State state){
        this.state = state;
    }
    public void request(){
        state.handle(); //调用状态对象的业务方法
    }

    //检测环境变化的函数也可以写在具体环境类中
    public void changeState(){//在环境类中实现具体状态转换
        if(value == 0){
            this.setState(new ConcreteStateA());
        }else if(value == 1){
            this.setState(new ConcreteStateB());
        }
    }
}

package main.prototype;

public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }
    //转发调用
    public void changed(){
        mediator.componentChanged(this);//把自身传入 写在抽象层就不用在每个子类中再次声明
    }
}

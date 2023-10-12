package main.prototype;

public class ConcreteDecorator extends Decorator{
    ConcreteDecorator(Component component){
        super(component);
    }

    public void operation(){
        super.operation();//调用原有业务方法
        new_operation();
    }

    public void new_operation(){
        System.out.println("新增业务方法的调用！");
    }
}

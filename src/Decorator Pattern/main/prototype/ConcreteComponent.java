package main.prototype;

public class ConcreteComponent extends Component{
    @Override
    public void operation() {
        System.out.println("业务方法的实现");
    }
}

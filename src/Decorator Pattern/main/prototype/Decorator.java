package main.prototype;

public class Decorator extends Component{
    private Component component;
    Decorator(Component component){
        this.component = component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}

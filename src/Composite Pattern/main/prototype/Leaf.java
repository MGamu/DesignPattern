package main.prototype;

public class Leaf extends Component{
    @Override
    public void add(Component c) {
        System.out.println("叶子结点不允许添加子类");
    }

    @Override
    public void remove(Component c) {
        System.out.println("叶子结点不允许删除子类");
    }

    @Override
    public Component getChild(int i) {
        System.out.println("叶子结点无子类");
        return null;
    }

    @Override
    public void operation() {
        System.out.println("叶子结点的业务方法被调用");
    }
}

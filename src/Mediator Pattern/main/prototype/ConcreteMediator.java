package main.prototype;

public class ConcreteMediator extends Mediator{
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComBox cb;

    @Override
    //封装同事类之间的交互
    public void componentChanged(Component c) {
        if ((c == addButton)){//点击增加按钮
            System.out.println("--单击增加按钮--");
            cb.select();//组合框被选中
            list.update();//列表新增
            userNameTextBox.update();//文本框新增
        }
        else if(c == list){//从列表中选中
            System.out.println("--从列表框选择客户--");
            cb.select();//组合框被选中
            userNameTextBox.setText();//文本框被选中
        }
        else if(c == cb){//从组合框中选中
            System.out.println("--从组合框选择客户--");
            cb.select();//组合框被选择
            userNameTextBox.setText();//文本框被选中
        }
    }
}

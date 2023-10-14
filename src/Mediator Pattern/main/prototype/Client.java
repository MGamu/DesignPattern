package main.prototype;

public class Client {
    public static void main(String[] args) {

        //定义中介者
        ConcreteMediator mediator;
        mediator = new ConcreteMediator();

        //新建同事类
        Button button = new Button();
        TextBox textBox = new TextBox();
        ComBox comBox = new ComBox();
        List list = new List();

        //设置中介者
        button.setMediator(mediator);
        textBox.setMediator(mediator);
        comBox.setMediator(mediator);
        list.setMediator(mediator);

        mediator.addButton = button;
        mediator.userNameTextBox = textBox;
        mediator.cb = comBox;
        mediator.list = list;

        //单击新增按钮
        //button.changed();

        //从组合框选人
        //comBox.changed();

        //从列表框选人
        //list.changed();
    }
}

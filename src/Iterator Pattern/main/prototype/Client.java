package main.prototype;

import java.util.ArrayList;
import java.util.List;
public class Client {
    public static void main(String[] args) {
        List<Object>products = new ArrayList<>();
        products.add("可乐");
        products.add("咖啡");
        products.add("奶茶");
        products.add("啤酒");

        AbstractObjectList abstractObjectList;
        AbstractIterator abstractIterator;

        abstractObjectList = new ProductList(products);
        abstractIterator = abstractObjectList.creatIterator();

        while(!abstractIterator.isLast()){
            System.out.println(abstractIterator.getNextItem());
            abstractIterator.next();
        }

    }
}

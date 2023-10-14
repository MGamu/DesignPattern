package main.prototype;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {
    //抽象物品聚合类
    protected List<Object> objects = new ArrayList<>();

    //有参构造函数
    public AbstractObjectList(List<Object> objects){
        this.objects = objects;
    }

    public void addObject(Object obj){
        objects.add(obj);
    }

    public void removeObject(Object obj){
        objects.remove(obj);
    }

    public List<Object> getObject(){
        return this.objects;
    }

    //创建迭代器对象的抽象工厂方法
    public abstract AbstractIterator creatIterator();
}

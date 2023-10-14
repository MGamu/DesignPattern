package main.prototype;
import java.util.ArrayList;
import java.util.List;
public class ProductIterator implements AbstractIterator {
    private List<Object> products;
    private int cursor1;//正向遍历游标
    private int cursor2;//反向遍历游标

    ProductIterator(ProductList list){
        this.products = list.getObject();
        cursor1 = 0;
        cursor2 = products.size() - 1;
    }

    public void next(){
        if(cursor1 < products.size()){
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        return cursor1 == products.size();
    }

    @Override
    public boolean isFirst() {
        return cursor2 == -1;
    }

    @Override
    public void previous() {
        if(cursor2 > -1){
            cursor2--;
        }
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}

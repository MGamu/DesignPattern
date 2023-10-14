package main.prototype;
import java.util.ArrayList;
import java.util.List;
public class ProductList extends AbstractObjectList{
    public ProductList(List<Object> products){
        super(products);
    }
    public AbstractIterator creatIterator(){
        return new ProductIterator(this);
    }

}

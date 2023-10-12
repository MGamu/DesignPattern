package main.prototype;

public class SmallBrush extends Brush{
    SmallBrush(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("This is SmallBrush!");
        color.Paint();
    }
}

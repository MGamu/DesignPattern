package main.prototype;

public class BigBrush extends Brush{
    BigBrush(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("This is Big Brush!");
        color.Paint();
    }
}

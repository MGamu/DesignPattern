package main.prototype;

public class Client {
    public static void main(String[] args) {
        Brush brush;
        Color color;
        color = new Black();
        brush = new BigBrush(color);
        brush.draw();

    }
}

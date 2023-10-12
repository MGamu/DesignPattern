package main.prototype;

public abstract class Brush {

    Color color;

    Brush(Color color){
        this.color = color;
    }

    public abstract void draw();

}

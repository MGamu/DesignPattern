package main.question_5;

public abstract class Manufacturer {
    Plane plane;
    Manufacturer(Plane plane){
        this.plane = plane;
    }

    public abstract void BuildPlane();
}

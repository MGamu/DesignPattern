package main.question_5;

public class Airbus extends Manufacturer{
    Airbus(Plane plane) {
        super(plane);
    }

    @Override
    public void BuildPlane() {
        System.out.println("空客集团造了一架飞机！");
        plane.fly();
    }
}

package main.question_5;

public class Boeing extends Manufacturer{
    Boeing(Plane plane){
        super(plane);
    }

    @Override
    public void BuildPlane() {
        System.out.println("波音公司造了一架飞机！");
        plane.fly();
    }
}

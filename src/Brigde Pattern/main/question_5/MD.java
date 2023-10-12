package main.question_5;

public class MD extends Manufacturer{
    MD(Plane plane) {
        super(plane);
    }

    @Override
    public void BuildPlane() {
        System.out.println("麦道公司造了一架飞机！");
        plane.fly();
    }
}

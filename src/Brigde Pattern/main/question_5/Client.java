package main.question_5;

public class Client {
    public static void main(String[] args) {

        //波音公司制造一架载客飞机
        Plane plane = new PassengerPlane();
        Manufacturer manufacturer = new Boeing(plane);
        manufacturer.BuildPlane();
    }
}

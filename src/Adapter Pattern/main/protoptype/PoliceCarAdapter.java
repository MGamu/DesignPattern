package main.protoptype;

public class PoliceCarAdapter extends CarController{
    private PoliceSound policeSound;
    private PoliceLamp policeLamp;

    public PoliceCarAdapter(){
        policeSound = new PoliceSound();
        policeLamp = new PoliceLamp();
    }

    @Override
    public void phonate() {
        policeLamp.alarmLamp();
    }

    @Override
    public void twinkle() {
        policeSound.alarmSound();
    }
}

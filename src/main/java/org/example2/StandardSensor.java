package org.example2;

public class StandardSensor implements Sensor{

    private boolean status = true;
    private int base;

    public StandardSensor(int num) {
        this.base = num;

    }



    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public void setOff() {
        this.status = false;
    }

    @Override
    public int read() {
        return base;
    }
}

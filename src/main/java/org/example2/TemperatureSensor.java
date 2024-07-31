package org.example2;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean status = false;

    public TemperatureSensor() {
        this.status = false;

    }

    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {

        if (this.status == false) {
            throw new IllegalStateException("you ne3ed to set this thing on!");

        }
        Random rand = new Random();
        int min=-30,max=30;
        int randNum = rand.nextInt(max-min+1)+min;

        return randNum;
    }
}

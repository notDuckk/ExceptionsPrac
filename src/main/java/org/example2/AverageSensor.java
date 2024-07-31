package org.example2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);

    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        if (!sensors.isEmpty()) {
            sensors.get(0).setOff(); // Set at least one sensor off
        }
    }

    @Override
    public int read() {
        if (!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("AverageSensor is off or has no sensors.");
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
            readings.add(sensor.read());
        }
        int average = sum / sensors.size(); // Calculate average temperature
        readings.add(average); // Store the reading
        return average; // Return the average temperature
    }

    @Override
    public boolean isOn() {
        if (sensors.isEmpty()) {
            return false;
        }

        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> readings() {
        return new ArrayList<>(readings);
    }
}
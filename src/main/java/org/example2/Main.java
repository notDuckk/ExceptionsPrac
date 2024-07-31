package org.example2;

public class Main {
    public static void main(String[] args) {
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());

        System.out.println("---------------");

        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();
        System.out.println("temperature in Kumpla " + kumpula.read() + " degrees Celsius");

        Sensor Kaisanieme = new TemperatureSensor();
        Sensor blah = new TemperatureSensor();

        AverageSensor balh2 = new AverageSensor();
        balh2.addSensor(kumpula);
        balh2.addSensor(Kaisanieme);
        balh2.addSensor(blah);

        balh2.setOn();
        System.out.println("temp in  balh " + balh2.read() + " degrees Celsius");


        System.out.println("readings: " + balh2.readings());


    }
}

package org.example.Model;

public class CupOfTea extends HotDrink {

    protected int temperature;

    public int getTemperature() { //getter для
        return temperature;
    }

    public CupOfTea(String name, int volume, int temperature) { //конструктор
        super(name, volume);
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return "CupOfTea{" +
                "name = " + name +
                ", volume = '" + volume + '\'' +
                ", temperature = " + temperature +
                '}';
    }
}

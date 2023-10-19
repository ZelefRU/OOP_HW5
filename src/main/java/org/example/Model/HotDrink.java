package org.example.Model;

public class HotDrink {
    public String name;
    public int volume;

    public HotDrink(String name, int volume) { //конструктор
        this.name = name;
        this.volume = volume;
    }

    public String getName() { //getter для имени
        return name;
    }
//
    public int getVolume() { //getter для цены
        return volume;
    }

    @Override
    public String toString() { //меняем toString
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}

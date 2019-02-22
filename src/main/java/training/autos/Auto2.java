package training.autos;

import training.interfaces.Auto;
import training.interfaces.Beep;
import training.interfaces.Headlight;
import training.interfaces.Wheels;

public class Auto2 implements Auto {

    private String name;
    private String color;
    private int year;
    private Beep beep;
    private Headlight headlight;
    private Wheels wheels;

    public Auto2(String name, String color, int year, Beep beep, Headlight headlight, Wheels wheels) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.beep = beep;
        this.headlight = headlight;
        this.wheels = wheels;
    }

    public void run() {
        System.out.println(toString());
        wheels.turn();
        headlight.light();
        beep.beeping();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year;
    }
}

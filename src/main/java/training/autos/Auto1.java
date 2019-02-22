package training.autos;

import org.springframework.beans.factory.annotation.Qualifier;
import training.interfaces.Auto;
import training.interfaces.Beep;
import training.interfaces.Headlight;
import training.interfaces.Wheels;
import org.springframework.stereotype.Component;

@Component
public class Auto1 implements Auto {

    private String name;
    private String color;
    private int year;
    private Beep beep;
    private Headlight headlight;
    private Wheels wheels;


    public Auto1(@Qualifier("ladaBeep") Beep beep, @Qualifier("BMWHeadlight") Headlight headlight, @Qualifier("ladaWheels") Wheels wheels) {
        this.name = "Lada";
        this.color = "white";
        this.year = 1987;
        this.beep = beep;
        this.headlight = headlight;
        this.wheels = wheels;
    }

    /*public Auto1() {
        this.name = "Lada";
        this.color = "white";
        this.year = 1987;
        this.beep = new LadaBeep();
        this.headlight = new BMWHeadlight();
        this.wheels = new LadaWheels();
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Beep getBeep() {
        return beep;
    }

    public void setBeep(Beep beep) {
        this.beep = beep;
    }

    public Headlight getHeadlight() {
        return headlight;
    }

    public void setHeadlight(Headlight headlight) {
        this.headlight = headlight;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
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
        return
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year ;
    }
}

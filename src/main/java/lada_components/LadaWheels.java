package lada_components;

import interfaces.Wheels;
import org.springframework.stereotype.Component;

@Component
public class LadaWheels implements Wheels {
    public void turn() {
        System.out.println("lada`s wheels are turning");
    }
}

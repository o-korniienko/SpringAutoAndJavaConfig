package training.lada_components;

import org.springframework.stereotype.Component;
import training.interfaces.Wheels;
@Component
public class LadaWheels implements Wheels {
    public void turn() {
        System.out.println("lada`s wheels are turning");
    }
}

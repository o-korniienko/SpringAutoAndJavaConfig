package training.bmw_components;

import org.springframework.stereotype.Component;
import training.interfaces.Headlight;
@Component
public class BMWHeadlight implements Headlight {
    public void light() {
        System.out.println("BMW`s headlight is shining");
    }
}

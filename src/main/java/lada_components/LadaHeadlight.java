package lada_components;

import interfaces.Headlight;
import org.springframework.stereotype.Component;

@Component
public class LadaHeadlight implements Headlight {
    public void light() {
        System.out.println("lada`s headlight is shining");
    }
}

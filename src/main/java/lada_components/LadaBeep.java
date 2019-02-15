package lada_components;

import interfaces.Beep;
import org.springframework.stereotype.Component;

@Component
public class LadaBeep implements Beep {

    public void beeping() {
        System.out.println("lada is beeping");
    }
}

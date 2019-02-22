package training.lada_components;

import org.springframework.stereotype.Component;
import training.interfaces.Beep;

@Component
public class LadaBeep implements Beep {

    public void beeping() {
        System.out.println("lada is beeping");
    }
}

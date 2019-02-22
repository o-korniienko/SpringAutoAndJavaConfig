package training.configs;

import training.autos.Auto2;
import training.bmw_components.BMWBeep;
import training.bmw_components.BMWWheels;
import training.lada_components.LadaHeadlight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("training.*")
public class AutosConfig {

    @Bean
    public LadaHeadlight getLadaLight() {
        return new LadaHeadlight();
    }

    @Bean
    public BMWBeep getBMWBeep() {
        return new BMWBeep();
    }

    @Bean
    public BMWWheels getBMWWheels() {
        return new BMWWheels();
    }

    @Bean
    public Auto2 getAuto() {
        return new Auto2("BMW", "black", 2011, getBMWBeep(), getLadaLight(), getBMWWheels());
    }
}

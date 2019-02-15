package configs;

import auto.Auto2;
import bmw_components.BMWBeep;
import bmw_components.BMWWheels;
import lada_components.LadaHeadlight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("auto")
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

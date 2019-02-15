import auto.Auto1;
import auto.Auto2;
import configs.AutosConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AutosConfig.class);
        Auto1 auto1 = (Auto1) context.getBean("auto1");
        Auto2 auto2 = context.getBean(Auto2.class);
        auto1.run();
        System.out.println("-------------------");
        auto2.run();
    }
}

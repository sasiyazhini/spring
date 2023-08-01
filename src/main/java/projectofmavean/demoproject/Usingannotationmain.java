package projectofmavean.demoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Usingannotationmain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Usingannotationmain.class, args);

        Usingannotation.Vini a = context.getBean(Usingannotation.Vini.class);
        a.sai();

        context.close();
    }
}

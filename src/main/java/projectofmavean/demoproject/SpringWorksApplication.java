package projectofmavean.demoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringWorksApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext context = SpringApplication.run(SpringWorksApplication.class, args);
	
	Control1 A = context.getBean(Control1.class);
	
	A.Work();
	
		
	}
}
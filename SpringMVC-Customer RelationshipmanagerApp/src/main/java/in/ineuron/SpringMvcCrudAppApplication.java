package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringMvcCrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcCrudAppApplication.class, args);
		System.out.println("Shri Swami Samarth");
	}

}

package in.ineuron;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.controller.MyController;

@SpringBootApplication
public class Boot03BasicAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Boot03BasicAppApplication.class, args);
		
		System.out.println("Container Bean Created id's :: "+Arrays.toString(context.getBeanDefinitionNames()));
		
		MyController controller = context.getBean(MyController.class);
		controller.getAllCustomer();
		
		
		((ConfigurableApplicationContext) context).close();
		
		
		
		
	}

}

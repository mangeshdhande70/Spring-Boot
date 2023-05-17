package in.ineuron;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import in.ineuron.service.WishMessage;

@SpringBootApplication
public class Boot01BasicAppApplication {
	
	
	static {
		System.out.println("Boot01BasicAppApplication .class file is Loading.....");
	}
	
	

	public Boot01BasicAppApplication() {
		System.out.println("Boot01BasicAppApplication object is created using zero param constructor");
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Boot01BasicAppApplication.class, args);
		
		System.out.println("Bean Id ::-> "+Arrays.toString(context.getBeanDefinitionNames()));
		
		WishMessage message = context.getBean(WishMessage.class);
		String msg = message.wishMsg("Diksha");
		
		System.out.println(msg);
		
	}
	
	
	@Bean
	public LocalDateTime createdObject() {
		return LocalDateTime.now();
	}
	

}

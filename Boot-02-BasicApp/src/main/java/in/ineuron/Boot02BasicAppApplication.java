package in.ineuron;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.service.Student;

@SpringBootApplication
public class Boot02BasicAppApplication {
	
	
	static {
		System.out.println("Boot02BasicAppApplication .class file is Loading.....");
	}
	
	

	public Boot02BasicAppApplication() {
		System.out.println("Boot02BasicAppApplication object is created using zero param constructor");
	}
	
	
	

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Boot02BasicAppApplication.class, args);
		
		System.out.println("Bean Id ::-> "+Arrays.toString(context.getBeanDefinitionNames()));
		
		Student student = context.getBean(Student.class);
//		System.out.println(student);
		
		student.preparation("java");
		
		
	
	}
		

}

package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	@Autowired
	@Qualifier(value = "bigData") // qualifier is more powerfull than @Primary
	private ICourse course;
	
	
	static {
		System.out.println("Student .class File is Loading....");
	}
	
	
	public Student() {
		System.out.println("Student object is created using zero param constructor");
	}

	
	public void preparation(String examName) {
		System.out.println("Student.preparation()");
		System.out.println("Course choose is :: "+course.getClass().getName());
	}
	
	
	
	
}

package in.ineuron.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private Logger logger = LoggerFactory.getLogger(Student.class);

	@Autowired(required = true)
	@Qualifier("courseId")
	private ICourse course;

	static {
		System.out.println("Student.class file is loading...");
	}

	public Student() {
		System.out.println("Student:: Zero param constructor...");
	}

	public void preparation(String examName) {
		System.out.println("Student.preparation()");
		System.out.println("Course choose is :: " + course.getClass().getName());

		String courseContent = course.courseContent();
		float price = course.price();
		logger.info("Price Set");
		System.out.println("Preparation is going on using " + courseContent + " material with price ::" + price);
		System.out.println("Preparation completed for ::" + examName);

	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}

}

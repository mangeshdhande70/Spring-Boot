package in.ineuron.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "java")
@Primary
public class JavaCourseImpl implements ICourse {
	
	
	static {
		System.out.println("JavaCourseImpl .class File is Loading....");
	}
	
	
	public JavaCourseImpl() {
		System.out.println("JavaCourseImpl object is created using zero param constructor");
	}

	@Override
	public String courseContent() {
		 System.out.println("JavaCourseImpl.courseContent()");
		return "Exceptional Handling , OPP's , CollectionAPI";
	}

	@Override
	public Float price() {
		System.out.println("JavaCourseImpl.price()");
		return 5000.0f;
	}

	@Override
	public String toString() {
		return "JavaCourseImpl []";
	}

	
	
}

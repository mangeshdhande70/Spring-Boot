package in.ineuron.service;

import org.springframework.stereotype.Component;

@Component(value = "ui")
public class UICourseMaterial implements ICourse {
	
	
	
	static {
		System.out.println("UICourseMaterial .class File is Loading....");
	}
	
	
	public UICourseMaterial() {
		System.out.println("UICourseMaterial object is created using zero param constructor");
	}

	@Override
	public String courseContent() {
		System.out.println("UICourseMaterial.courseContent()");
		return "HTML ,CSS , JS";
	}

	@Override
	public Float price() {
		return 3000f;
	}

	@Override
	public String toString() {
		return "UICourseMaterial []";
	}
	
	

}

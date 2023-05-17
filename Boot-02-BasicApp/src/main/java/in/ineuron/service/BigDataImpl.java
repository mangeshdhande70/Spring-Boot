package in.ineuron.service;

import org.springframework.stereotype.Component;

@Component(value = "bigData")
public class BigDataImpl implements ICourse {
	
	
	
	static {
		System.out.println("BigDataImpl .class File is Loading....");
	}
	
	
	public BigDataImpl() {
		System.out.println("BigDataImpl object is created using zero param constructor");
	}

	@Override
	public String courseContent() {
		System.out.println("BigDataImpl.courseContent()");
		return "mysql , hadoop , stats ";
	}

	@Override
	public Float price() {
	    System.out.println("BigDataImpl.price()");
		return 4890f;
	}

}

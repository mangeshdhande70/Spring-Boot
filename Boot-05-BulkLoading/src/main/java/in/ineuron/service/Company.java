package in.ineuron.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "org.info")
@PropertySource(value = "in/ineuron/input.properties")
public class Company {

	private String name;
	private String location;
	private Integer size;
	private String pincode;

	static {
		System.out.println("Company.class file is loading...");
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
		System.out.println("Company.setPincode()");
	}

	public Company() {
		System.out.println("Company:: Zero param constructor...");
	}

	public void setName(String name) {
		System.out.println("Company.setName()");
		this.name = name;
	}

	public void setLocation(String location) {
		System.out.println("Company.setLocation()");
		this.location = location;
	}

	public void setSize(Integer size) {
		System.out.println("Company.setSize()");
		this.size = size;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", size=" + size + ", pincode=" + pincode + "]";
	}

}

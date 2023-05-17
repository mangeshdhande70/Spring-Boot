package in.ineuron.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class WishMessage {

	
	@Autowired
	private LocalDateTime localDateTime;
	
	static {
		System.out.println("WishMessage .class file is loading......");
	}

	public WishMessage() {
		System.out.println("WishMessage object created using zero param constructor");
	}
	
	
	public String wishMsg(String name) {
		
		int time = localDateTime.getHour();
		
		if (time < 12) {
			return "Good Morning "+name +" , time :: "+time;
		}else if (time < 16) {
			return "Good Afternoon "+name+" , time :: "+time;
		}else if (time < 20) {
			return "Good Evening "+name+" , time :: "+time;
		}else {
			return "Good Night "+name+", time :: "+time;
		}
		
	}


	@Override
	public String toString() {
		return "WishMessage [localDateTime=" + localDateTime + "]";
	}
	
	
	
	
	
}

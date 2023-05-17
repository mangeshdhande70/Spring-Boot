package in.ineuron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICustomerService;

@Component
public class MyController {
	
	
	@Autowired
	private ICustomerService iCustomerService;
	
	public void getAllCustomer() {
		
		List<CustomerDTO> allCustomer = iCustomerService.getAllCustomer();
		
		allCustomer.forEach(System.out::println);
		
		
		
		
	}

}

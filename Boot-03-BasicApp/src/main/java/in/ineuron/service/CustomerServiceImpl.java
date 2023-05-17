package in.ineuron.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.ICustomerDAO;
import in.ineuron.dto.CustomerDTO;
import in.ineuron.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerDAO iCustomerDAO;
	
	List<CustomerDTO> customerDTOs = null;

	@Override
	public List<CustomerDTO> getAllCustomer() {
		
		
		List<Customer> customers = iCustomerDAO.findAllcustomer();
		
		customerDTOs = new ArrayList<>();
		
		customers.forEach((customer->{
			
			CustomerDTO customerDTO = new CustomerDTO();
			customerDTO.setCustId(customer.getCustId());
			customerDTO.setName(customer.getName());
			customerDTO.setAddress(customer.getAddress());
			
			customerDTOs.add(customerDTO);
			

		}));
		
	
		return customerDTOs;
	}

}

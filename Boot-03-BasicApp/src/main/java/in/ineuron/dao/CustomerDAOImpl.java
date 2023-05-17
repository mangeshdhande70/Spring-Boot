package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ineuron.model.Customer;

@Repository
public class CustomerDAOImpl implements ICustomerDAO {
	
	
	@Autowired
	private DataSource dataSource;

	
	private final String sQL_QUERY_SELECT = "SELECT * FROM customer";
	
	@Override
	public List<Customer> findAllcustomer() {
		
		List<Customer> list = null;
		
		try( Connection connection =dataSource.getConnection();PreparedStatement preparedStatement =connection.prepareStatement(sQL_QUERY_SELECT)){
		
			ResultSet resultSet = preparedStatement.executeQuery();
			
		      list = new ArrayList<>();
			
			while(resultSet.next()) {
				
				Customer customer = new Customer();
				customer.setCustId(resultSet.getInt(1));
				customer.setName(resultSet.getString(2));
				customer.setAddress(resultSet.getString(3));
				
				list.add(customer);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return list;
	}

}

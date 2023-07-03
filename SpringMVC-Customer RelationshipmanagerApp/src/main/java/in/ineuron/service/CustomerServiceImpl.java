package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.beans.Customer;
import in.ineuron.dao.ICustomerDao;

@Service("service")
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao dao;
	
	@Override
	public List<Customer> getAllCustomer() {
		Iterable<Customer> findAll = dao.findAll();
		return (List<Customer>) findAll;
	}

	@Override
	public void saveCustomer(Customer customer) {
		dao.save(customer);
		
	}

	@Override
	public Customer getCustomer(Integer id) {
		Optional<Customer> customer = dao.findById(id);
		return customer.get();
	}

	@Override
	public void DeleteCustomer(Integer id) {
	
		dao.deleteById(id);
		
	}

	
	
	
	

	

	

	

}

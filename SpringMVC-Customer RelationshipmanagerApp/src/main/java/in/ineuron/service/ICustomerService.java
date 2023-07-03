package in.ineuron.service;

import java.util.List;

import in.ineuron.beans.Customer;

public interface ICustomerService {

	public List<Customer> getAllCustomer();
	public void saveCustomer(Customer customer);
	public Customer getCustomer(Integer id);
	public void DeleteCustomer(Integer id);
}

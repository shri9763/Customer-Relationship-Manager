package in.ineuron.dao;

import org.springframework.data.repository.CrudRepository;

import in.ineuron.beans.Customer;


public interface ICustomerDao extends CrudRepository<Customer,Integer> {

}

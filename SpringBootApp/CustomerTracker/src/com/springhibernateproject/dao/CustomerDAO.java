package com.springhibernateproject.dao;

import java.util.List;
import com.springhibernateproject.entities.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
	public Customer getCustomer(int id);
	public void deleteCustomer(int id);
}

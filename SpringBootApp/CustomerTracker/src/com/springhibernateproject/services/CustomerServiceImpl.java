package com.springhibernateproject.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springhibernateproject.dao.CustomerDAO;
import com.springhibernateproject.entities.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerdao;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
	    List<Customer> customerlist=	customerdao.getCustomers();
		return customerlist;
	}
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {

		customerdao.saveCustomer(theCustomer);
		
	}
	@Override
	@Transactional
	public Customer getCustomer(int id) {
        
		return customerdao.getCustomer(id);
	}
	@Override
	@Transactional
	public void deleteCustomer(int id) {
		customerdao.deleteCustomer(id);
		
	}

}

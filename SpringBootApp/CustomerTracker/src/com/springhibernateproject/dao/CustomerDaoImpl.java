package com.springhibernateproject.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springhibernateproject.entities.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
	
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query= session.createQuery("from Customer",Customer.class);
		List<Customer> customerlist = query.getResultList();
	
		return customerlist;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from Customer where id=:customerid");
		query.setParameter("customerid", id);
		query.executeUpdate();
		
	}

}

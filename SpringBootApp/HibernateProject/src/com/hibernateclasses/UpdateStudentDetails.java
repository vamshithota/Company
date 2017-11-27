package com.hibernateclasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class UpdateStudentDetails {

	public static void main(String args[]){
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			int studentid =1;
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			Student studentdetails = session.get(Student.class,studentid);
			//updating the name
			studentdetails.setFirstName("vamshi");
			//committing the code
			session.getTransaction().commit();
			
			//beggining new transaction
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			System.out.println("updating all the email ids at a time");
			session.createQuery("update Student set email= 'all@gmail.com'").executeUpdate();
			System.out.println("!done");			
		}
		finally{
			session.close();
		}
		
		
		
	}
	
	
}

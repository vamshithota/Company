package com.hibernateclasses;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class QueryStudentData {
	
	private static void displayDetails(List<Student> stulist){
		System.out.println(stulist);
	}

	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		SessionFactory sesionfactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = sesionfactory.getCurrentSession();
		try{
			session.beginTransaction();
			
			List<Student> studentlist = session.createQuery("from Student").getResultList();
			//displaying all student
			displayDetails(studentlist);
			
			//displaying students with last name 'krish'
			studentlist = session.createQuery("from Student s where s.lastName = 'kumar'").getResultList();
			displayDetails(studentlist);
			
			//displaying names with first name = vam OR last name = kumar 
			studentlist = session.createQuery("from Student s where" + " s.lastName='kumar' OR s.firstName='vam'").getResultList();
			displayDetails(studentlist);
			
			//querying student emails having '@gmail.com'
			studentlist = session.createQuery("from Student s where" + " s.email LIKE '%gmail.com'").getResultList();
			displayDetails(studentlist);
			
			session.getTransaction().commit();
					
		}finally{
			session.close();
		}
		
		
		
	}
	
}

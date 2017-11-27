package com.hibernateclasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class InseringInStudent {

	public static void main(String args[]){
		
		SessionFactory sessionfactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = sessionfactory.getCurrentSession();
		try{
			System.out.println("creating new student object");
			Student student = new Student("hari","krshi","vamshi@gmail.com");
			Student student1 = new Student("ram","kumar","ram@gmail.com");
			Student student2 = new Student("ajith","krishna","ajith@gmail.com");
			Student student3 = new Student("madhav","madhav","maddy@gmail.com");
			
			session.beginTransaction();
			System.out.println("saving the buisness object");
			session.save(student);
			session.save(student1);
			session.save(student2);
			session.save(student3);
			
			//commiting the transaction
			session.getTransaction().commit();
			System.out.println("Commit done!");
			
		}finally{
			sessionfactory.close();
		}
		
	}
	
}

package com.hibernate.MainclassPackage;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.EntitiesPackage.Instructor;
import com.hibernate.EntitiesPackage.InstructorDetail;

public class BidirectionalDemo {
	public static void main(String main[]){
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try{
			session.beginTransaction();
			int id =2;
			 InstructorDetail ins= session.get(InstructorDetail.class, id);
			 System.out.println("instructor details is " + ins);
			 System.out.println("the associated instructor" + ins.getInstructor());
			 session.getTransaction().commit();
			 	 
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
		finally{
			session.close();
			factory.close();
		}
		
	}
}

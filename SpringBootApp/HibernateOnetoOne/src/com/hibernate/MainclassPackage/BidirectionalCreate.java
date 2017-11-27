package com.hibernate.MainclassPackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.EntitiesPackage.Instructor;
import com.hibernate.EntitiesPackage.InstructorDetail;

public class BidirectionalCreate {
	public static void main(String main[]){
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			
			Instructor ins = new Instructor("Raju", "thota", "vamshi@gmail.com");
			InstructorDetail details =new InstructorDetail("Coding", "Raju@youtube.com");
			ins.setInsdetails(details);
			session.beginTransaction();
			session.save(ins);
			session.getTransaction().commit();
			System.out.println("succesfull");
		}finally{
			session.close();
			factory.close();
		}
	}
}

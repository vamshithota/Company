package com.hibernate.MainclassPackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.EntitiesPackage.Instructor;
import com.hibernate.EntitiesPackage.InstructorDetail;

public class CreateEntitiesEg {

	public static void main(String main[]){
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
					
			Instructor ins = new Instructor("vamshi","krishna","vamshi@gmail.com");
			Instructor ins1 = new Instructor("ram","krishna","ram@gmail.com");
			
			InstructorDetail insdetails = new InstructorDetail("reading", "vamshi@youtube.com");
			InstructorDetail insdetails2 = new InstructorDetail("surfing", "ram@youtube.com");
			
			ins.setInsdetails(insdetails);
			ins1.setInsdetails(insdetails2);
			
			session.beginTransaction();
			session.save(ins);
			session.save(ins1);
		
			
		session.getTransaction().commit();
			
		}finally{
			session.close();
		}
	}
	
	
}

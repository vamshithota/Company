package com.hibernate.MainclassPackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.EntitiesPackage.Instructor;
import com.hibernate.EntitiesPackage.InstructorDetail;

public class DeleteEntitiesEg {
	public static void main(String main[]){
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			session.beginTransaction();
			int id =3;
		 Instructor inst =  session.get(Instructor.class, id);
		 if(inst != null){
			 session.delete(inst);
			 
		 }
		 session.getTransaction().commit();
		 System.out.println("deleted id with " + id);
			
					
			
		}finally{
			session.close();
		}
		
	}
}

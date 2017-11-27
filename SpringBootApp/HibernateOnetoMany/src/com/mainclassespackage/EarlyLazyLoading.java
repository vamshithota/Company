package com.mainclassespackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Course;
import com.entities.Instructor;
import com.entities.InstructorDetail;

public class EarlyLazyLoading {
	public static void main(String main[]){
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Course.class).addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			session.beginTransaction();
			int id =1;
			Instructor instructor = session.get(Instructor.class, id);
			System.out.println("instructor details are folllwing" + instructor);
			System.out.println("instructor course folwing" + instructor.getCourses());
			session.getTransaction().commit();
					
		}finally{
			factory.close();session.close();
		}
		
	}
	
	
}

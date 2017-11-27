package com.mainclassespackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Course;
import com.entities.Instructor;
import com.entities.InstructorDetail;

public class CreateInstructor {
	public static void main(String main[]){
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			Instructor instructor = new Instructor("vamshi", "krishna", "vamshi@instruct.com"); 
			Instructor instructor1 = new Instructor("ram", "krishna", "ram@instruct.com");
			InstructorDetail insdetail = new InstructorDetail("running", "vamshi@youtube.com");
			InstructorDetail insdetail1 = new InstructorDetail("teaching", "ram@youtube.com");
			instructor.setInsdetails(insdetail);
			instructor1.setInsdetails(insdetail1);
			session.beginTransaction();
			session.save(instructor);
			session.save(instructor1); 
			session.getTransaction().commit();
			
		}finally{
			session.close();
			factory.close();
		}
		
	}
	
}

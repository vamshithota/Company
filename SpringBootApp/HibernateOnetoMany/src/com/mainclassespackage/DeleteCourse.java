package com.mainclassespackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Course;
import com.entities.Instructor;
import com.entities.InstructorDetail;

public class DeleteCourse {
	public static void main(String main[]){
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			session.beginTransaction();
			int id =1;
			Course course = session.get(Course.class, id);
			session.delete(course);
			session.getTransaction().commit();
			
		}finally{
			session.close();
			factory.close();
		}
		
	}
}

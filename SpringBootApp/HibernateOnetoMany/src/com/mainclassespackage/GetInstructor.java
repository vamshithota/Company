package com.mainclassespackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Course;
import com.entities.Instructor;
import com.entities.InstructorDetail;

public class GetInstructor {
	public static void main(String main[]){
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Course.class).addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			session.beginTransaction();
			int id =1;
			Instructor inst = session.get(Instructor.class, id);
			System.out.println("instructor details are : " + inst);
			System.out.println("instructors courses are : " + inst.getCourses());
			session.getTransaction().commit();
			
			
		}finally{
		
			session.close();
			factory.close();
		}
		
	}
}

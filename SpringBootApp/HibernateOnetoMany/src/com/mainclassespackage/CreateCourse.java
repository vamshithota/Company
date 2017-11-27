package com.mainclassespackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Course;
import com.entities.Instructor;
import com.entities.InstructorDetail;

public class CreateCourse {
	public static void main(String main[]){
		
		SessionFactory factroy = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factroy.getCurrentSession();
		try{
			session.beginTransaction();
			int id1 =1;
			int id2 =2;
		     Instructor inst1=session.get(Instructor.class, id1);
		     Instructor inst2=session.get(Instructor.class, id2);
			Course guitarcourse = new Course("guitar");
			Course violincourse = new Course("violin");
		
			//inst1.add(guitarcourse);
			inst1.add(violincourse);
			
			//inst2.add(violincourse);
			inst2.add(guitarcourse);
			
			session.save(guitarcourse);
			session.save(violincourse);
			
			session.getTransaction().commit();
			
			
		}finally{
		session.close();factroy.close();	
		}
		
	}
}

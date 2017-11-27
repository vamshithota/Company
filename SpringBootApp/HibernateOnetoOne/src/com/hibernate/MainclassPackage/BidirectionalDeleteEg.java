package com.hibernate.MainclassPackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.EntitiesPackage.Instructor;
import com.hibernate.EntitiesPackage.InstructorDetail;

public class BidirectionalDeleteEg {

	public static void main(String main[]){
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try{
			session.beginTransaction();
			int id =2;
            InstructorDetail details = session.get(InstructorDetail.class, id);
         // print the instructor detail
         			System.out.println("tempInstructorDetail: " + details);
         						
         			// print  the associated instructor
         			System.out.println("the associated instructor: " + 
         					details.getInstructor());
         			

            details.getInstructor().setInsdetails(null);
            session.delete(details);
            session.getTransaction().commit();
            
			
		}finally{
			factory.close(); 
            session.close();
		}
	
}
}
package com.hibernateclasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class DeleteStudent {
	public static void main(String args[]){
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = null;
		
		try{
			session =factory.getCurrentSession();
			session.beginTransaction();
			/*int stuId=3;
			//getting student with id 3
			Student stu = session.get(Student.class, stuId);
			//deleting the student
			session.delete(stu);*/
			
			
			session.createQuery("delete from Student where id=4").executeUpdate();
			session.getTransaction().commit();
		}
		finally{
			session.close();
		}
	}
}

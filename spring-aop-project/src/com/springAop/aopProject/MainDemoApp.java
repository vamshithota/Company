package com.springAop.aopProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springAop.DAO.AccountDAO;
import com.springAop.DAO.MemebershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		//get bean from spring container
		AccountDAO accountdao = context.getBean("accountDAO", AccountDAO.class);
		
		//call business method
		accountdao.addAccount();
				
		//testing wild card pointcut
		accountdao.addWildCardMethod();
		Account accunt = new Account();
		accountdao.addAccountWithMultipleParameters(accunt,true);
		//calling parameterized method
		Account theAccountdao = new Account();
		accountdao.addAccountWithParameter(theAccountdao);
		accountdao.setName("vamshi");
		accountdao.setPincode("1234");
		accountdao.getName();
		accountdao.getPincode();
		
		
		MemebershipDAO memebershipdao = context.getBean("memebershipDAO", MemebershipDAO.class);
		memebershipdao.addAccount();
		
		 
		
		
		
		//closing applicationcontext
		context.close();
		
		
	}
}

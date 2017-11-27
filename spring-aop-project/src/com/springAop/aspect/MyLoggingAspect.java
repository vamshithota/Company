package com.springAop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

	// @Before("execution(public void addAccount())")
	// when we need pointcut to be applied only for only method in a particular
	// class
	// @Before("execution(public void com.springAop.DAO.AccountDAO.addAccount())")
	// when we need pointcut to be applied to any method which start with 'add'
	// @Before("execution(public void add*())")
	// when we need pointcut to be applied for any return type of method
	// @Before("execution(* add*())")
	// @Before("execution(* add*(com.springAop.aopProject.Account,..))")
	// pointcut for any return type, from specific folder and with any number of
	// paramters. Here first * represents
	// return type next package name and first '.*' represents any class and second
	// '.*' represents any method
	// and brackets with double dots represents parameters
/*	@Before("execution(* com.springAop.DAO.*.*(..) )")
	public void beforeAddAcountProcess() {
		System.out.println("From Before Aspect class MyloggingAspect................................");
	}*/
	
	
	//declaring a point cut expression, name of method should be 'void' type. This is like declaring 
	// a variable and reusing it
/*	@Pointcut("execution(* com.springAop.DAO.*.*(..) )")
	private void forDaoPack() {}
	
	
	//creating pointcut for getter methods
	@Pointcut("execution(* com.springAop.DAO.*.get*(..) )")
	private void noGetters() {}
	//creating pointcut for setter methods
	@Pointcut("execution(* com.springAop.DAO.*.set*(..) )")
	private void noSetters() {}
	//combining the poincuts to avoid advices to be applied on getters n setters
	@Pointcut("forDaoPack() && !(noGetters() || noSetters())")
	private void forDAOPackAvoidSettersNGetters() {}
	
@Before("forDAOPackAvoidSettersNGetters()")
	public void beforeAddAcountProcess() {
		System.out.println("From Before Aspect class MyloggingAspect................................");
	}
	
	//trying to use declared aspect on another advice
	@Before("forDAOPackAvoidSettersNGetters()")
	public void secondFunction() {
		System.out.println("this is second function calling.....");
	}
*/	

}

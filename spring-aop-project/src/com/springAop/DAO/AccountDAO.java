package com.springAop.DAO;

import org.springframework.stereotype.Component;

import com.springAop.aopProject.Account;

@Component
public class AccountDAO {

	
	private String name;
	private String pincode;
	
	public String getName() {
		System.out.println("in get name method()");
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("inside setname() " + name);
	}

	public String getPincode() {
		System.out.println("inside get name method");
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
		System.out.println("inside setpincode() " + pincode);
	}

	public void addAccount() {
		System.out.println("doing db works from " + AccountDAO.class );
		
	}
	
	public boolean addWildCardMethod() {
		//System.out.println("Trying wild card Aspect ");
		return true;
	}
	public void addAccountWithParameter(Account account) {
		System.out.println( "from parameterized add account method " );
		
	}
	
	public void addAccountWithMultipleParameters(Account account, boolean val) {
		System.out.println( "from parameterized multiple add account method " );
		
	}
	
}

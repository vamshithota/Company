package com.springAop.DAO;

import org.springframework.stereotype.Component;

@Component
public class MemebershipDAO {

	public void addAccount() {
		System.out.println("From membership dao doing DB works" + MemebershipDAO.class);
	}
}

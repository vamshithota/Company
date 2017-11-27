package com.springbootstarter;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserServiceDao {

	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;

	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Eve", new Date()));
		users.add(new User(3, "Jack", new Date()));
	}
	
	public List<User> getAllUsers(){
		return users;
		}
	
	public User getUserByid(int id) {
		for(User user:users ) {
			if(user.getId() == id) {
				return user;
			}
			} 
		return null;
	}
	
	public User saveUser(User user) {
		if(user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public User deletebyId(int id) {
		Iterator<User> userslist = users.iterator();
		while(userslist.hasNext()) {
			User user= userslist.next();
			if(user.getId() == id) {
				userslist.remove();
				return user;
			}
			}
			return null;
		}
	
}

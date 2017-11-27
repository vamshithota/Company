package com.springbootstarter;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserService {

	@Autowired
	UserServiceDao userservicedao;
	
@GetMapping("/getallusers")	
public List<User> getuserDetails() {
	return userservicedao.getAllUsers();
}

@GetMapping("/getuserbyid/{id}")
public User getUserById(@PathVariable int id) {
User user=	userservicedao.getUserByid(id);

if(user == null) throw new UserNotFoundException("user not found");
return user;
	
}

@DeleteMapping("/deletebyid/{id}")	
public void deleteUserByid(@PathVariable int id) {
 User user=	userservicedao.deletebyId(id);
 
 
  if(user == null) {
	 throw new UserNotFoundException("id-"+ id);		
 }
}
	


@PostMapping("/savecustomer")
public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
  
	
	User saveduser=  userservicedao.saveUser(user);
	
	URI location = ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(saveduser.getId()).toUri();
	
	return ResponseEntity.created(location).build();
}

}

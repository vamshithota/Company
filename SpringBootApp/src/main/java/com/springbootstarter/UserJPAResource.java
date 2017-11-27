package com.springbootstarter;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserJPAResource {

	@Autowired
	UserRepository userrepo;
	
	@Autowired
	PostRepository postrepo;
	
	@GetMapping("/jpa/getallusers")
	public List<User> getAllUsers(){
		 return	userrepo.findAll();
	  
	}
	
	@GetMapping("/jpa/getuserbyid/{id}")
	public Resource<User> getuserbyId(@PathVariable int id){

		
		Optional<User> user = userrepo.findById(id);
		if(!user.isPresent()) throw new UserNotFoundException("id " + id);
		Resource<User> resource = new Resource<User>(user.get());
		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getAllUsers());
		resource.add(linkTo.withRel("all-users"));

		// HATEOAS

		return resource;
		
	}
	
	@DeleteMapping("jpa/deletebyid/{id}")
	public void deleteUserByid(@PathVariable int id) {
		
	userrepo.deleteById(id);
}

	@PostMapping("/jpa/createuser")
	public ResponseEntity<Object> creatUser(@Valid @RequestBody User user){
		
		User newUser = userrepo.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newUser.getId())
				.toUri();
        return ResponseEntity.created(location).build();
	}

}

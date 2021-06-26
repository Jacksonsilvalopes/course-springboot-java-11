package com.jacks.web.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jacks.web.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){		
	 User u = new User(1L, "Jackson Silva Lopes", "j.a.ckson@hotmail.com", "95922-9874", "spt1034");
	return ResponseEntity.ok().body(u);
	}

}

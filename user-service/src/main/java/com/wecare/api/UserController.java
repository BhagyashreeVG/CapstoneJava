package com.wecare.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wecare.request.UserRequest;
import com.wecare.response.UserResponse;
import com.wecare.service.UserService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping
public class UserController {

	@Autowired
	UserService service;
	
	
	@PostMapping("/user")
	public UserResponse addUser(@RequestBody UserRequest userRequest) {
		return service.addUser(userRequest);
	}
	
	@GetMapping("/user/{id}")
	public UserResponse getUser(@PathVariable int id) {
		return service.getUser(id);
	}
}

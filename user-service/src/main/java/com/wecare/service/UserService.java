package com.wecare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecare.entity.User;
import com.wecare.repository.UserRepo;
import com.wecare.request.UserRequest;
import com.wecare.response.UserResponse;

@Service
public class UserService {

	@Autowired
	UserRepo repo;
	
	public UserResponse addUser(UserRequest userRequest) {
		User user = new User();
		user.setName(userRequest.getName());
		user.setPassword(userRequest.getPassword());
		user.setDob(userRequest.getDob());
		user.setGender(userRequest.getGender());
		user.setMobile(userRequest.getMobile());
		user.setEmail(userRequest.getEmail());
		user.setPincode(userRequest.getPincode());
		user.setCity(userRequest.getCity());
		user.setCountry(userRequest.getCountry());
		user.setState(userRequest.getState());
		
		user = repo.save(user);
		UserResponse response = new UserResponse(user);
		return response;
	}
	
	public UserResponse getUser(int id) {
		User user = repo.findById(id).get();
		return new UserResponse(user);
	}
}

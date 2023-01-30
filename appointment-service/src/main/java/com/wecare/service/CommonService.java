package com.wecare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecare.feignclients.UserFeignClient;
import com.wecare.response.UserResponse;

@Service
public class CommonService {

	@Autowired
	UserFeignClient userFeignClient;
	
	public UserResponse getUserById (int userId) {
	
		UserResponse userResponse = 
				userFeignClient.getUser(userId);
		
		return userResponse;
	}
	
}

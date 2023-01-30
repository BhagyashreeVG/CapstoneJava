package com.wecare.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wecare.response.UserResponse;

@FeignClient(value = "api-gateway")
public interface UserFeignClient {
	
	@GetMapping("/user/{id}")
	public UserResponse getUser(@PathVariable int id);
}

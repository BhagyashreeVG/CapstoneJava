package com.wecare.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wecare.request.CoachRequest;
import com.wecare.response.CoachResponse;
import com.wecare.service.CoachService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping
public class CoachController {

	@Autowired
	CoachService service;
	
	
	@PostMapping("/coach")
	public CoachResponse addCoach(@RequestBody CoachRequest coachRequest) {
		return service.addCoach(coachRequest);
	}
	
	@GetMapping("/coach/{id}")
	public CoachResponse getCoach(@PathVariable int id) {
		return service.getCoach(id);
	}
}

package com.wecare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecare.entity.Coach;
import com.wecare.repository.CoachRepo;
import com.wecare.request.CoachRequest;
import com.wecare.response.CoachResponse;

@Service
public class CoachService {

	@Autowired
	CoachRepo repo;
	
	public CoachResponse addCoach(CoachRequest coachRequest) {
		Coach coach = new Coach();
		coach.setName(coachRequest.getName());
		coach.setPassword(coachRequest.getPassword());
		coach.setDob(coachRequest.getDob());
		coach.setGender(coachRequest.getGender());
		coach.setMobile(coachRequest.getMobile());
		coach.setSpeciality(coachRequest.getSpeciality());
		
		coach = repo.save(coach);
		CoachResponse response = new CoachResponse(coach);
		return response;
	}
	
	public CoachResponse getCoach(int id) {
		Coach coach = repo.findById(id).get();
		return new CoachResponse(coach);
	}
}

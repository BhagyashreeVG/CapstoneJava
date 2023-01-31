package com.wecare.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecare.entity.Appointment;
import com.wecare.repository.AppointmentRepo;
import com.wecare.request.AppoitmentRequest;
import com.wecare.response.AppointmentResponse;

@Service
public class AppointmentService {

	@Autowired
	AppointmentRepo repo;
	
	@Autowired
	CommonService service;
	
//	public CoachResponse addCoach(CoachRequest coachRequest) {
//		Coach coach = new Coach();
//		coach.setName(coachRequest.getName());
//		coach.setPassword(coachRequest.getPassword());
//		coach.setDob(coachRequest.getDob());
//		coach.setGender(coachRequest.getGender());
//		coach.setMobile(coachRequest.getMobile());
//		coach.setSpeciality(coachRequest.getSpeciality());
//		
//		coach = repo.save(coach);
//		CoachResponse response = new CoachResponse(coach);
//		return response;
//	}
	
	public List<AppointmentResponse> getAppointment(int userId) {
		System.out.println(repo.findByUserId(userId));
		List<Appointment> app = new ArrayList<Appointment>();
		List<AppointmentResponse> appResponse = new ArrayList<AppointmentResponse>();
		
		 app = repo.findByUserId(userId);
		 
		 Iterator itr = app.iterator();
		 while(itr.hasNext()) {
			 appResponse.add(new AppointmentResponse((Appointment)itr.next()));
		 }
		 return appResponse;
	}
	
	public List<AppointmentResponse> getAppointmentForCoach(int userId) {
		System.out.println(repo.findByCoachId(userId));
		List<Appointment> app = new ArrayList<Appointment>();
		List<AppointmentResponse> appResponse = new ArrayList<AppointmentResponse>();
		
		 app = repo.findByCoachId(userId);
		 
		 Iterator itr = app.iterator();
		 while(itr.hasNext()) {
			 appResponse.add(new AppointmentResponse((Appointment)itr.next()));
		 }
		 return appResponse;
	}
	
	public void deleteAppointment(int userId) {
		repo.deleteById(userId);
	}

	public void addAppointment(AppoitmentRequest request) {
		Appointment app = new Appointment(request);
		repo.save(app);	
	}
	
//	public List<CoachResponse> getAllCoach() {
//		List<CoachResponse> coachResponseList = new ArrayList<CoachResponse>();
//		List<Coach> coachList = new ArrayList<Coach>();
//		coachList = repo.findAll();
//		
//		Iterator itr = coachList.iterator();
//		
//		while( itr.hasNext()) {
//			CoachResponse res = new CoachResponse((Coach)itr.next());
//			coachResponseList.add(res);
//		}
//		
//		return coachResponseList;
//	}
}

package com.wecare.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wecare.request.AppoitmentRequest;
import com.wecare.response.AppointmentResponse;
import com.wecare.service.AppointmentService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping
public class AppointmentController {

	@Autowired
	AppointmentService service;
	
	
	@GetMapping("/coach/{id}")
	public List<AppointmentResponse> getCoach(@PathVariable int id) {
		return service.getAppointment(id);
	}
	
	@GetMapping("/getcoach/{id}")
	public List<AppointmentResponse> getACoach(@PathVariable int id) {
		return service.getAppointmentForCoach(id);
	}
	
	@DeleteMapping("/coach/{id}")
	public void deleteAppointment(@PathVariable int id) {
		service.deleteAppointment(id);
	}
	
	@PostMapping("/addApp")
	public void addAppointment(@RequestBody AppoitmentRequest request) {
		service.addAppointment(request);
	}
}

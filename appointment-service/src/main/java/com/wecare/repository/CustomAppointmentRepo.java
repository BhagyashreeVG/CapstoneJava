package com.wecare.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.wecare.entity.Appointment;
import com.wecare.response.AppointmentResponse;
import com.wecare.service.CommonService;

public class CustomAppointmentRepo {
//	@PersistenceContext
//	EntityManager entityManager;
//	
//	public static final CommonService service = new CommonService();
//	
//	public AppointmentResponse getAppointmentByUserid(int userId) {
//		Query query = entityManager.createQuery("Select * from appointment where user_id='${userId');");
//		Appointment app = new Appointment();
//		app = (Appointment) query.getSingleResult();
//		AppointmentResponse res = new AppointmentResponse(app);
//		res.setUserResponse(service.getUserById(userId));
//		return res;
//	}
}


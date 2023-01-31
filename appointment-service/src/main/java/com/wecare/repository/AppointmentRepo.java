package com.wecare.repository;

import java.util.List;

import javax.persistence.EntityManager;
//import javax.persistence.Query;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wecare.entity.Appointment;
import com.wecare.response.AppointmentResponse;
import com.wecare.service.CommonService;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer>{

	
   @Query(value = "From Appointment where user_id=:param") 
   List<Appointment> findByUserId(@Param("param")int userId); 
	 
   @Query(value = "From Appointment where coach_id=:param") 
   List<Appointment> findByCoachId(@Param("param")int userId); 
	/*
	 * @PersistenceContext
	 * 
	 * @Autowired EntityManager entityManager = null;
	 * 
	 * public static final CommonService service = new CommonService();
	 * 
	 * public default AppointmentResponse getAppointmentByUserid(int userId) { Query
	 * query = entityManager.
	 * createQuery("Select * from appointment where user_id='${userId');");
	 * Appointment app = new Appointment(); app = (Appointment)
	 * query.getSingleResult(); AppointmentResponse res = new
	 * AppointmentResponse(app); res.setUserResponse(service.getUserById(userId));
	 * return res; }
	 */
}

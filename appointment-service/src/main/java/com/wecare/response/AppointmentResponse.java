package com.wecare.response;

import com.wecare.entity.Appointment;

public class AppointmentResponse {
	private int id;
	private String date;
	private String slot;
	private int userId;
	private int coachId;
	private UserResponse userResponse;
	
	public AppointmentResponse(Appointment app) {
		this.id = app.getId();
		this.date = app.getDate();
		this.slot = app.getSlot();
		this.userId = app.getUserId();
		this.coachId = app.getCoachId();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCoachId() {
		return coachId;
	}

	public void setCoachId(int coachId) {
		this.coachId = coachId;
	}

	public UserResponse getUserResponse() {
		return userResponse;
	}

	public void setUserResponse(UserResponse userResponse) {
		this.userResponse = userResponse;
	}
	
}

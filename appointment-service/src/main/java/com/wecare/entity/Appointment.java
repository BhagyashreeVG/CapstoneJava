package com.wecare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.wecare.request.AppoitmentRequest;

@Entity
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="app_date")
	private String date;
	
	@Column(name="app_slot")
	private String slot;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="coach_id")
	private int coachId;
	
	public Appointment() {
		super();
	}

	public Appointment(AppoitmentRequest req) {
		this.date = req.getDate();
		this.slot = req.getSlot();
		this.userId = req.getUserId();
		this.coachId = req.getCoachId();
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
}

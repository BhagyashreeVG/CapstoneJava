package com.wecare.response;

import com.wecare.entity.Coach;

public class CoachResponse {
	private int id;
	private String name;
	private String password;
	private String gender;
	private String dob;
	private long mobile;
	private String speciality;
	
	public CoachResponse(Coach coach) {
		this.id = coach.getId();
		this.name = coach.getName();
		this.password = coach.getPassword();
		this.dob = coach.getDob();
		this.mobile = coach.getMobile();
		this.speciality = coach.getSpeciality();
		this.gender = coach.getGender();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
}

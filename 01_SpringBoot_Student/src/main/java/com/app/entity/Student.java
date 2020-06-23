package com.app.entity;

import java.util.Arrays;

import lombok.Data;

@Data
public class Student {

	private String name;
	private String pwd;
	private String email;
	private String gender;
	private Long phno;
	private String course;
	private String[] preferrableTimings;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String[] getPreferrableTimings() {
		return preferrableTimings;
	}
	public void setPreferrableTimings(String[] preferrableTimings) {
		this.preferrableTimings = preferrableTimings;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", pwd=" + pwd + ", email=" + email + ", gender=" + gender + ", phno=" + phno
				+ ", course=" + course + ", preferrableTimings=" + Arrays.toString(preferrableTimings) + "]";
	}
	
	
}

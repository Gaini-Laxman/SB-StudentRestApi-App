package com.klinnovations.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private String gender;
	private String course;
	private String[] timings;

	public Student() {

	}

	public Student(Integer id, String name, String email, String gender, String course, String[] timings) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.course = course;
		this.timings = timings;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String[] getTimings() {
		return timings;
	}

	public void setTimings(String[] timings) {
		this.timings = timings;
	}

}

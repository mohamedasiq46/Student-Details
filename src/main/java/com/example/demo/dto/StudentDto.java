package com.example.demo.dto;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;

public class StudentDto {

	private int id;
	private String name;
	@DateTimeFormat(pattern= "dd-MM-yyyy")
	@JsonFormat(pattern= "dd-MM-yyyy")
    @Column(name = "dob")
    private Date dob;
	private String address;
	
	public int getId() {
		return id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}

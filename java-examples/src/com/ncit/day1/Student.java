package com.ncit.day1;

import java.util.Date;

public class Student {
	
	
	// Pojo : like database representation of table.
	
	int id;
	String firstName, lastName, mobile;
	Date admissionDate;
	boolean status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void printStudent()
	{
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(mobile);
		System.out.println(status);
		System.out.println(admissionDate);
	}
	

}


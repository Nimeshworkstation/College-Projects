package com.ncit.day1;

public class StudentOperations {
	
	public void printStudent(Student student)
	{
		System.out.println(student.getId());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getMobile());
		System.out.println(student.isStatus());
		System.out.println(student.getAdmissionDate());
	}

}

package com.ncit.oops;

public class ConstructorDemo {

	public ConstructorDemo()
	{
		System.out.println("Default Constructor is loaded");
	}
	
	public ConstructorDemo(String message)
	{
		this();
		System.out.println("Parameterized Constructor with message: "+message);
	}
	
	
}

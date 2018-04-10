package com.ncit.oops;

public class DisplayOverloading {
	
	/**
	 Overloading:
	 1.no.of parameters
	 2.type of parameters
	 3.sequence of parameters
	 
	 Questions:
	 1.) -> int MyMethod(int a, int b, float c);          (Invalid case)
	     -> int MyMethod(int var1, int var2, float var3);
	     							
	 2.) -> void MyMethod(int a, int b);				  (valid case)
	     -> void MyMethod(float var1, float var2);
	     
	 3.) -> void MyMethod(int a, int b);                  (valid case)
	     -> void MyMethod(int num);
	     
	 4.) -> float MyMethod(int a, float b);                (valid case)
	     -> float MyMethod(float var1, int var2);
	     
	 5.) -> void MyMethod(int a, int b);                   (Invalid case)
	     -> void MyMethod(int var1, int var2);
	  **/

	public void display(String str)                            
	{
		System.out.println(str);
	}
	
	public void display(String str, int num)
	{
		System.out.println("Display with two parameters:");
		System.out.println(str);
		System.out.println(num);
	}
	
	public void display(int num)
	{
		System.out.println("Display with integer parameters:");
		System.out.println(num);
	}
	
	public void display(int num,String str)
	{
		System.out.println("Display with two parameters, exchanged:");
		System.out.println(str);
		System.out.println(num);
	}
}

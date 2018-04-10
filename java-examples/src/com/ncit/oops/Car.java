package com.ncit.oops;

public class Car extends Vehicle{
	
	/**
	  Inheritance:
	  -> IS-a rule
	  
	  -> Java does not support multiple inheritance.
	  -> Encapsulation in java using getter and setter
	  
	 **/
	public int cC;
	public int gears;
	
	public void printCarAttributes()
	{
		System.out.println("CC of car :"+cC);
		System.out.println("Gears of car:"+gears);
	}

	public int getcC() {
		return cC;
	}

	public void setcC(int cC) {
		this.cC = cC;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}
	
	public void run() {
		super.run();
		System.out.println("Car is running");
	}
	
	
}

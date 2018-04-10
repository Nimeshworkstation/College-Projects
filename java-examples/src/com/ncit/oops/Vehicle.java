package com.ncit.oops;

public class Vehicle {
	
	String color;
	int speed;
	int size;
	
	public void printAttributes()
	{
		System.out.println("Color: "+color);
		System.out.println("Size: "+size);
		System.out.println("Speed: "+speed);
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void run() {
		System.out.println("Vehicle is running");
	}

}

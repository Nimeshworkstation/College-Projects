package com.ncit.day2;

public class Rectangle {
	
	int length, breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int calculateArea()
	{
		return length * breadth;
	}
	

}

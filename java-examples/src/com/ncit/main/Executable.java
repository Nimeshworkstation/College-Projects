/**
 * 
 */
package com.ncit.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ncit.collection.Department;
import com.ncit.collection.MyList;
import com.ncit.day1.Student;
import com.ncit.day1.StudentOperations;
import com.ncit.day2.Rectangle;
import com.ncit.day2.User;
import com.ncit.day2.UserService;
import com.ncit.day2.UserServiceInterface;
import com.ncit.euler.Problem1;
import com.ncit.oops.AggregationDemo;
import com.ncit.oops.Car;
import com.ncit.oops.ConstructorDemo;
import com.ncit.oops.DisplayOverloading;
import com.ncit.oops.Vehicle;

/**
 * @author Siddhant
 *
 */
public class Executable {

	/**
	  -> without creating object we can call method if it is static.
	  -> static method call will be in italic.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student Information
		setStudentAndPrint();
	
		//User Service
		userService();
		
		//Rectangle Area
		rectangleArea();
		
		//Constructor Demo
		ConstructorDemo demo = new ConstructorDemo();
		ConstructorDemo demo1 = new ConstructorDemo("Parameter");
		
		//Aggregation Demo
		AggregationDemo.doSomething();
		
		//Project Euler Problems
		projectEuler();
		
		//OOPS : 24th September 2016
		oopsLecture();
		
		//Collections List: 25th September 2016 
		collectionList();
		
		
		/**
		StudentOperations studentOperation = new StudentOperations();
		studentOperation.printStudent(st1);
		System.out.println("\n");
		studentOperation.printStudent(st2);   **/
		
		System.out.println("We are back again");
		
		List<Department> departmentList = new ArrayList<Department>();
		List<Department> newDepartmentList = addDepartmentToList(departmentList);
		
		Map<String, Department> departmentMap = new HashMap<String, Department>();
		
		Map<String, List<Department>> departmentListMap = new HashMap<String, List<Department>>();
		departmentListMap.put("Test", departmentList);
		
	
	}
	
	public static void setStudentAndPrint()
	{
		// Creating Student 1
		Student st1 = new Student();

		st1.setId(1);
		st1.setFirstName("Ram");
		st1.setLastName("Gurung");
		st1.setMobile("9817653428");
		st1.setStatus(true);
		st1.setAdmissionDate(new Date());

		// Creating Student 2
		Student st2 = new Student();

		st2.setId(2);
		st2.setFirstName("Shyam");
		st2.setLastName("Thapa");
		st2.setMobile("9847653428");
		st2.setStatus(false);
		st2.setAdmissionDate(new Date());
	
		
		System.out.println("Information of Students:\n"); // Sysout and press
		                                                  // control+space
		st1.printStudent();
		System.out.println("----------------------------------------------------------\n"); 
		st2.printStudent(); 
		System.out.println("----------------------------------------------------------\n"); 
		
	}
	
	public static void userService()
	{
		User user = new User();
		user.setUsername("Ram");
		user.setPassword("password");
		
		UserService userService = new UserService();
		boolean isValid = userService.doLogin(user);
		
		
		if(isValid)
		{
			System.out.println("Username and Password matches, let him move ahead !!");
		}
		else
		{
			System.out.println("Username and Password is incorrect, Stop him !!");
		}		
	}
	
	public static void rectangleArea()
	{
		Rectangle rectangle = new Rectangle();
		
		rectangle.setLength(2);
		rectangle.setBreadth(2);

		int area = rectangle.calculateArea();
		
		System.out.println("\n");
		System.out.println("Length:"+ rectangle.getLength());
		//System.out.println("\n");
		System.out.println("Breadth:"+ rectangle.getBreadth());
		//System.out.println("\n");
		System.out.println("Area of Rectangle:"+ (float)area);
	}
	
	public static void oopsLecture()
	{
		  Vehicle v1 = new Vehicle();
			v1.setColor("Black");
			v1.setSize(4);
			v1.setSpeed(100);    
			
			v1.printAttributes();  
			
			Car c1 = new Car();
			c1.setcC(3000);
			c1.setGears(6);
			c1.setColor("Blue");
			c1.setSize(6);
			c1.setSpeed(200);
			
			c1.printCarAttributes();
			c1.printAttributes();
			
			DisplayOverloading disp = new DisplayOverloading();
			disp.display("Test");
			
			v1.run();
			c1.run();
			
	}
	
	public static void collectionList()
	{
		System.out.println("This is for java collections");
		
		//Collection code start here
				MyList mList = new MyList();
				
				//Create List and print
				mList.createList();
				mList.printSize();
				mList.printItems();
				
				//Add by index and print
				mList.addByIndex();
				mList.printSize();
				mList.printItems();
				
				//Update Index and Print
				mList.updateByIndex();
				mList.printItems();
				
				//Get Index Position
				mList.getIndexPosition();
				
				//Print If Value exists
				mList.isValueExist("Sita");
				
				//Remove Item and Print
				mList.removeItem();
				mList.printSize();
				mList.printItems();
				
				//Create a List again and print
				mList.createList();
				mList.printSize();
				mList.printItems();
				mList.getIndexPosition();
				
				//Remove all and print
				mList.removeList();
				mList.printSize();
	}
	
	public static void projectEuler()
	{
		//Calculate sum of Multiple of 3 and 5 , Problem1
				System.out.println("Sum:"+Problem1.calculateSum(10));
	}
	
	public static List<Department> addDepartmentToList(List<Department> departmentList)
	{
		Department depart1 = new Department();
		depart1.setId(1);
		depart1.setName("IT");
		depart1.setDescription("This is IT department");
		
		departmentList.add(depart1);
		
		Department depart2 = new Department();
		depart2.setId(2);
		depart2.setName("Computer");
		depart2.setDescription("This is Computer department");
		
		departmentList.add(depart2);
		
		Department depart3 = new Department();
		depart3.setId(3);
		depart3.setName("Electrical & Communication");
		depart3.setDescription("This is Electrical & Communication department");
		
		departmentList.add(depart3);
		
		Department depart4 = new Department();
		depart4.setId(4);
		depart4.setName("Software");
		depart4.setDescription("This is Software department");
		
		departmentList.add(depart4);
		
		return departmentList;
		
		
	}
		
}

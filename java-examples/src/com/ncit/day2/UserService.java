package com.ncit.day2;

public class UserService {

	public boolean doLogin(User user)
	{
		if(user.getUsername() == "Ram" && user.getPassword() == "password")
		{
			return true;
		}
		return false;
		
	}
	
	public boolean stringLogin(User user)
	{
		if(user.getUsername().equals("Ram") && user.getPassword().equals("password"))
		{
			return true;
		}
		return false;
	}
}

package com.ncit.collection;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	
	/**
	 1. List:
	 -> ArrayList : allow duplicate items or values.
	 **/
	
	List<String> strList = new ArrayList<>();
	
	public void createList()
	{
		strList.add("Ram");
		strList.add("Shyam");
		strList.add("Hari");
		strList.add("Madan");
		strList.add("Saroj");
	}
	
	public void removeList()
	{
		strList.clear();
	}
	
	public void addByIndex()
	{
		strList.add(5, "Radheshyam");
	}
	
	public void updateByIndex()
	{
		strList.set(4,"Birodh");
		
	}
	
	public void getIndexPosition()
	{
		strList.indexOf("Ram");
		System.out.println("The position of Ram is: "+strList.indexOf("Ram"));
		System.out.println("----------------------------------------------\n");
	}
	
	public void printValueByIndex()
	{
		System.out.println("Value 1:"+strList.get(0));
		System.out.println("Value 2:"+strList.get(1));
		System.out.println("Value 3:"+strList.get(2));
		System.out.println("Value 4:"+strList.get(3));
		System.out.println("Value 5:"+strList.get(4));
		System.out.println("-------------------------------\n");
	}
	
	public void printSize()
	{
		System.out.println("The size of the List is: "+strList.size());
		System.out.println("----------------------------------------------\n");
	}
	
	public void isValueExist(String str)
	{
		for(int i=0; i<strList.size();i++)
		{
			if(str.equals(strList.get(i)))
			{
				System.out.println("The Value "+str+" exist in list !!");
			}
			else
			{
				System.out.println("The Value "+str+" does not exist in list !!");
			}
			break;
		}
		
	/**	System.out.println("Does Hareram exist? "+strList.contains("Hareram"));
		System.out.println("----------------------------------------------\n");
		System.out.println("Does Birodh exist? "+strList.contains("Birodh"));  **/
		System.out.println("----------------------------------------------\n"); 
	}
	
	public void removeItem()
	{
		strList.remove(1);
		System.out.println("----------------------------------------------\n");
		strList.remove("Madan");
		System.out.println("----------------------------------------------\n");
	}
	
	public void printItems()
	{
		System.out.println("List Items:");
		for (int i = 0; i<strList.size(); i++)
		{
			System.out.println("Value "+ (i+1)+":"+strList.get(i));
		}
		System.out.println("--------------------------------\n");
	}
	
	
}

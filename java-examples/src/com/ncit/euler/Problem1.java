package com.ncit.euler;

public class Problem1 {
	
	public static int calculateSum(int num)
	{
		
		int sum = 0;
		
		for(int i=0; i<num;i++)
		{
			if(i%3 == 0 || i%5 ==0 )
			{
				sum=sum+i;
			}
		}
		
		return sum;
	}

}

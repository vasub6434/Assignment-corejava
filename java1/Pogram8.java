package com.fundamental;

public class Pogram8 {
	public static void main(String[] args) {
		int i;
		
		for(i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("Divisible by 3 and 5 :"+i);
			}
			else if(i%3==0)
			{
				System.out.println("Divisible by 3 :"+i);
			}
			else if(i%5==0)
			{
				System.out.println("Divisible by 5 :"+i);
			}
			
		}
	
	}

}

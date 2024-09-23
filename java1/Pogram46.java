package com.fundamental;

public class Pogram46 {
	
	public static void validate(int age) {
		if(age<18)
		{
			throw new ArithmeticException("voting are not allowed");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String[] args) {
		try
		{
			validate(16);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
}
}


package com.fundamental;

import java.util.Scanner;

class member{
	
	String name;
	int age;
	double phonenumber;
	String address;
	float salary;
	
	Scanner sc=new Scanner(System.in);
	
	member()
	{
		System.out.println("Enter a name :");
		name=sc.next();
		System.out.println("Enter a age :");
		age=sc.nextInt();
		System.out.println("Enter a phonenumber :");
		phonenumber=sc.nextDouble();
		System.out.println("Enter a address :");
		address=sc.next();
		System.out.println("Enter a salary :");
		salary=sc.nextFloat();
	}
	void printdata()
	{
			System.out.println("name :"+name);
			System.out.println("age :"+age);
			System.out.println("phonenumber :"+phonenumber);
			System.out.println("address :"+address);
			System.out.println("salary :"+salary);
	}
		
			
}
public class Pogram17{
	  public static void main(String[] args) {
		  member t=new member();
		  t.printdata();
	  }
	  
}
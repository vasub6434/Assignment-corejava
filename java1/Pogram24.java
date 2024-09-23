package com.fundamental;

import java.util.Scanner;

abstract class Shape
{
	abstract void rectanglearea(int length,int breadth);
	
	abstract void squarearea(int side);
	
	abstract void circlearea(float radius);
}
class Area extends Shape
{
	void rectanglearea(int length, int breadth)
	{
		int Area = length*breadth;
		System.out.println("Rectangle Area :"+Area);
	}

	void squarearea(int side) 
	{
		int Area=side*side;
		System.out.println("Square Area :"+Area);
		
	}
	void circlearea(float radius)
	{
		double Area=3.14*radius*radius;
		System.out.println("Circle Area :"+Area);
	}
}
public class Pogram24
{
	public static void main(String[] args)
	{
		Area a=new Area();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a length :");
		int length=sc.nextInt();
		System.out.println("Enter a breadth :");
		int breadth=sc.nextInt();
		System.out.println("Enter a side :");
		int side=sc.nextInt();
		System.out.println("Enter a radius :");
		float radius=sc.nextFloat();
		
		a.rectanglearea(length, breadth);
		a.squarearea(side);
		a.circlearea(radius);
	}

}

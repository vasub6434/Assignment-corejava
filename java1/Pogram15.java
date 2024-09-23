package com.fundamental;

public class Pogram15 {
	int side;
	int breadth;
	int length;
	
	 void printarea(int s)
	{
		side=s;
		System.out.println("Area of square :"+side*side);
	}
	 void printarea(int b,int l)
	 {
		 breadth=b;
		 length=l;
		 System.out.println("Area of rectangle :"+length*breadth);
	 }
	
	public static void main(String[] args) {
		Pogram15 p=new Pogram15();
		
		p.printarea(4);
		p.printarea(2, 6);
	}

}


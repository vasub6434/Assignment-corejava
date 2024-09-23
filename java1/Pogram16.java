package com.fundamental;


class Pogram16 {
	void print_data()
	{
		System.out.println("This is a parent class");
	}
class child extends Pogram16{
	void print1_data()
	{
		System.out.println("This is a child class");
	}
	void print2_data()
	{
		System.out.println("This is a parent class and child class");
	}
}
}
public class Main
{
	public static void main(String[] args) {
		Pogram16 p=new Pogram16();
		p.print_data();
		
		child c=new Pogram16();
		c.print1_data();
		c.print2_data();
		
	}

}

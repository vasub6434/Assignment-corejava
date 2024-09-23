package com.fundamental;

public class Pogram42 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
		System.out.println("Start code");
		
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("not divide by zero");
		}
		
		try {
			int arr[]= {10,20,30,40,50};
			System.out.println(arr[4]);
		}
		catch(Exception s) {
			System.out.println(s);
		}
		System.out.println("End code");
	}

}

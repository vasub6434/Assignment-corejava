package com.fundamental;

import java.util.Scanner;

public class Pogram23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result = 1;
		for(int i=1;i<=n;i++)
		{
			result*=i;
		}
		System.out.println("factorial number is :"+result);
		
	}

}

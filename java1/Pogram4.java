package com.fundamental;

import java.util.Scanner;

public class Pogram4 {
	public static void main(String[] args) {
		
		int n1,n2,n3,n4,n5,i,sum=0,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1 :");
		n1=sc.nextInt();
		System.out.println("Enter n2 :");
		n2=sc.nextInt();
		System.out.println("Enter n3 :");
		n3=sc.nextInt();
		System.out.println("Enter n4 :");
		n4=sc.nextInt();
		System.out.println("Enter n5 :");
		n5=sc.nextInt();
		
		for(i=n1;i<=n5;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of :"+sum);
		
		avg=sum/5;
		
		System.out.println("Average :"+avg);
	}

}

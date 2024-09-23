package com.fundamental;

import java.util.Scanner;

public class Pogram6 {
	public static void main(String[] args) {
		int i,j,count=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n :");
		n=sc.nextInt();
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}

}

package com.fundamental;

import java.util.Scanner;

public class Pogram12 {
	public static void main(String[] args) {
		int a[][]=new int [2][2];
		int b[][]=new int [2][2];
		int c[][]=new int [2][2];
		int d[][]=new int [2][2];
		int e[][]=new int [2][2];
		
		int i,j;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first matrix data");
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("first matrix");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("second matrix");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Addition");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Subtraction");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				d[i][j]=a[i][j]-b[i][j];
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Multiplication");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				e[i][j]=a[i][j]*b[i][j];
				System.out.print(e[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}

package com.fundamental;

import java.util.Scanner;

public class Pogram1 {
	public static void main(String[] args) {
		int a,b,c,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A :");
        a=sc.nextInt();
        System.out.println("Enter B :");
        b=sc.nextInt();
        System.out.println("Enter c :");
        c=sc.nextInt();
        
        max=a;
        
        if(b>max)
        {
        	max=b;
        }
        if(c>max)
        {
        	max=c;
        }
        System.out.println("Gratest number is :"+max);
		
	}
}
	
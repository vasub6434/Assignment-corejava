package com.fundamental;

import java.util.Scanner;

public class Pogram35 {
	public static void main(String[] args) {
		String str, strend;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		str = sc.nextLine();
		System.out.print("Enter the end string : ");
		strend = sc.nextLine();
		
		boolean ans = str.endsWith(strend);

		System.out.println(ans);
	}
}

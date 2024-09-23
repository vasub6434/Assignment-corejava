package com.fundamental;

import java.util.Scanner;

public class Pogram34 {
	public static void main(String[] args) {
		String str, strstart;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		str = sc.nextLine();
		System.out.print("Enter the end string : ");
		strstart = sc.nextLine();
		
		boolean ans = str.startsWith(strstart);

		System.out.println(ans);
	}
}

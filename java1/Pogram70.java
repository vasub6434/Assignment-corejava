package com.fundamental;

import java.util.ArrayList;

public class Pogram70 {
	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<>();
		
		a1.add("red");
		a1.add("yellow");
		a1.add("blue");
		a1.add("pink");
		a1.add("brown");
		
		ArrayList<String> a2=new ArrayList<>();
		a2.add("red");
		a2.add("blue");
		a2.add("pink");
		a2.add("brown");
		
		boolean b1=a1.equals(a2);
		
		System.out.println(b1);
	}

}

package com.fundamental;

import java.util.ArrayList;

public class Pogram59 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		if(list.contains(8))
		{
			System.out.println("This is a found");
		}
		else
		{
			System.out.println("This is not found");
		}
	}

}

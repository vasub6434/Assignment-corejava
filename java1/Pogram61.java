package com.fundamental;

import java.util.ArrayList;

public class Pogram61 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		System.out.println("copy");
		ArrayList<Integer> list1=list;
		System.out.println(list1);
		
	}

}

package com.fundamental;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Pogram68 {
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}
}

package com.fundamental;

import java.util.ArrayList;
import java.util.Collections;

public class Pogram62 {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		
		list.add("vasu");
		list.add("kunj");
		list.add("haresh");
		list.add("bharat");
		list.add("pravin");
		
		System.out.println(list);
		
		Collections.shuffle(list);
		
		System.out.println(list);
		
		
	}

}

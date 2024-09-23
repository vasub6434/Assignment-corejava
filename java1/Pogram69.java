package com.fundamental;

import java.util.ArrayList;
import java.util.List;

public class Pogram69 {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		
		a1.add("vasu");
		a1.add("kunj");
		a1.add("haresh");
		a1.add("mahesh");
		a1.add("bharat");
		
		System.out.println(a1);
		
		List<String> a2 = a1.subList(0, 3);
		
		System.out.println(a2);
	}

}

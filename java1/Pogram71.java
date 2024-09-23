package com.fundamental;

import java.util.ArrayList;
import java.util.Collections;

public class Pogram71 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		Collections.swap(list, 0, 1);
		
		System.out.println(list);
	}

}

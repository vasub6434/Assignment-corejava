package com.fundamental;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Pogram60 {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		list1.add(6);
		list1.add(2);
		list1.add(1);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		System.out.println(list1);
		
		Collections.sort(list1);
		
		Iterator itr=list1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}

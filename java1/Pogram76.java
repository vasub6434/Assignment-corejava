package com.fundamental;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Pogram76 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet();
		hs.add(156);
		hs.add(54);
		hs.add(235);
		hs.add(123);
		hs.add(102);
		hs.add(79);
		hs.add(99);
		
		System.out.println("Set : " + hs);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Iterator<Integer> itr = hs.iterator();
		int i=0;
		while(itr.hasNext()) {
			list.add((Integer) itr.next());
			i++;
		}
		System.out.println("list : " + list);

	}
}

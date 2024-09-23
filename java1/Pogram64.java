package com.fundamental;

import java.util.HashSet;
import java.util.Iterator;

public class Pogram64 {
	public static void main(String[] args) {
		HashSet<String> list=new HashSet<>();
		
		list.add("red");
		list.add("yellow");
		list.add("green");
		list.add("white");
		list.add("blue");
		list.add("pink");
		
		System.out.println(list);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
	}

}

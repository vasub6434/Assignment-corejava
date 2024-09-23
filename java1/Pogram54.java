package com.fundamental;

import java.util.ArrayList;
import java.util.Iterator;

public class Pogram54 {
	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<>();
		
		name.add("vasu");
		name.add("kunj");
		name.add("haresh");
		
		Iterator<String> itr=name.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

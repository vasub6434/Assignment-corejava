package com.fundamental;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Pogram67 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		Scanner sc = new Scanner(System.in);
		hm.put(1, "vasu");
		hm.put(2, "kunj");
		hm.put(3, "haresh");
		
		
		System.out.println(hm);
		System.out.println("Enter key : ");
		int key = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter value : ");
		String value = sc.nextLine();
		hm.put(key, value);
		
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

package com.fundamental;

import java.util.ArrayList;

public class Pogram80 {
	public static void main(String[] args) {
		ArrayList<String> brands = new ArrayList<String>();
		brands.add("bmw");
		brands.add("honda");
		brands.add("suzuki");
		brands.add("kia");
		
		
		for(int i=0;i<brands.size();i++) {
			System.out.println("brands[" + i + "] = " + brands.get(i));
		}
	}
}

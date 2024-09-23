package com.fundamental;

import java.util.HashSet;

public class Pogram81 {
	public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("vasu");
        set1.add("kunj");
        set1.add("haresh");
        set1.add("mahesh");

        HashSet<String> set2 = new HashSet<>();
        set2.add("kunj");
        set2.add("haresh");
        set2.add("bharat");
        set2.add("amit");

        System.out.println("Original set1: " + set1);
        System.out.println("Original set2: " + set2);

        set1.retainAll(set2);

        System.out.println("Common elements: " + set1);
    }
}

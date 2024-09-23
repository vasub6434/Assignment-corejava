package com.fundamental;

import java.util.HashMap;

public class Pogram77 {
	public static void main(String[] args) {
        HashMap<String, Integer> mapWithEntries = new HashMap<>();
        mapWithEntries.put("vasu", 1);
        mapWithEntries.put("kunj", 2);
        mapWithEntries.put("yash", 3);

        HashMap<String, Integer> emptyMap = new HashMap<>();

        System.out.println("Map with entries is empty: " + mapWithEntries.isEmpty());
        System.out.println("Empty map is empty: " + emptyMap.isEmpty());
    }
}

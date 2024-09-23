package com.fundamental;

import java.util.Collection;
import java.util.HashMap;

public class Pogram82 {
	public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("bmw", 1);
        map.put("honda", 2);
        map.put("audi", 3);
        map.put("kia", 4);

        Collection<Integer> values = map.values();

        System.out.println("Collection view of the values: " + values);
    }
}

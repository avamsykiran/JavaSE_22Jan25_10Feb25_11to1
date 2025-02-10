package com.cts.javafundas;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App12CollectionsDemo {

	public static void main(String[] args) {
		
		Map<String,Integer> scores = new TreeMap<>();
		
		scores.put("Math", 90);
		scores.put("Physics", 80);
		scores.put("Chemistry", 50);
		scores.put("Computers", 100);
		
		Set<String> subjects = scores.keySet();
		
		for(String sub:subjects) {
			System.out.println(sub +": "+scores.get(sub));
		}
	}

}

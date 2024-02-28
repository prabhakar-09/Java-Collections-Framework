package com.collections.framework.hashMaps;

import java.util.*;

// Different ways of iterating over a hashmap 
public class HashMapIterate {

	public static void main(String[] args) {

		Map<String, Integer> beerCollection = new HashMap<>();
		
		beerCollection.put("Carlsberg", 1);
		beerCollection.put("Budwiser", 2);
		beerCollection.put("Kingfisher", 3);
		beerCollection.put("Bira", 4);
		beerCollection.put("KnockOut", 5);
		
//		Iterating using forEach loop:
//		Map has an Entry interface to help with iterating over it
//		entrySet() returns set of entries its KV pair
		for(Map.Entry<String, Integer> entry : beerCollection.entrySet()) {
			
			System.out.println("key -> " + entry.getKey() + " value -> " + entry.getValue());
		}
		
//		Iterating using iterator 
//		Set has an iterator method inside of it
		Set<Map.Entry<String, Integer>> entry = beerCollection.entrySet();
		
		Iterator<Map.Entry<String, Integer>> iter = entry.iterator();
		
		while(iter.hasNext()) {
			
			Map.Entry<String, Integer> entries = iter.next();
			
			System.out.println("Key " + entries.getKey() + " Value " + entries.getValue());
		}
		
		System.out.println();
		System.out.println("Using java 8 forEach");
//		Iterating hashmap using java 8 forEach method.
		beerCollection.forEach((K,V)->{
			System.out.println("Key " + K + " Value " + V);
		});
		
	}

}

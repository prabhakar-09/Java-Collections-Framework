package com.collections.framework.LinkedLists;
import java.util.*;

public class LinkedListsSearchIter {

	public static void main(String [] args) {
		
		LinkedList<String> languages = new LinkedList<>();
		
		languages.add("Hindi");
		languages.add("English");
		languages.add("Kannada");
		languages.add("Telugu");
		languages.add("Tamil");
		languages.add("Telugu");

		
		System.out.println(languages.contains("Hindi")); // Returns true if exists.
		
//		Finding index of first occurrence in a linkedList
		System.out.println(languages.indexOf("Telugu")); // returns 3
		
//		Finding elements of last occurrences of elements
		System.out.println(languages.lastIndexOf("Telugu")); // returns 5
		
//		Iterator : 
		Iterator<String> iter = languages.iterator();
		while(iter.hasNext()) {
			
			String value = (String) iter.next();
			
			System.out.println(value); 
		}
		
//		using for each loop:
		System.out.println();
		languages.forEach((elem)->{
			System.out.println("Inside forEach " + elem);
		});
		
		System.out.println();
		
//		advanced for each loop
		for(String lang : languages) {
			
			System.out.println("Inside advanced for "+lang);
		}
		
		System.out.println();

//		Simple for loops 
		for(int i=0;i<languages.size();i++) {
			System.out.println("Inside normal for " + languages.get(i));
		}
		
		
	}
}

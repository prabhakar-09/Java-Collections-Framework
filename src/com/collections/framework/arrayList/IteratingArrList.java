package com.collections.framework.arrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratingArrList {

	public static void main(String[] args) {

		List<String> friends = Arrays.asList("Siddu", "Sumeet", "Dinesh", "Raju", "Shravan");
		
		System.out.println(friends);
		
		for(int i=0;i<friends.size();i++) { // Just a basic for loop 
			
			System.out.println(friends.get(i)); // accessing each element of the list 
		}
		
		System.out.println();
		
//		Enhanced for each loop:
		
		for(String dost : friends) {
			System.out.println(dost);
		}
		
		System.out.println();
//		iterating the list using iterator..
		
		for (Iterator iterator = friends.iterator(); iterator.hasNext();) {
			String dost = (String) iterator.next();
			
			System.out.println(dost);
		}
		
		System.out.println();
		
//		Initializing iterator interface to initialize & then while loop to loop in the collection..
		
		Iterator<String> elemList = friends.iterator();
		
		while (elemList.hasNext()) {
			String dost = (String) elemList.next();
			
			System.out.println(dost);
		}
		
//		Iterating through the list using java streams & lambda expressions...
		System.out.println();
		System.out.println("Print using streams.");
		friends.stream().forEach(value -> System.out.println(value));
		
//		iterating using for each & lambda expressions...
		System.out.println();
		System.out.println("Print using lambda expressions & for each");
		friends.forEach((value)->System.out.println(value));
		
		
		
	}

}

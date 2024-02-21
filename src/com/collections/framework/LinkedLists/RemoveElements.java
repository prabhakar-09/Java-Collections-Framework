package com.collections.framework.LinkedLists;

import java.util.LinkedList;

// Removing elements from the LL
// Removing First elem
// Removing Last elem 
// Removing first occurrence of the elem in the LL
// Clearing LL completely

public class RemoveElements {

	public static void main(String[] args) {

		LinkedList<String> celebs = new LinkedList<>();
		
		celebs.add("Sushant");
		celebs.add("Rajkumar Rao");
		celebs.add("Salman Bhoi");
		celebs.add("Kartik Aryan");
		celebs.add("Mahesh Babu");
		
		System.out.println("Initial LL -> "+celebs);
		
		System.out.println();
		
		System.out.println("Removing first elem -> " + celebs.removeFirst()); // celebs.removeFirst() will return removed element
		
		System.out.println();
		
		System.out.println("LL after removing first elem " + celebs);
		
		System.out.println();

//		Removing last element 
		System.out.println("Removing last elem -> " + celebs.removeLast());
		
		System.out.println();

		System.out.println("LL after removing last elem " + celebs);

		System.out.println();
//		Removing first occurrence of the elem in the LL
		
		celebs.remove("Salman Bhoi");
		
		System.out.println(celebs);
		
		System.out.println();
		
		celebs.clear(); // clearing LL completely
		
		System.out.print(celebs);
	}

}

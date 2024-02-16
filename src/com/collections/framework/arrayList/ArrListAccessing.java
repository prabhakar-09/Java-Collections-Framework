package com.collections.framework.arrayList;

import java.util.*;

public class ArrListAccessing {

	public static void main(String[] args) {

		List<String> programming = new ArrayList<>();
		
		System.out.println("Check if arrList obj is empty : " + programming.isEmpty()); // Empty arrList check
		
		programming.add("C");
		programming.add("Java");
		programming.add("Python");
		programming.add("CPP");
		programming.add("Go");
		
//		returns true if empty false otherwise.
		System.out.println("Check if arrList obj is empty : " + programming.isEmpty()); // Empty arrList check

//		Getting the length of the array List 
		System.out.println(programming.size() + " is the size of array list");
		
//		retrieving elements from specific indices..
		String language = programming.get(0);
		System.out.println("PL at index 0 is "+language);
		
//		Modifying an element 
		programming.set(3, "Bhai Lang"); // modifying an existing language at index 3 to other...
		
		System.out.println(programming);
	}

}

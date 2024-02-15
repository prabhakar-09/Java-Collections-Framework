package com.collections.framework.arrayList;

import java.util.ArrayList;
import java.util.List;

// Note :
/*Resizable array-based implementation.
Allows duplicates and maintains insertion order.
Provides constant-time random access.
Automatically increases capacity when needed.
Not thread-safe by default.*/

public class ArrayListExamples {

	public static void main(String[] args) {
		
//		creating ArrayList object using List interface as reference type
		List<String> food = new ArrayList<>();
		
		food.add("Momos");
		food.add("Cakes");
		food.add("Bread");
		food.add("Donut"); // every new element we add it appends to the end of the list 
	}
}

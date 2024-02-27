package com.collections.framework.hashSet;

import java.util.*;

/*Iterating HashSets using :
	Enhanced for loop
	basic loop with iterator
	while loop with iterator
	JDK 8 with forEach() method with lambda
	JDK 8 with forEach() + streams + lambda
*/
	
public class IteratingHashSets {

	public static void main(String[] args) {

		Set<String> movies = new HashSet<>();
		
		movies.add("Hum Apke Hain Kaun?");
		movies.add("Kahani Ghar Ghar ki!");
		movies.add("Sirf Tum");
		movies.add("Raaz");
		movies.add("1920");
		
		System.out.println("Existing list "+movies); // this wont maintain sequential insertions
		
//		iterating for loop:
		for(String movie : movies) {
			
			System.out.println(movie);
		}
		
		System.out.println();
		
//		basic loop with iterator
		for (Iterator iterator = movies.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("Basic loop + iterator : " + string);
		}
		
		System.out.println();
		
//		While loop iterator 
		Iterator iter = movies.iterator();
		while (iter.hasNext()) {
			String type = (String) iter.next();
			System.out.println("While + iterator " + type);
		}
		
		System.out.println();
		
//		forEach with lambda functions
		movies.forEach(movie -> System.out.println("forEach + lambda " + movie));
		
		System.out.println();
		
//		forEach with streams & lambda
		movies.stream().forEach(movie -> System.out.println("stream + lambda "+ movie));
		
		System.out.println();
		System.out.println(" Moviess excluding 'Sirf Tum'");
		System.out.println("````````````````````````````````");
		movies.stream().filter(movie -> !"Sirf Tum".equals(movie))
		.forEach(movie -> System.out.println(" " + movie));
	}

}

/*
 * breakdown of when to use each iteration method:
 * 
 * Enhanced for-loop (for-each loop):
 * 
 * When: Use this when you want a concise and readable way to iterate over all
 * elements in the collection. 
 * 
 * Why: It's the simplest and most intuitive way to
 * loop through a collection. It provides a clean syntax without the need for
 * explicit iterator handling. 
 * 
 * Basic loop with iterator:
 * 
 * When: Use this when you need more control over the iteration process, such as
 * when you want to remove elements from the collection while iterating.
 * 
 * Why: It gives you explicit control over the iterator, allowing you to modify the
 * collection while iterating without causing a ConcurrentModificationException.
 * 
 * While loop with iterator:
 * 
 * When: Use this when you prefer the structure of a while loop or when you need
 * to perform specific operations before or after each iteration. 
 * 
 * Why: It's similar to the basic loop with iterator but provides a different syntax. You
 * can use it if you're more comfortable with while loops or if you need to
 * perform additional logic within the loop.
 * 
 * forEach with lambda functions:
 * 
 * When: Use this when you want a concise and functional approach to iterate
 * over elements, especially when performing simple operations on each element.
 * 
 * Why: It's a modern and concise way to iterate over collections using lambda
 * expressions. It's particularly useful when you want to perform actions on
 * each element without boilerplate code. 
 * 
 * forEach with streams & lambda:
 * 
 * When: Use this when you want to take advantage of Java streams for
 * functional-style programming, especially when dealing with large collections
 * and performing complex operations. 
 * 
 * Why: It leverages the power of Java
 * streams, allowing for parallel processing and a more functional programming
 * style. It's suitable for complex operations like filtering, mapping, and
 * reducing. 
 * 
 * Each iteration method has its own strengths and use cases, so
 * choose the one that best fits your specific requirements and coding style.
 */
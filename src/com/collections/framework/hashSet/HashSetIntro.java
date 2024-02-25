package com.collections.framework.hashSet;
import java.util.*;

// Intro about HashSets
public class HashSetIntro {

	public static void main(String[] args) {
	
		duplicateDemo();
		System.out.println();
		nullValueDemo();
		System.out.println();
		hashSetOrder();
	}
	
	public static void duplicateDemo() {
		Set<String> elem = new HashSet<>();

		// Whenever a hash set finds a duplicate element it overrides with the existing one.
		
		elem.add("Hii");
		elem.add("Hii");
		
		System.out.println(elem); // No duplicate elements will be added to the HashSet.
	}
	
//	A set can only contain one null value.
	public static void nullValueDemo() {
		Set<String> values = new HashSet<>();
		
		values.add(null);
		values.add("Test");
		values.add(null);
		
		System.out.println("One null value allowed " + values);
	}
	
	public static void hashSetOrder() {
		Set<String> orderElem = new HashSet<>();
		
		orderElem.add("Elem 1");
		orderElem.add("Elem 2");
		orderElem.add("Elem 3");
		orderElem.add("Elem 4");
		orderElem.add("Elem 5");
		orderElem.add("Elem 6");
		orderElem.add("Elem 6");
		
		System.out.println("Hash set order " + orderElem);
	}
	
//	HashSet is not thread safe : meaning if multiple threads performs operations on a particular HashSet 
//	then the outcome is non deterministic.
//	to use hashset in multithreaded env we need to implement synchronization
	
	

}

// Things to know about HashSets:

/*
 * Unique Elements: HashSet stores unique elements only; it doesn't allow
 * duplicate elements.
 * 
 * Ordering: HashSet does not maintain the order of elements; elements are
 * stored in an unordered manner.
 * 
 * Underlying Structure: HashSet uses a hash table for storage, which provides
 * constant-time performance for basic operations like add, remove, contains,
 * and size.
 * 
 * Null Values: HashSet allows a single null value to be stored, as it
 * internally uses HashMap which permits one null key.
 * 
 * Performance: HashSet provides constant-time performance for basic operations,
 * such as add, remove, contains, and size, assuming a good hash function and
 * properly distributed elements.
 * 
 * No Index-based Access: HashSet does not provide index-based access to
 * elements as it does not maintain insertion order.
 * 
 * Iterating: HashSet supports efficient iteration through elements using
 * iterators.
 * 
 * No Duplicate Elements: When adding elements to a HashSet, duplicate elements
 * are automatically eliminated.
 * 
 * Thread Safety: HashSet is not thread-safe by default. If you need a
 * thread-safe implementation, you can use the Collections.synchronizedSet()
 * method to create a synchronized set.
 * 
 * Set Operations: HashSet supports various set operations like union,
 * intersection, difference, and subset checking.
 */

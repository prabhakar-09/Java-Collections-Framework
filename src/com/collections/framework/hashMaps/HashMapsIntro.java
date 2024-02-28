package com.collections.framework.hashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Parent is a MAP interface 
public class HashMapsIntro {

	public static void main(String[] args) {
		
//	Ref typ : Map
		Map<String, Integer> students = new HashMap<>();
		
//		adding        key   value pairs to students with their roll no
		students.put("Aman", 1);
		students.put("Abhi", 2);
		students.put("Bheem", 3);
		students.put("Dholu", 4);
		students.put("Chaman C", 5);
		students.put("Raju", 6);
		
		students.put(null, 7); // adding one null key
		students.put(null, 8); // If i try to add one more null key it will replace existing null key.
		System.out.println(students); // OUT : {Bheem=3, Aman=1, Dholu=4, Chaman C=5, Raju=6, Abhi=2}
		
		System.out.println();
		
//		Check if hashmap is empty or not
		System.out.println("isEmpty() returns true if empty, false otherwise :  "+ students.isEmpty());
		System.out.println();

//		Getting the size/length of the hashmap
		System.out.println("Length/size of the HashMap is: " + students.size());
		System.out.println();
		
//		Checking if a key exists in the hashmap or not
		if(students.containsKey("Bheem")) { // returns boolean
			System.out.println("Item exists");
		}else {
			System.out.println("Item does not exists");

		}
		
//		Getting value using key
		int val = students.get("Abhi"); // will return index value of key entered
		
		System.out.println("Vlaue fetched for key Abhi " + val);
		
//		removing keys from hashmap 
		students.remove("Abhi"); // this will remove K-V pair from hashmap
		
		System.out.println(students);
		
		System.out.println();
		
//		getting all the keys from the hashmap
		System.out.println("Getting all keys " + students.keySet());
		
//		Getting all the values 
		Set<String> key = students.keySet(); // Values will return a collection 
		
//		Getting all the values..
		System.out.println("Values of keys   " + students.values());
	}

}

//THINGS TO KNOW ABOUT HASHMAPS
/*
 * Key-Value Pairs: HashMap is a data structure that stores key-value pairs.
 * 
 * Fast Retrieval: It provides constant-time performance for basic operations
 * like get() and put() if the hash function distributes the elements properly
 * among the buckets. 
 * 
 * Unordered Collection: HashMap does not maintain the order of elements. 
 * 
 * Null Keys and Values: HashMap allows one null key and multiple
 * null values. 
 * 
 * Implementation of Map Interface: HashMap is a part of the Java
 * Collections Framework and implements the Map interface. 
 * 
 * No Duplicate Keys: HashMap does not allow duplicate keys. If you try to insert a duplicate key,
 * it will replace the existing value with the new one. 
 * 
 * Iterating Over Elements: You can iterate over the elements of a HashMap using iterators or enhanced
 * for loops. 
 * 
 * Resizeable: HashMap automatically resizes itself when the load
 * factor exceeds a certain threshold, ensuring efficient memory usage.
 * 
 * Concurrency: HashMap is not synchronized and is not thread-safe. If multiple
 * threads access a HashMap concurrently, and at least one of the threads
 * modifies the map structurally (i.e., adds or removes elements), it must be
 * synchronized externally. 
 * 
 * Performance: HashMap provides constant-time performance for basic operations on average, 
 * but the performance may degrade
 * to linear time in the worst-case scenario, such as when the hash function
 * produces poor hash values leading to many collisions.
 */
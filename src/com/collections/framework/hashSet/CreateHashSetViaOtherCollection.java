package com.collections.framework.hashSet;
import java.util.*;

// Creating hashset using another collection via HashSet(Collection c) constructor.
// Add all the elem from the collection to the HashSet using addAll() method..

public class CreateHashSetViaOtherCollection {

	public static void main(String[]args) {
		
		Set<Integer> evenNumbers = new HashSet<>();
		
		for(int i=0;i<12;i++) {
			
			if(i%2 == 0) {
				
				evenNumbers.add(i);
			}
		}
		
//		System.out.println(evenNumbers); // Initial hashset 
		
		Set<Integer> oddNumbers = new HashSet<>(evenNumbers); // Adding existing hashset to new hashset
		
		for(int i=0;i<12;i++) {
			
			if(i%2 != 0) {
				oddNumbers.add(i); // adding odd numbers to a hashset
			}
		}
		
		System.out.println(oddNumbers); // Contains both odd & even numbers 
	}
}

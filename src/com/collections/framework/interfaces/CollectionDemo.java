package com.collections.framework.interfaces;

import java.util.ArrayList;
import java.util.Collection;

// A collection Interface extends a Iterable interface

public class CollectionDemo {

	public static void main(String[] args) {

		Collection<String> characters = new ArrayList<>(); // This is a collection object.
		
//		Adding elements to the collection obj
		characters.add("Iron Man");
		characters.add("Jheta Lal");
		characters.add("Tarak Metha");
		characters.add("John Nash");
		
		System.out.println(characters); // will output a list [Iron Man, Jheta Lal, Tarak Metha]
		
//		removing elements from the collection obj
		characters.remove("Tarak Metha");
		
		
		System.out.println(characters);  // Out : [Iron Man, Jheta Lal] 
		
		
//		To check if specific element is present in the collection or not 
		
		System.out.println(characters.contains("Iron Man")); // will return a boolean value based on the existence.
		
//		we can use forEach method to iterate over the list 
		
		characters.forEach((elem)->{ // forEach takes a consumer type data so it expects lambda expressions to be entered.
			System.out.println(elem); // this will output one by one the elements of the collection obj
		});
		
//		with collection we can use many inbuilt methods like iterator, streams, clear collections & many other..
	}

}

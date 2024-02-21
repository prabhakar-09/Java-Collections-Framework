package com.collections.framework.LinkedLists;

import java.util.LinkedList;

// Getting element of first index
// Getting element of last index
// Getting element of specific index
// Getting all elements

public class RetrieveLinkedListElems {

	public static void main(String[] args) {

		LinkedList<String> cartoon = new LinkedList<>();
		
		cartoon.add("Tom & Jerry");
		cartoon.add("Doraemon");
		cartoon.add("Perman");
		cartoon.add("Bada Bheem");
		
//		Getting first & last elements of the LL..
		String firstElem = cartoon.getFirst();
		String lastElem = cartoon.getLast();
		
		System.out.println("Current LL -> " + cartoon);
		System.out.println();
		System.out.println("First elem of LL -> " + firstElem);
		System.out.println();
		System.out.println("Last elem of  LL -> " + lastElem);
		System.out.println();

		System.out.println(cartoon.get(3)); // getting element of a specified index
		
		System.out.println();
		
//		Iterating through the LL
		for(String elem : cartoon) {
			
			System.out.println(elem);
		}
	}

}

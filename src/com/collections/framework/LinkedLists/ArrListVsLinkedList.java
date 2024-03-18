package com.collections.framework.LinkedLists;

import java.util.LinkedList;

// A simple comparison class for Arr List & Linked lists
public class ArrListVsLinkedList {

	public static void main(String[] args) {

		LinkedList<String> cars = new LinkedList<>();
		
		cars.add("Volvo");
		cars.add("Swift");
		cars.add("Tata");
		cars.add("VW");
		cars.add("Ferrari");
		
		System.out.println(cars); //out : [Volvo, Swift, Tata, VW, Ferrari]

		 
	}

}

//concise comparison between ArrayList and LinkedList:

/*
 * Implementation:
 * 
 * ArrayList: Resizable array implementation. 
 * LinkedList: Doubly linked list implementation. 
 * 
 * Memory Allocation:
 * 
 * ArrayList: Contiguous memory allocation. L
 * inkedList: Dynamic memory allocation for nodes. 
 * 
 * Access Time:
 * 
 * ArrayList: Faster for random access (O(1)). 
 * LinkedList: Slower for random access (O(n)). 
 * 
 * Insertions and Deletions:
 * 
 * ArrayList: Slower for insertions and deletions in middle (O(n)). 
 * LinkedList: Faster for insertions and deletions (O(1)) if position known. 
 * 
 * Memory Overhead:
 * 
 * ArrayList: Lower memory overhead. 
 * LinkedList: Higher memory overhead due to node structure. 
 * 
 * Traversal:
 * 
 * ArrayList: Faster for sequential access. 
 * LinkedList: Slower for sequential access due to pointer traversal. 
 * 
 * Usage:
 * 
 * ArrayList: Suitable for frequent access and read-only operations. 
 * LinkedList: Suitable for frequent insertions and deletions.
 */





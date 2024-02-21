package com.collections.framework.LinkedLists;

import java.util.LinkedList;

/*Dynamic data structure.
Consists of nodes with data and pointers.
Types: singly, doubly, circular.
Uses dynamic memory allocation.
Efficient for insertion and deletion.
Sequential access only.
Higher memory overhead.
Traversal from head to end.
Flexible for insertions and deletions.
Used in stacks, queues, graphs.
LINKED LISTS IMPLEMENT QUEUE INTERFACES & DEQUEUE INTERFACES.
*/

// Examples on : add() - elem to LL, add(2,elem) - adding elem at a specific location, addFirst(), addLast()
public class LinkedListDemo {

	public static void main(String[] args) {

//		creating a LinkedList 
		LinkedList<String> countries = new LinkedList<>();
		
		countries.add("India");
		countries.add("Pakistan");
		countries.add("Afganistan");
		countries.add("China");
		
		System.out.println("Linked List ->" + countries);
		
		System.out.println();
//		Adding an element at a specific position 
		
		countries.add(2, "Nepal");
		
		System.out.println("After adding elem at index 2 "+countries);
		
		System.out.println();
//		Adding element at the beginning of the list..
		
		countries.addFirst("SriLanka"); // this method is present in the dequeue interface.
		
		System.out.println("Elem added at first "+countries);
		
		System.out.println();
//		Adding element at the last of the LL
		
		countries.addLast("Bhutan");
		
		System.out.println("Elem added at last "+countries);
		
	}

}

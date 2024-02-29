package com.collections.framework.stack;
import java.util.*;

// A Stack is a LIFO - DS : Last In First Out.
// helps us to store objects in a vertical fashion
// push() to add elem to the top 
// pop()  to remove elem from top
public class StackIntro {

	public static void main(String[] args) {

		Stack<String> games = new Stack<>();
		
		System.out.println("Initially is stack empty: " + games.isEmpty());
		System.out.println();
		
		games.push("Subway Surfers");
		games.push("Hill Climb");
		games.push("Candy Crush");
		games.push("Temple Run");
		
		System.out.println("Is stack empty after added elements: " + games.isEmpty());
		System.out.println();
		
		System.out.println("Curr Stack: " + games);
		
//		popping an element 
		games.pop(); // Temple will be popped from the top of the stack
//		we can also store the popped object from the top in variable in case we ever wanted to
		System.out.println();
		System.out.println("After pop top element of stack is : " + games.peek());
		
		System.out.println();
		System.out.println(games);
		
		System.out.println();
		System.out.println(games.search("Candy Crush")); // returns 1 the top index of the stack element
	}

}

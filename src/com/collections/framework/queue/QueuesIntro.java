package com.collections.framework.queue;

import java.util.LinkedList;
import java.util.Queue;

//Queues are FIFO - First In First Out fashion kind of data structures
// It's a linear data structure

public class QueuesIntro {

	public static void main(String[] args) {
		
//		Queue is an interface which cannot be instantiated using new keyword so we need to create a class for it.
//		Queue<String> queue = new Queue<>();
		
		/*
		 * Creating an instance of LinkedList and assigning it to a Queue interface
		 * reference is a common practice in Java because LinkedList implements the
		 * Queue interface. By doing this, you can utilize the functionalities provided
		 * by the Queue interface while benefiting from the flexibility and features of
		 * a linked list.
		 * 
		 * To add elements to queue use -> enqueue() or offer()
		 * To remove elements from queue -> enqueue() or poll()
		 */
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("Chocolate");
		queue.offer("Milk");
		queue.offer("Cookie");
		queue.offer("Nutella");
		
		System.out.println(queue); // This will display in order queue.
		
		System.out.println(queue.peek()); // this will give the first element of the queue. 
		
		queue.poll(); // this will remove or pop first element from queue which is Chocolate
		
		System.out.println(queue);
		
		System.out.println(queue.isEmpty()); // will return false since there are elements in queue
		
		System.out.println(queue.size()); // will give the size 
		
		System.out.println(queue.contains("Nutella")); // will return true if element exists but doesn't give its index
		
	}
}

/*
 * important things to know about queues:
 * 
 * FIFO Structure: Queues follow the First-In-First-Out (FIFO) principle, where
 * the first element added to the queue is the first one to be removed.
 * 
 * Operations: Queues typically support operations like enqueue (adding an
 * element to the end of the queue) and dequeue (removing the front element from
 * the queue).
 * 
 * Linear Data Structure: Queues are a linear data structure, meaning that
 * elements are arranged in a sequence, and operations are performed on them
 * sequentially.
 * 
 * Applications: Queues are widely used in computer science for various
 * applications, including task scheduling, breadth-first search algorithms,
 * handling requests in web servers, and more.
 * 
 * Implementation: Queues can be implemented using arrays, linked lists, or
 * other data structures. Linked lists are often preferred for dynamic memory
 * allocation and efficient enqueue and dequeue operations.
 * 
 * Types of Queues: There are different types of queues, including: Basic Queue:
 * A simple queue where elements are inserted at the rear and removed from the
 * front.
 * 
 * Priority Queue: A queue where elements are removed based on their priority.
 * Elements with higher priority are dequeued before those with lower priority.
 * 
 * Circular Queue: A queue that uses a circular array or circular linked list to
 * efficiently use memory and support continuous insertion and deletion
 * operations.
 * 
 * Concurrency: In concurrent programming, queues are often used for
 * inter-thread communication, where one thread produces data (enqueue) and
 * another thread consumes data (dequeue).
 * 
 * Java Implementation: In Java, queues are represented by the Queue interface,
 * which extends the Collection interface. The LinkedList and ArrayDeque classes
 * provide implementations of the Queue interface.
 * 
 * Queue Methods: Common methods provided by the Queue interface in Java include
 * add(), offer(), remove(), poll(), element(), and peek().
 * 
 * Understanding queues and their operations is essential for various
 * programming tasks, especially in scenarios where data needs to be processed
 * in the order it was received or generated.
 * 
 *  Queues are used, where?
 *  
 * 	Breadth-First Search (BFS) Traversal: Queues are used in graph algorithms like BFS to process vertices in a level-by-level manner.
	
	Task Scheduling: Queues are useful for scheduling tasks based on their priority or arrival time.
	
	Message Queues: Queues are used in messaging systems to manage message ordering and delivery.
	
	Resource Sharing: Queues can be used to manage access to shared resources in a multi-threaded environment.
	
	Buffering and Synchronization: Queues are used for buffering and synchronizing data between producer and consumer threads or processes.
 * 
 * 
 * 
 */

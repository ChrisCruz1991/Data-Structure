
/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */


/*
 * Queue.java
 * This is the interface of a queue.
 * A queue is a collection where elements are added at and removed from
 * opposite ends (the front and rear).
 */

package edu.uprb.collection;

public interface Queue<E> {

	// Adds the given element at the rear of this queue.
	void enqueue(E elem);

	// Removes and returns the front element of this queue.
	// Throws EmptyQueueException if this queue is empty.
	E dequeue();

	// Returns the front element of this queue.
	// Throws EmptyQueueException if this queue is empty.
	E peek();

	// Returns true if this queue contains no elements.
	boolean isEmpty();

	// Returns the number of elements in this queue.
	int size();
	
	// Returns a string representation of this queue.
	String toString();

}
/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

package edu.uprb.collection;


/**
 * This class implements the Queue interface into a Circular Queue
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 5/10/2016.
 *
 * @param <E>
 */

public class CircularQueue<E> implements Queue<E> {

	private Node<E> rear;
	private int size;

	/**
	 * Adds the given element at the rear of this queue.
	 */
	@Override
	public void enqueue(E elem) {
		if (isEmpty()){
			//rear.next = 
			rear = new Node<>(elem, rear);
			rear.next = rear;
		}
		else
			rear = rear.next = new Node<>(elem, rear.next);
		size++;
	}

	/**
	 * Removes and returns the front element of this queue.
	 *  Throws EmptyQueueException if this queue is empty.
	 */
   
	@Override
	public E dequeue() {
		if(isEmpty())
			throw new EmptyCollectionException("Empty queue");
		E elem = rear.next.data;
		if(rear == rear.next){
			rear.next = null;
			rear = null;
		}
		else
			rear.next = rear.next.next;
		
		size--;
		return elem;
	}

	/**
	 * Returns the front element of this queue.
	 * Throws EmptyQueueException if this queue is empty.
	 */
	@Override
	public E peek() {
		if(isEmpty())
			throw new EmptyCollectionException("Empty queue");
		return rear.next.data;
	}

	/**
	 * Returns true if this queue contains no elements.
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Returns the number of elements in this queue.
	 */
	@Override
	public int size() {
		return size;
	}

	/**
	 * Returns the String representation of the circular queue
	 * @return the String representation of the circular queue
	 */
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder("[");
		if(rear != null){
			Node<E> curr = rear.next;
			for (int ctr = 0; ctr < size; ctr++) {
				str.append(curr.data);
				if (ctr < size - 1)
					str.append(", ");
				curr = curr.next;
			}
		}
		return str.append("]").toString();
	}


	// This is a private static class that implements a node.
	private static class Node<E> {
		public E data;         // reference to node's data
		public Node<E> next;   // link to next node

		// Creates a node with the given data and next link.
		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}

	}

}

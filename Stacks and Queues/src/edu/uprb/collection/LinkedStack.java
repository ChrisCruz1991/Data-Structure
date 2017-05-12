/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */
	
package edu.uprb.collection;

	/**
	 * A Stack is a collection where elements are added 
	 * at and removed from the same side (top).
	 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
	 * @version 5/10/2016
	 */

public class LinkedStack<E> implements Stack<E> {
	private Node<E> top;      // reference to top node
	private int size;         // number of elements

	// Adds the given element at the top of this stack.
	@Override
	public void push(E elem) {
		top = new Node<>(elem, top);
		size++;
	}

	// Removes and returns the top element of this stack.
	// Throws EmptyCollectionException if this stack is empty.
	@Override
	public E pop() {
		if (isEmpty())
			throw new EmptyCollectionException("stack is empty");
		E elem = top.data;
		top = top.next;
		size--;
		return elem;
	}

	// Returns the top element of this stack.
	// Throws EmptyCollectionException if this stack is empty.
	@Override
	public E peek() {
		if (isEmpty())
			throw new EmptyCollectionException("stack is empty");
		return top.data;
	}

	// Returns true if this stack contains no elements.
	@Override
	public boolean isEmpty() {
		return top == null;
	}

	// Returns the number of elements in this stack.
	@Override
	public int size() {
		return size;
	}

	// Returns a string representation of this stack.
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("[");
		for (Node<E> curr = top; curr != null; curr = curr.next) {
			str.append(curr.data);
			if (curr.next != null)
				str.append(", ");
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
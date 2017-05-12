/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

/*
 * ArrayStack.java
 * This is the implementation of a stack as an array-based structure.
 * A stack is a collection where elements are added at and removed from
 * the same end (the top).
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 5/10/2016.
 */

package edu.uprb.collection;

public class ArrayStack<E> implements Stack<E> {
	private static final int DEFAULT_INIT_CAPACITY = 10;
	
	private E[] data;        // array of element references
	private int size;      // number of elements
	
	// Creates a stack with the given initial capacity.
	// Throws an InvalidCapacityException if the capacity is negative.
	@SuppressWarnings("unchecked")
	public ArrayStack(int initCapacity) {
		if (initCapacity < 0)
			throw new IllegalArgumentException("invalid capacity");
		data = (E[]) new Object[initCapacity];
	}
	
	// Creates a stack with a default initial capacity of 10 elements.
	public ArrayStack() {
		this(DEFAULT_INIT_CAPACITY);
	}

	// Adds the given element at the top of this stack.
	@Override
	public void push(E elem) {
		ensureCapacity();
		data[size++] = elem;
	}
	
	// Ensures that this stack has the capacity for adding new elements.
	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		if (size == data.length) {
			E[] temp = (E[]) new Object[2 * data.length];
			for (int curr = size - 1; curr >= 0; curr--)
				temp[curr] = data[curr];
			data = temp;
		}
	}
	
	// Removes and returns the top element of this stack.
	// Throws EmptyCollectionException if this stack is empty.
	@Override
	public E pop() {
		if (isEmpty())
			throw new EmptyCollectionException("stack is empty");
		E elem = data[--size];
		data[size] = null;
		return elem;
	}

	// Returns the top element of this stack.
	// Throws EmptyCollectionException if this stack is empty.
	@Override
	public E peek() {
		if (isEmpty())
			throw new EmptyCollectionException("stack is empty");
		return data[size - 1];
	}

	// Returns true if this stack contains no elements.
	@Override
	public boolean isEmpty() {
		return size == 0;
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
		for (int curr = size - 1; curr >= 0; curr--) {
			str.append(data[curr]);
			if (curr > 0)
				str.append(", ");
		}
		return str.append("]").toString();
	}

}
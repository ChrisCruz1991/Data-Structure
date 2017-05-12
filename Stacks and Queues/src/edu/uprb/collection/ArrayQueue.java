/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

/*
 * ArrayQueue.java
 * This is the implementation of a queue as an array-based structure.
 * A queue is a collection where elements are added at and removed from
 * opposite ends (the front and rear).
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 5/10/2016
 */

package edu.uprb.collection;

public class ArrayQueue<E> implements Queue<E> {
	private static final int DEFAULT_INIT_CAPACITY = 10;
	
	private E[] data;        // array of element references
	private int front;       // index of the front element
	private int rear = -1;   // index of the rear element
	private int size;        // number of elements

	// Creates a queue with the given initial capacity.
	// Throws an InvalidCapacityException if the capacity is negative.
	@SuppressWarnings("unchecked")
	public ArrayQueue(int initCapacity) {
		if (initCapacity < 0)
			throw new EmptyCollectionException("invalid capacity");
		ensureCapacity();
		data = (E[]) new Object[initCapacity];
	}
	
	// Creates a queue with a default initial capacity of 10 elements.
	public ArrayQueue() {
		this(DEFAULT_INIT_CAPACITY);
	}

	// Adds the given element at the rear of this queue.
	@Override
	public void enqueue(E elem) {
		ensureCapacity();
		rear = (rear + 1) % data.length;
		data[rear] = elem;
		size++;
	}

	// Ensures that this queue has the capacity for adding new elements.
	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		if (size == data.length) {
			E[] temp = (E[]) new Object[2 * data.length];
			for (int count = 0; count < size; count++)
				temp[count] = data[(front + count) % data.length];
			data = temp;
			front = 0;
			rear = size - 1;
		}
	}

	// Removes and returns the front element of this queue.
	// Throws EmptyCollectionException if this queue is empty.
	@Override
	public E dequeue() {
		if (isEmpty())
			throw new EmptyCollectionException("queue is empty");
		E elem = data[front];
		data[front] = null;
		front = (front + 1) % data.length;
		size--;
		return elem;
	}

	// Returns the front element of this queue.
	// Throws EmptyCollectionException if this queue is empty.
	@Override
	public E peek() {
		if (isEmpty())
			throw new EmptyCollectionException("queue is empty");
		return data[front];
	}

	// Returns true if this queue contains no elements.
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	// Returns the number of elements in this queue.
	@Override
	public int size() {
		return size;
	}

	// Returns a string representation of this queue.
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("[");
		for (int count = 0; count < size; count++) {
			str.append(data[(front + count) % data.length]);
			if (count < size - 1)
				str.append(", ");
		}
		return str.append("]").toString();
	}

}
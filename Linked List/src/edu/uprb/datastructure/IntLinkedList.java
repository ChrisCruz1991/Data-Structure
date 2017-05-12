/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

package edu.uprb.datastructure;

/**
 * This class represents a linked list of integers.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 1.0, 03/17/2015
 * This is the original version
 * ******************************************************************
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 1.1, 04/20/2016
 * This is the homework version
 */
public class IntLinkedList {
	
	/** The reference to head node. */
	private Node head;

	/**
	 * Adds an element at the beginning of this list.
	 * @param elem The element to be added.
	 */
	public void addFirst(int elem) {
		head = new Node(elem, head);
	}
	
	/**
	 * Adds an element at the end of this list.
	 * @param elem The element to be added.
	 */
	public void addLast(int elem) {
		if (head == null)
			head = new Node(elem, null);
		else {
			Node curr = head; 
			while (curr.next != null)
				curr = curr.next;
			curr.next = new Node(elem, null);
		}
	}

	/**
	 * Returns the number of elements in this list.
	 * @return The number of elements in this list.
	 */
	public int length() {
		int len = 0;
		for (Node curr = head; curr != null; curr = curr.next)
			len++;
		return len;		
	}

	/**
	 * Returns the sum of the elements in this list.
	 * @return The sum of the elements in this list.
	 */
	public int sum() {
		int sum = 0;
		for (Node curr = head; curr != null; curr = curr.next)
			sum += curr.data;
		return sum;
	}
	
	/**
	 * Returns the product of the elements in this list.
	 * @return The product of the elements in this list.
	 */
	
	public long product() {
		if (head == null)
			throw new EmptyLinkedListException("Empty Linked List...");
		long product = 1;
		for (Node curr = head; curr != null; curr = curr.next)
			product *= curr.data;
		return product;
	}
	
	/**
	 * Returns the average of the elements in this list.
	 * @return The average of the elements in this list.
	 */
	
	public double average() {
		if (head == null)
			throw new EmptyLinkedListException("Empty Linked List...");
		int sum = 0;
		int length = 0;
		for (Node curr = head; curr != null; curr = curr.next) {
			sum += curr.data;
			length++;
		}
		return (double) sum / length;
	}
	
	/**
	 * Returns the minimum of the elements in this list.
	 * @return The minimum of the elements in this list. 
	 */
	
	public int minimum() {
		if (head == null)
			throw new EmptyLinkedListException("Empty Linked List...");
		int minimum = 0;
		for (Node curr = head; curr != null; curr = curr.next) {
			if (curr.data < minimum)
				minimum = curr.data;
		}
		return minimum;
	}
	
	/**
	 * Returns the maximum of the elements in this list.
	 * @return The maximum of the elements in this list.
	 */
	
	public int maximum() {
		if (head == null)
			throw new EmptyLinkedListException("Empty Linked List...");
		int maximum = 0;
		for (Node curr = head; curr != null; curr = curr.next) {
			if (curr.data > maximum)
				maximum = curr.data;
		}
		return maximum;
	}
	
	/**
	 * Copies the original list into another.
	 * @return the copy of the original list.
	 */
	
	public IntLinkedList copy() {
		IntLinkedList copyList = new IntLinkedList();
		copyList.head = new Node(head.data, null);
		Node prev = copyList.head;
		for (Node curr = head.next; curr != null; curr = curr.next) {
			prev.next = new Node(curr.data, null);
			prev = prev.next;
		}
		return copyList;
	}
	
	/**
	 * Searches for an element in this list.
	 * @param elem The element to be searched.
	 * @return The position of the element or -1 if it is not found.
	 */
	public int linearSearch(int elem) {
		int pos = 0;
		for (Node curr = head; curr != null; curr = curr.next)
			if (elem == curr.data)
				return pos;
			else
				pos++;
		return -1;
	}
	
	/**
	 * Sorts this list using the insertion sort algorithm.
	 */
	
	public void insertionSort() {
		Node sortedHead = null;
		
		while (head != null) {
			int elem = head.data;
			Node prev = null, curr = sortedHead;
			
			while (curr != null && elem > curr.data) {
				prev = curr;
				curr = curr.next;
			}
			if (curr == sortedHead)
				sortedHead = new Node(elem, sortedHead);
			else
				prev.next = new Node(elem, curr);
			head = head.next;
		}
		head = sortedHead;
	}
	
	/**
	 * Sorts this list using the selection sort algorithm.
	 */
	public void selectionSort() {
		for (Node curr = head; curr != null; curr = curr.next) {
			Node min = curr;
			
			for (Node other = curr.next; other != null; other = other.next)
				if (min.data > other.data)
					min = other;
			if (min.data != curr.data) {
				int temp = min.data;
				min.data = curr.data;
				curr.data = temp;
			}
		}
	}
	
	/**
	 * Determines whether this list has the same data as the given list.
	 * @param obj The object that this list is compared to.
	 * @return {@code true} if this list is equal to the other object.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (! (obj instanceof IntLinkedList))
			return false;
		IntLinkedList other = (IntLinkedList)obj;
		
		Node curr = this.head, otherCurr = other.head;
		while (curr != null && otherCurr != null) {
			if (curr.data != otherCurr.data)
				return false;
			curr = curr.next;
			otherCurr = otherCurr.next;
		}
		return curr == null && otherCurr == null;
	}
	
	/**
	 * Returns the string representation of this list.
	 * @return The string representation of this list.
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("[");
		for (Node curr = head; curr != null; curr = curr.next) {
			str.append(curr.data);
			if (curr.next != null)
				str.append(", ");
		}
		return str.append("]").toString();
	}

	/** This private static class represents a list node. */
	private static class Node {
		/** The reference to the data of this node. */
		public int data;
		
		/** The link to next node. */
		public Node next;
		
		/**
		 * Creates a node with the given data and next link.
		 * @param data The reference to the data of this node.
		 * @param next The link to next node.
		 */
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

}
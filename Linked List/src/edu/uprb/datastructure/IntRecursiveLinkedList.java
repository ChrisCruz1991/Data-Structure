/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2015
 * Prof. Antonio F. Huertas
 */

package edu.uprb.datastructure;

/**
 * This class represents a linked list of integers in which iterative
 * methods have been replaced by recursive ones.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 1.0, 03/24/2015
 *  * ******************************************************************
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 1.1, 04/20/2016
 * This is the homework version
 */
public class IntRecursiveLinkedList {

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
		head = addLastList(elem, head);
	}

	private Node addLastList(int elem, Node curr) {
		if (curr == null)
			curr = new Node(elem, curr);
		else
			curr.next = addLastList(elem, curr.next);
		return curr;		
	}

	/**
	 * Returns the number of elements in this list.
	 * @return The number of elements in this list.
	 */
	public int length() {
		return lengthList(head);		
	}

	private int lengthList(Node curr) {
		if (curr == null)
			return 0;
		else
			return 1 + lengthList(curr.next);		
	}	

	/**
	 * Returns the sum of the elements in this list.
	 * @return The sum of the elements in this list.
	 */
	public int sum() {
		return sumList(head);
	}

	private int sumList(Node curr) {
		if (curr == null)
			return 0;
		else
			return curr.data + sumList(curr.next);
	}

	/**
	 * Returns the prodcut of the elements in this list.
	 * @return The product of the elements in this list.
	 */

	public long product() {
		if (head == null)
			throw new EmptyLinkedListException("Empty list...");

		return productList(head);
	}

	private long productList(Node curr) {
		if (curr == null)
			return 1;
		else
			return curr.data * productList(curr.next);
	}

	/**
	 * Returns the average of the elements in this list.
	 * @return The average of the elements in this list.
	 */

	public double average() {
		if (head == null)
			throw new EmptyLinkedListException("Empty list...");

		return (double) sum() / length();
	}

	/**
	 * Returns the maximum element in this list.
	 * @return The maximum element in this list.
	 */

	public int maximum() {
		if (head == null)
			throw new EmptyLinkedListException("Empty list...");

		return maximumList(head);
	}

	private int maximumList(Node curr) {
		if (curr.next == null)
			return curr.data;
		else
			return Math.max(maximumList(curr.next), curr.data);
	}

	/**
	 * Returns The minimum element in this list.
	 * @return The minimum element in this list.
	 */

	public int minimum() {
		if (head == null)
			throw new EmptyLinkedListException("Empty list...");

		return minimumList(head);
	}

	private int minimumList(Node curr) {
		if (curr.next == null)
			return curr.data;
		else
			return Math.min(minimumList(curr.next), curr.data);
	}

	/**
	 * Returns the copy of this list.
	 * @return the copy of this list.
	 */
	public IntRecursiveLinkedList copy() {
		IntRecursiveLinkedList copyList = new IntRecursiveLinkedList();
		copyList.head = copyList(head);
		return copyList;
	}
	
	private Node copyList(Node curr) {
		if (curr == null)
			return null;
		else
			curr = new Node(curr.data, copyList(curr.next));
		return curr;
	}

	/**
	 * Sorts the list in ascending order using selection sort algorithm.
	 */
	public void selectionSort() {
		selectionSortList(head);
	}

	private void selectionSortList(Node curr) {
		if (curr.next != null){
			Node min = curr;
			min = select(min, curr);
			if (min.data != curr.data) {
				int temp = min.data;
				min.data = curr.data;
				curr.data = temp;
			}
			selectionSortList(curr.next);
		}
	}

	private Node select(Node min, Node curr) {
		if (curr == null)
			return min;
		else {
			if (min.data > curr.data)
				min = curr;
			return select(min, curr.next);
		}
	}

	/**
	 * Searches for an element in this list.
	 * @param elem The element to be searched.
	 * @return The position of the element or -1 if it is not found.
	 */
	public int linearSearch(int elem) {
		return linearSearchList(elem, 0, head);
	}

	private int linearSearchList(int elem, int pos, Node curr) {
		if (curr == null)
			return -1;
		else if (elem == curr.data)
			return pos;
		else
			return linearSearchList(elem, pos + 1, curr.next);
	}

	/**
	 * Sorts this list using the insertion sort algorithm.
	 */
	public void insertionSort() {
		head = insertionSortList(head);
	}

	private Node insertionSortList(Node curr) {
		if (curr == null)
			return null;
		else
			return insert(curr.data, insertionSortList(curr.next));
	}

	private Node insert(int elem, Node curr) {
		if (curr == null)
			curr = new Node(elem, null);
		else if (elem < curr.data)
			curr = new Node(elem, curr);
		else
			curr.next = insert(elem, curr.next);
		return curr;
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
		if (! (obj instanceof IntRecursiveLinkedList))
			return false;
		IntRecursiveLinkedList other = (IntRecursiveLinkedList)obj;
		return equalLists(this.head, other.head);
	}

	private boolean equalLists(Node curr, Node otherCurr) {
		if (curr == null && otherCurr == null)
			return true;
		else if (curr == null || otherCurr == null)
			return false;
		else if (curr.data != otherCurr.data)
			return false;
		else
			return equalLists(curr.next, otherCurr.next);
	}

	/**
	 * Returns the string representation of this list.
	 * @return The string representation of this list.
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("[");
		ListToString(head, str);
		return str.append("]").toString();
	}

	private void ListToString(Node curr, StringBuilder str) {
		if (curr != null) {
			str.append(curr.data);
			if (curr.next != null)
				str.append(", ");
			ListToString(curr.next, str);
		}
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


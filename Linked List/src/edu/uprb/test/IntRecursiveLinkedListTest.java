/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2015
 * Prof. Antonio F. Huertas
 */

package edu.uprb.test;

import java.util.Random;

import edu.uprb.datastructure.IntRecursiveLinkedList;

/**
 * This class is a test application for the linked list of integers.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 1.0, 03/24/2015
 * ******************************************************************
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 1.1, 04/20/2016
 * This is the homework version
 */
public class IntRecursiveLinkedListTest {
	
	/**
	 * Serves as the entry point for this application.
	 * @param args Not applicable: The command-line arguments.
	 */
	public static void main(String[] args) {
		final int NUM_ELEMS = 10;
		IntRecursiveLinkedList lst1 = new IntRecursiveLinkedList();
		IntRecursiveLinkedList lst2 = new IntRecursiveLinkedList();
		IntRecursiveLinkedList lst3 = new IntRecursiveLinkedList();
		Random gen = new Random();
		
		System.out.println("Creating two linked lists with the same " + 
				NUM_ELEMS + " random elements...");
		for (int idx = 0; idx < NUM_ELEMS; idx++) {
			int elem = gen.nextInt(NUM_ELEMS);
			lst1.addFirst(elem);
			lst2.addFirst(elem);
		}
		System.out.println();
		
		System.out.println("This is lst1...");
		printLinkedList(lst1);

		System.out.println("A random element is searched...");
		int elem = gen.nextInt(NUM_ELEMS);
		int pos = lst1.linearSearch(elem);
		if (pos < 0)
			System.out.println(elem + " was not found");
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();		
		
		System.out.println("This is lst2...");
		printLinkedList(lst2);
		
		System.out.println("Are lst1 and lst2 equals? " + 
				lst1.equals(lst2));
		System.out.println();
		
		System.out.println("Adding to random elements at the end of lst2...");
		lst2.addLast(gen.nextInt(NUM_ELEMS));
		lst2.addLast(gen.nextInt(NUM_ELEMS));
		
		System.out.println("This is lst2...");
		printLinkedList(lst2);
		
		lst2.insertionSort();
		System.out.println("This is lst2 after insertion sort...");
		printLinkedList(lst2);
		
		System.out.println("Are lst1 and lst2 equals? " + 
				lst1.equals(lst2));
		System.out.println();
		
		System.out.println("lst1 after selection sort...");
		lst1.selectionSort();
		printLinkedList(lst1);
		
		System.out.println("This is lst3 after copying lst1...");
		lst3 = lst1.copy();
		printLinkedList(lst3);
		
		System.out.println("End of tests.");
		System.exit(0);		
	}
	
	/**
	 * Print some information about the given linked list.
	 * @param a The linked list that is examined. 
	 */
	private static void printLinkedList(IntRecursiveLinkedList lst) {
		System.out.println("elements: " + lst);
		System.out.println("length: " + lst.length());
		System.out.println("sum: " + lst.sum());
		System.out.println("product: " + lst.product());
		System.out.println("average: " + lst.average());
		System.out.println("maximum: " + lst.maximum());
		System.out.println("minimum: " + lst.minimum());
		System.out.println();
	}

}
/*
 * University of Puerto Rico at Bayam�n
 * Department of Computer Science
 * SICI 4036, Section: LM1 - Data Structures, Spring 2016
 * Christopher Cruz Rubert
 * #841-09-1908
 * 
 */

package edu.uprb.test;

import java.util.Random;

import edu.uprb.algorithm.IntArrayUtils;
import edu.uprb.algorithm.IntArraySearch;

/**
 * This class is a test application for the integer array utility
 * searching methods.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 02/11/2016
 * This is the original version
 * *************************************************************************
 *  This class is a test application for the integer array utility
 * integer arrays, plus new methods
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 02/29/2016
 * 
 */
public class IntArraySearchTest {

	/**
	 * Serves as the entry point for this application.
	 * @param args Not applicable: The command-line arguments.
	 */
	public static void main(String[] args) {
		final int NUM_ELEMS = 30;
		int[] arr1 = new int[NUM_ELEMS];
		Random gen = new Random();
		
		System.out.println("Creating an array with " + NUM_ELEMS +
				" random elements...");
		for (int idx = 0; idx < NUM_ELEMS; idx++)
			arr1[idx] = gen.nextInt(NUM_ELEMS);
		System.out.println();
		
		System.out.println("This is arr1...");
		printArray(arr1);
				
		System.out.println("A sure element is searched in a linear way...");
		int elem = arr1[NUM_ELEMS / 3];
		int pos = IntArraySearch.linearSearch(arr1, elem);
		if (pos < 0)
			System.out.println(elem + " was not found");
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();
		
		System.out.println("A random element is searched in a linear way...");
		elem = gen.nextInt(NUM_ELEMS);
		pos = IntArraySearch.linearSearch(arr1, elem);
		if (pos < 0)
			System.out.println(elem + " was not found");
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();
		
		//Searching the array from index 5 to 15
		System.out.println("A sure element is searched in a linear way from index 5 to 15...");
		elem = gen.nextInt(NUM_ELEMS) / 3;
		pos = IntArraySearch.linearSearch(arr1, elem, 5, 15);
		if (pos < 0)
			System.out.println(elem + " was not found.");
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();
		
		System.out.println("A random element is searched in a linear way from index 10 to 30...");
		elem = gen.nextInt(NUM_ELEMS);
		pos = IntArraySearch.linearSearch(arr1, elem, 10, 30);
		if (pos < 0)
			System.out.println(elem + " was not found.");
		else
			System.out.println(elem + " was found at position #" + pos);
		
		//Second array processing
		int[] arr2 = new int[NUM_ELEMS];
		System.out.println("Creating a sorted array with " + NUM_ELEMS +
				" elements...");
		for (int idx = 0; idx < NUM_ELEMS; idx++)
			arr2[idx] = idx * 3;
		System.out.println();
		
		System.out.println("This is arr2...");
		printArray(arr2);
						
		System.out.println("A sure element is searched in a binary way...");
		elem = arr2[NUM_ELEMS / 3];
		pos = IntArraySearch.binarySearch(arr2, elem);
		if (pos< 0)
			System.out.println(elem + " was not found");
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();
		
		System.out.println("A random element is searched in a binary way...");
		elem = gen.nextInt(NUM_ELEMS);
		pos = IntArraySearch.binarySearch(arr2, elem);
		if (pos < 0) {
			System.out.println(elem + " was not found");
			System.out.println("It should be inserted at position #" + 
					-(pos + 1));
		}
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();
		
		System.out.println("A sure element is searched in a binary way from index 5 to 15...");
		elem = arr2[NUM_ELEMS / 3];
		pos = IntArraySearch.binarySearch(arr2, elem, 5, 15);
		if (pos < 0) {
			System.out.println(elem + " was not found.");
			System.out.println("It should be inserted at position #" + -(pos + 1));
		}
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();
		
		System.out.println("A random element is searched in a binary way from index 5 to 15...");
		elem = gen.nextInt(NUM_ELEMS);
		pos = IntArraySearch.binarySearch(arr2, elem, 5, 15);
		if (pos < 0) {
			System.out.println(elem + " was not found");
			System.out.println("It should be inserted at position #" + -(pos + 1));
		}
		else
			System.out.println(elem + " was found at position #" + pos);
		
		System.out.println("End of tests.");
		System.exit(0);
	}

	/**
	 * Print some information about the given array.
	 * @param a The array that is examined. 
	 */
	private static void printArray(int[] a) {
		System.out.println("elements: " + IntArrayUtils.toString(a));
		System.out.println("length: " + a.length);
		System.out.println();
	}

}
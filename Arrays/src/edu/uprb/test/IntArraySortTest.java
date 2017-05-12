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

import edu.uprb.algorithm.IntArraySort;
import edu.uprb.algorithm.IntArrayUtils;

/**
 * This class is a test application for the integer array utility
 * sorting methods.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 02/16/2016
 */
public class IntArraySortTest {

	/**
	 * Serves as the entry point for this application.
	 * @param args Not applicable: The command-line arguments.
	 */
	public static void main(String[] args) {
		final int NUM_ELEMS = 30;
		int[] arr1 = new int[NUM_ELEMS];
		int[] arr2 = new int[NUM_ELEMS];
		int[] arr3 = new int[NUM_ELEMS];		//New Array to test new selection sort
		int[] arr4 = new int[NUM_ELEMS];		//New Array to test new insertion sort
		Random gen = new Random();

		System.out.println("Creating two arrays with the same " + 
				NUM_ELEMS + " random elements...");
		for (int idx = 0; idx < NUM_ELEMS; idx++) {
			int elem = gen.nextInt(NUM_ELEMS);
			arr1[idx] = elem;
			arr2[idx] = elem;
			arr3[idx] = elem;			//third array created for homework.
			arr4[idx] = elem;			//fourth array created for homework.
		}
		System.out.println();

		System.out.println("This is arr1...");
		printArray(arr1);

		IntArraySort.selectionSort(arr1);		
		System.out.println("This is arr1 after selection sort...");
		printArray(arr1);

		System.out.println("This is arr2...");
		printArray(arr2);

		IntArraySort.insertionSort(arr2);
		System.out.println("This is arr2 after insertion sort...");
		printArray(arr2);

		//Selection sort with two indexes
		System.out.println("This is arr3...");
		printArray(arr3);
		
		IntArraySort.selectionSort(arr3, 10, 20);
		System.out.println("This is arr3 after selection sort from index 10 to 20...");
		printArray(arr3);
		
		//Insertion sort with two indexes
		System.out.println("This is arr4...");
		printArray(arr4);
		
		IntArraySort.insertionSort(arr4, 6, 10);
		System.out.println("This is arr4 after insertion sort from index 6 to 10...");
		printArray(arr4);

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
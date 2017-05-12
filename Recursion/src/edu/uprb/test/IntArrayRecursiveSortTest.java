/*
 * University of Puerto Rico at Bayam�n
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

package edu.uprb.test;

import java.util.Random;

import edu.uprb.algorithm.IntArrayRecursiveSort;
import edu.uprb.algorithm.IntArrayRecursiveUtils;

/**
 * This class is a test application for the integer array utility
 * sorting methods.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 03/03/2016
 * This is the original version
 * **************************************************************
 * This class is a test application for the integer array utility
 * sorting methods, plus a new selection sort method
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 03/16/2016.
 * Homework version
 */
public class IntArrayRecursiveSortTest {

	/**
	 * Serves as the entry point for this application.
	 * @param args Not applicable: The command-line arguments.
	 */
	public static void main(String[] args) {
		final int NUM_ELEMS = 30;
		int[] arr1 = new int[NUM_ELEMS];
		int[] arr2 = new int[NUM_ELEMS];
		int[] arr3 = new int[NUM_ELEMS];
		Random gen = new Random();

		System.out.println("Creating two arrays with the same " + 
				NUM_ELEMS + " random elements...");
		for (int idx = 0; idx < NUM_ELEMS; idx++) {
			int elem = gen.nextInt(NUM_ELEMS);
			arr1[idx] = elem;
			arr2[idx] = elem;
			arr3[idx] = elem;
		}
		System.out.println();
		
		System.out.println("This is arr1...");
		printArray(arr1);
		
		IntArrayRecursiveSort.mergeSort(arr1);		
		System.out.println("This is arr1 after merge sort...");
		printArray(arr1);
		
		System.out.println("This is arr2...");
		printArray(arr2);
		
		IntArrayRecursiveSort.quickSort(arr2);
		System.out.println("This is arr2 after quick sort...");
		printArray(arr2);

		System.out.println("This is arr3...");
		printArray(arr3);
		
		IntArrayRecursiveSort.selectionSort(arr3);
		System.out.println("This is arr3 after selection sort...");
		printArray(arr3);
		
		System.out.println("End of tests.");
		System.exit(0);
	}
	
	/**
	 * Print some information about the given array.
	 * @param a The array that is examined. 
	 */
	private static void printArray(int[] a) {
		System.out.println("elements: " + IntArrayRecursiveUtils.toString(a));
		System.out.println("length: " + a.length);
		System.out.println();
	}

}
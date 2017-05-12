/*
 * University of Puerto Rico at Bayam�n
 * Department of Computer Science
 * SICI 4036, Section: LM1 - Data Structures, Spring 2016
 * Christopher Cruz Rubert
 * #841-09-1908
 * 
 */

package edu.uprb.app;

import java.util.Arrays;
import java.util.Random;

/**
 * This class is an application that demonstrates some methods of the
 * Arrays class from the Java API.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 02/18/2016
 * This is the original author
 * *************************************************************************
 * This class is an application that demonstrates some methods of the
 * Arrays class from the Java API, plus some new methods from the 
 * Java API
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 02/29/2016.
 */
public class ArraysDemoApp {

	/**
	 * Serves as the entry point for this application.
	 * @param args Not applicable: The command-line arguments.
	 */
	public static void main(String[] args) {
		final int NUM_ELEMS = 30;
		int[] arr1 = new int[NUM_ELEMS];
		int[] arr2 = new int[NUM_ELEMS];
		int[] arr3 = new int[NUM_ELEMS];		//New array for purpose of homework
		Random gen = new Random();

		System.out.println("Creating two arrays with different " + 
				NUM_ELEMS + " random elements...");
		for (int idx = 0; idx < NUM_ELEMS; idx++) {
			arr1[idx] = gen.nextInt(NUM_ELEMS);
			arr2[idx] = gen.nextInt(NUM_ELEMS);
			arr3[idx] = gen.nextInt(NUM_ELEMS);		//New array for purpose of homework
		}
		System.out.println();

		System.out.println("This is arr1...");
		printArray(arr1);

		System.out.println("This is arr2...");
		printArray(arr2);

		System.out.println("Are arr1 and arr2 equal? " + 
				Arrays.equals(arr1, arr2));
		System.out.println();

		arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("Now, arr2 is a copy of arr1...");
		System.out.println();

		System.out.println("This is arr1...");
		printArray(arr1);

		System.out.println("This is arr2...");
		printArray(arr2);

		System.out.println("Are arr1 and arr2 equal? " + 
				Arrays.equals(arr1, arr2));
		System.out.println();

		Arrays.sort(arr2);
		System.out.println("This is arr2 after quick sort...");
		printArray(arr2);

		System.out.println("A sure element is searched in arr2...");
		int elem = arr2[NUM_ELEMS / 3];
		int pos = Arrays.binarySearch(arr2, elem);
		if (pos< 0)
			System.out.println(elem + " was not found");
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();

		System.out.println("A random element is searched in arr2...");
		elem = gen.nextInt(NUM_ELEMS);
		pos = Arrays.binarySearch(arr2, elem);
		if (pos < 0) {
			System.out.println(elem + " was not found");
			System.out.println("It should be inserted at position #" + 
					-(pos + 1));
		}
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();

		//Displaying arr3
		System.out.println("This is arr3...");
		printArray(arr3);

		//Sort arr3 with the quick sort
		System.out.println("Sorting arr3 from index 5 to 20...");
		Arrays.sort(arr3, 5, 20);
		System.out.println("This is arr3 after quick sort...");
		printArray(arr3);

		//Searching for a sure element in arr3
		System.out.println("Searching for a sure element in arr3 from index 5 to 20...");
		elem = arr3[NUM_ELEMS / 3];
		pos = Arrays.binarySearch(arr3, 5, 20, elem);
		if (pos < 0)
			System.out.println(elem + " was not found");
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();

		//Searching for a random element in arr3
		System.out.println("A random element is searched in arr3 from index 5 to 20...");
		elem = gen.nextInt(NUM_ELEMS);
		pos = Arrays.binarySearch(arr3, 5, 20, elem);
		if (pos < 0) {
			System.out.println(elem + " was not found");
			System.out.println("It should be inserted at position #" + 
					-(pos + 1));
		}
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();
		
		//Filling arr2 completely with 10's
		System.out.println("This is arr2...");
		printArray(arr2);
		Arrays.fill(arr2, 10);
		System.out.println("This is arr2 after filling it with 10's...");
		printArray(arr2);
		
		//Filling arr3 from index 20 to 30 with 0's
		System.out.println("This is arr3...");
		printArray(arr3);
		Arrays.fill(arr3, 20, 30, 0);
		System.out.println("This is arr3 filled with 0's from index 20 to 30...");
		printArray(arr3);

		System.out.println("End of tests.");
		System.exit(0);
	}

	/**
	 * Print some information about the given array.
	 * @param a The array that is examined. 
	 */
	private static void printArray(int[] a) {
		System.out.println("elements: " + Arrays.toString(a));
		System.out.println("length: " + a.length);
		System.out.println();
	}
}

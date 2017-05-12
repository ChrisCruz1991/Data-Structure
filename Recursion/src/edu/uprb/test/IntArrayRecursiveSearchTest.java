/*
 * University of Puerto Rico at Bayam�n
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

package edu.uprb.test;

import java.util.Random;

import edu.uprb.algorithm.IntArrayRecursiveUtils;
import edu.uprb.algorithm.IntArrayRecursiveSearch;

/**
 * This class is a test application for the integer array utility
 * searching methods.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 03/01/2016
 * Original version
 * **********************************************************
 * This class is a test application for the integer array utility
 * searching methods, plus the new linear search method.
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 03/16/2016.
 * Homework version
 */
public class IntArrayRecursiveSearchTest {

	/**
	 * Serves as the entry point for this application.
	 * @param args Not applicable: The command-line arguments.
	 */
	public static void main(String[] args) {
		final int NUM_ELEMS = 15;		
		int[] arr = new int[NUM_ELEMS];
		
		System.out.println("Creating a sorted array with " + NUM_ELEMS +
				" elements...");
		for (int idx = 0; idx < NUM_ELEMS; idx++)
			arr[idx] = idx * 3;
		System.out.println();
		
		System.out.println("This is arr...");
		printArray(arr);
						
		System.out.println("A sure element is searched in a binary way...");
		int elem = arr[NUM_ELEMS / 3];
		int pos = IntArrayRecursiveSearch.binarySearch(arr, elem);
		if (pos< 0)
			System.out.println(elem + " was not found");
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();
		
		System.out.println("A random element is searched in a binary way...");
		Random gen = new Random();
		elem = gen.nextInt(NUM_ELEMS);
		pos = IntArrayRecursiveSearch.binarySearch(arr, elem);
		if (pos < 0) {
			System.out.println(elem + " was not found");
			System.out.println("It should be inserted at position #" + 
					-(pos + 1));
		}
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();
		
		//LinearSearch
		System.out.println("A sure element is searched in a linear way...");
		elem = arr[NUM_ELEMS / 3];
		pos = IntArrayRecursiveSearch.linearSearch(arr, elem);
		if (pos < 0)
			System.out.println(elem + " was not found.");
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();
		
		//Another linear search
		System.out.println("A random element is searched in a linear way...");
		elem = gen.nextInt(NUM_ELEMS);
		pos = IntArrayRecursiveSearch.linearSearch(arr, elem);
		if (pos < 0)
			System.out.println(elem + " was not found.");
		else
			System.out.println(elem + " was found at position #" + pos);
		System.out.println();
		
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
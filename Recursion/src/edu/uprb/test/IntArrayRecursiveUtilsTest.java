/*
 * University of Puerto Rico at Bayam�n
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

package edu.uprb.test;

import java.util.Random;

import edu.uprb.algorithm.IntArrayRecursiveUtils;

/**
 * This class is a test application for the integer array utility methods.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 02/25/2016
 * Original version
 * **************************************************************
 * This class is a test application for the integer array utility methods, plus new ones.
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 03/16/2016.
 * Homework version
 */
public class IntArrayRecursiveUtilsTest {

	/**
	 * Serves as the entry point for this application.
	 * @param args Not applicable: The command-line arguments.
	 */
	public static void main(String[] args) {
		final int NUM_ELEMS = 15;
		int[] arr1 = new int[NUM_ELEMS];
		int[] arr2 = new int[NUM_ELEMS];
		Random gen = new Random();

		System.out.println("Creating two arrays with different " + 
				NUM_ELEMS + " random elements...");
		for (int idx = 0; idx < NUM_ELEMS; idx++) {
			arr1[idx] = gen.nextInt(NUM_ELEMS);
			arr2[idx] = gen.nextInt(NUM_ELEMS);
		}
		System.out.println();
		
		System.out.println("This is arr1...");
		printArray(arr1);
		
		System.out.println("This is arr2...");
		printArray(arr2);
				
		System.out.println("End of tests.");
		System.exit(0);
	}

	/**
	 * Print some information about the given array.
	 * @param a The array that is examined. 
	 */
	private static void printArray(int[] a) {
		System.out.println("elements: " + IntArrayRecursiveUtils.toString(a));
		System.out.println("Reversed elements: " + IntArrayRecursiveUtils.toReverseString(a));
		System.out.println("length: " + a.length);
		System.out.println("maximum: " + IntArrayRecursiveUtils.max(a));
		System.out.println("min: " + IntArrayRecursiveUtils.min(a));
		System.out.println("sum: " + IntArrayRecursiveUtils.sum(a));
		System.out.println("product: " + IntArrayRecursiveUtils.product(a));
		System.out.println("average: " + IntArrayRecursiveUtils.average(a));
		System.out.println();
	}

}
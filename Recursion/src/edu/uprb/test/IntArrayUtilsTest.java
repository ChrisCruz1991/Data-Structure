/*
 * University of Puerto Rico at Bayam�n
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2015
 * Prof. Antonio F. Huertas
 */

package edu.uprb.test;

import java.util.Random;

import edu.uprb.algorithm.IntArrayUtils;

/**
 * This class is a test application for the integer array utility methods.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 02/09/2016
 * Original version
 * **************************************************************************
 * This class is a test application for the integer array utility methods, and new ones.
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 03/16/2016.
 * Homework version
 */
public class IntArrayUtilsTest {

	/**
	 * Serves as the entry point for this application.
	 * @param args Not applicable: The command-line arguments.
	 */
	public static void main(String[] args) {
		final int NUM_ELEMS = 30;
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
		System.out.println("elements: " + IntArrayUtils.toString(a));
		System.out.println("Reversed elements: " + IntArrayUtils.toReverseString(a));
		System.out.println("length: " + a.length);
		System.out.println("maximum: " + IntArrayUtils.max(a));
		System.out.println("sum: " + IntArrayUtils.sum(a));
		System.out.println();
	}

}
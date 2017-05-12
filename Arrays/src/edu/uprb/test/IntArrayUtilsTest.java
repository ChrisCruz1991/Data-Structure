/*
 * University of Puerto Rico at Bayam�n
 * Department of Computer Science
 * SICI 4036, Section: LM1 - Data Structures, Spring 2016
 * Christopher Cruz Rubert
 * #841-09-1908
 * 
 */

package edu.uprb.test;

import java.text.DecimalFormat;
import java.util.Random;

import edu.uprb.algorithm.IntArrayUtils;

/**
 * This class is a test application for the integer array utility methods.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 02/09/2016
 */
public class IntArrayUtilsTest {

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
		printArray2(arr2);
		
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
		System.out.println("maximum: " + IntArrayUtils.max(a));
		System.out.println("sum: " + IntArrayUtils.sum(a));
		System.out.println();
	}
	
	private static void printArray2(int[] a) {
		DecimalFormat dc = new DecimalFormat("0.00");
		System.out.println("elements: " + IntArrayUtils.toString(a));
		System.out.println("length: " + a.length);
		System.out.println("minimum: " + IntArrayUtils.min(a));
		System.out.println("product: " + IntArrayUtils.product(a));
		System.out.println("average: " + dc.format(IntArrayUtils.average(a)));
		System.out.println("couting the time the number 4 is repeated: " + IntArrayUtils.count(a, 4));
		System.out.print("fill with the value 4: ");
		IntArrayUtils.fill(a, 4);
		System.out.println(IntArrayUtils.toString(a));
		System.out.print("fill from index 5 to 15 with the value 27: ");
		IntArrayUtils.fill(a, 27, 5, 15);
		System.out.println(IntArrayUtils.toString(a));
	}

}
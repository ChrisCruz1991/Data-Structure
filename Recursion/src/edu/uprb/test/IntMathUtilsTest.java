/*
 * University of Puerto Rico at Bayam�n
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2015
 * Prof. Antonio F. Huertas
 */

package edu.uprb.test;

import edu.uprb.algorithm.IntMathUtils;

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
public class IntMathUtilsTest {

	/**
	 * Serves as the entry point for this application.
	 * @param args Not applicable: The command-line arguments.
	 */
	public static void main(String[] args) {
		final int NUM1 = 12, NUM2 = 20,
				NUM3 = 2;

		System.out.println("The sum up to " + NUM1 + " is " +
				IntMathUtils.sumUpTo(NUM1));
		System.out.println("The factorial of " + NUM1 + " is " +
				IntMathUtils.factorial(NUM1));
		System.out.println();

		System.out.println("The sum up to " + NUM2 + " is " +
				IntMathUtils.sumUpTo(NUM2));
		System.out.println("The factorial of " + NUM2 + " is " +
				IntMathUtils.factorial(NUM2));
		System.out.println();

		System.out.println("The greatest common divisor of " + 
				NUM1 + " and " + NUM2 + " is " + 
				IntMathUtils.greatestCommonDivisor(NUM1, NUM2));
		System.out.println();

		System.out.println("The number " + NUM3 + " elevated to the power of " + NUM1 + " is " +
		IntMathUtils.power(NUM3, NUM1));
		System.out.println();

		System.out.println("End of tests.");
		System.exit(0);
	}

}
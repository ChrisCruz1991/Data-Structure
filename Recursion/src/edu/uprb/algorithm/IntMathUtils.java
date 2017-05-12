/*
 * University of Puerto Rico at Bayamï¿½n
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2015
 * Prof. Antonio F. Huertas
 * * *************************************************
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Christopher Cruz Rubert
 * Student
 */

package edu.uprb.algorithm;

/**
 * This class contains various static utility methods for integers.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 02/09/2016
 * This is the original version
 * ****************************************************************
 * This class contains various static utility methods for integers, 
 * plus new methods.
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 03/16/2016.
 * Homework version.
 */
public final class IntMathUtils {

	/**
	 * Private constructor used to prevent instantiation.
	 */
	private IntMathUtils() { }

	/**
	 * Returns the sum up to the given non-negative integer.
	 * @param n The integer that serves as the upper limit.
	 * @return The sum up to the given non-negative integer.
	 * @throws IllegalArgumentException if the integer is negative.
	 */
	public static int sumUpTo(int n) {
		if (n < 0)
			throw new IllegalArgumentException("negative integer");
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		return sum;
	}

	/**
	 * Returns the factorial of the given non-negative integer.
	 * @param n The integer that serves as the upper limit.
	 * @return The factorial of the given non-negative integer.
	 * @throws IllegalArgumentException if the integer is negative.
	 */
	public static long factorial(int n) {
		if (n < 0)
			throw new IllegalArgumentException("negative integer");
		long prod = 1;
		for (int i = 1; i <= n; i++)
			prod *= i;
		return prod;
	}

	/**
	 * Returns the greatest common divisor for two non-negative integers.
	 * @param m The first non-negative integer.
	 * @param n The second non-negative integer.
	 * @return The greatest common divisor for two non-negative integers.
	 * @throws IllegalArgumentException if either integer is negative.
	 */
	public static int greatestCommonDivisor(int m, int n) {
		if (m < 0 || n < 0)
			throw new IllegalArgumentException("negative integer");
		while (n > 0) {
			int rem = m % n;
			m = n;
			n = rem;
		}
		return m;
	}
	
	/**
	 * Returns the result of the base elevated to the exponent given.
	 * @param base The base number.
	 * @param exponent The exponent.
	 * @return The result of the base elevated to the exponent given.
	 */
	public static long power (int base, int exponent) {
		if (exponent < 0)
			throw new IllegalArgumentException("Error. Negative exponent");
		long power = 1;
		for (int times = 0; times < exponent; times++) 
			power *= base;
		return power;
	}

}
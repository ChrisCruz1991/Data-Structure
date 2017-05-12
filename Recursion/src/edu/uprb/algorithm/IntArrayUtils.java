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
 * This class contains various static utility methods for integer arrays.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 02/09/2016
 * This is the original version
 * **********************************************************
 * This class contains various static utillity methods for integer arrays, plus
 * new utility methods.
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 03/16/2016
 * Homework version
 */
public final class IntArrayUtils {

	/**
	 * Private constructor used to prevent instantiation.
	 */
	private IntArrayUtils() { }

	/**
	 * Determines the maximum element of the given array.
	 * @param data The array to be examined.
	 * @return The maximum element of the given array.
	 * @throws IllegalArgumentException if the length of the array is < 1.
	 */
	public static int max(int[] data) {
		if (data.length < 1)
			throw new IllegalArgumentException("too few elements");
		int max = data[0];
		for (int curr = 1; curr < data.length; curr++)
			if (data[curr] > max)
				max = data[curr];
		return max;
	}

	/**
	 * Determines the sum of the elements of the given array.
	 * @param data The array to be examined.
	 * @return The sum of the elements of the given array.
	 */
	public static int sum(int[] data) {
		int sum = 0;
		for (int elem : data)
			sum += elem;
		return sum;
	}

	/**
	 * Returns the string representation of the given array as a list of
	 * the elements enclosed in brackets.
	 * Returns "null" if the given array is {@code null}.
	 * @param data The array to be examined.
	 * @return The string representation of the given array.
	 */
	public static String toString(int[] data) {
		StringBuilder str = new StringBuilder("[");
		for (int curr = 0; curr < data.length; curr++) {
			str.append(data[curr]);
			if (curr < data.length - 1)
				str.append(", ");
		}
		return str.append("]").toString();
	}

	/**
	 * Returns the reversed string representation of the given array as a list of
	 * the elements enclosed in brackets.
	 * Returns "null" if the given array is {@code null}.
	 * @param data The array to be examined.
	 * @return The reversed string representation of the given array.
	 */
	public  static String toReverseString(int[] data) {
		StringBuilder out = new StringBuilder("[");
		for (int pos = data.length - 1; pos >= 0; pos--) {
			out.append(data[pos]);
			if (pos > 0)
				out.append(", ");
		}
		return out.append("]").toString();
	}
} 

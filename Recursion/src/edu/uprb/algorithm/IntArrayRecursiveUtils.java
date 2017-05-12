/*
 * University of Puerto Rico at Bayamï¿½n
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
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
 * @version 02/25/2016
 * This is the original version
 * ****************************************************************
 * This class contains various static utility methods for integer arrays, 
 * plus new recursive methods
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 03/16/2016
 * Homework version
 */
public final class IntArrayRecursiveUtils {

	/**
	 * Private constructor used to prevent instantiation.
	 */
	private IntArrayRecursiveUtils() { }

	/**
	 * Determines the maximum element of the given array.
	 * @param data The array to be examined.
	 * @return The maximum element of the given array.
	 * @throws IllegalArgumentException if the length of the array is < 1.
	 */
	public static int max(int[] data) {
		if (data.length < 1)
			throw new IllegalArgumentException("too few elements");
		return max(data, data.length);
	}

	private static int max(int[] data, int len) {
		if (len == 1)
			return data[0];
		else
			return Math.max(max(data, len - 1), data[len - 1]);
	}

	/**
	 * Determines the sum of the elements of the given array.
	 * @param data The array to be examined.
	 * @return The sum of the elements of the given array.
	 */
	public static int sum(int[] data) {
		return sum(data, data.length);
	}

	private static int sum(int[] data, int len) {
		if (len == 0)
			return 0;
		else
			return sum(data, len - 1) + data[len - 1];
	}

	/**
	 * Determines the minimum element of the given array.
	 * @param data The array to be examined.
	 * @return The minimum element of the given array.
	 * @throws IllegalArgumentException if the length of the array is < 1.
	 */
	public static int min(int[] data) {
		if (data.length < 1)
			throw new IllegalArgumentException("too few elements.");
		return min (data, data.length);
	}

	private static int min (int[] data, int len) {
		if (len == 0)
			return data[0];
		else
			return Math.min(min(data, len - 1), data[len - 1]);
	}
	
	/**
	 * Determines the product of the elements of the given array.
	 * @param data The array to be examined.
	 * @return The product of the elements of the given array.
	 * @throws IllegalArgumentException if the length of the array is < 1.
	 */
	public static long product(int[] data) {
		if (data.length < 1)
			throw new IllegalArgumentException("too few elements.");
		return product(data, data.length);
	}
	
	private static long product(int[] data, int len) {
		if (len == 0)
			return 1;
		else
			return product(data, len - 1) * data[len - 1];
	}
	
	/**
	 * Determines the average of the elements of the given array.
	 * @param data The array to be examined.
	 * @return The average of the elements of the given array.
	 * @throws IllegalArgumentException if the length of the array is < 1.
	 */
	public static double average(int[] data) {
		if (data.length < 1)
			throw new IllegalArgumentException("too few elements.");
		return (double)sum(data) / data.length;
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
		toString(data, data.length, str);
		return str.append("]").toString();
	}

	private static void toString(int[] data, int len, StringBuilder str) {
		if (len != 0) {
			toString(data, len - 1, str);
			if (len > 1)
				str.append(", ");
			str.append(data[len - 1]);
		}
	}

	/**
	 * Returns the string representation of the given array as a list of
	 * the elements enclosed in brackets in reversed order.
	 * Returns "null" if the given array is {@code null.}
	 * @param data The array to be examined.
	 * @return The string representation of the given array in reversed order.
	 */
	public static String toReverseString(int[] data) {
		StringBuilder str = new StringBuilder("[");
		toReverseString(data, data.length, str);
		return str.append("]").toString();
	}

	private static void toReverseString(int[] data, int len, StringBuilder str) {
		if (len != 0) {
			str.append(data[len-1]);
			if (len > 1)
				str.append(", ");
			toReverseString(data, len - 1, str);
		}
	}
}
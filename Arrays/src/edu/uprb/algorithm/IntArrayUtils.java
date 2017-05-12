/*
 * University of Puerto Rico at Bayam�n
 * Department of Computer Science
 * SICI 4036, Section: LM1 - Data Structures, Spring 2016
 * Christopher Cruz Rubert
 * #841-09-1908
 * 
 */

package edu.uprb.algorithm;

/**
 * This class contains various static utility methods for integer arrays.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 02/09/2016
 * This is the original author of the class
 * ************************************************************
 * This class contains various static utility methods for integer arrays, 
 * and adds new methods 
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 02/29/2016
 * This is the modified version with the new methods
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
	 * Determines the minimum element of the given array.
	 * @param data The array to be examined.
	 * @return The minimum element of the given array.
	 * @throws IllegalArgumentException if the length of the array is < 1.
	 */
	public static int min (int[] data) {
		if (data.length < 1)
			throw new IllegalArgumentException("too few elements");
		int min = data[0];
		for (int curr = 1; curr < data.length; curr++)
			if (data[curr] < min)
				min = data[curr];
		return min;
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
	 * Determines the product of the elements of the given array.
	 * @param data The array to be examined.
	 * @return The product of the elements of the given array.
	 * @throws IllegalArgumentException if the length of the array is < 1.
	 */
	public static long product(int[] data) {
		if (data.length < 1)
			throw new IllegalArgumentException("too few elements.");
		long product = 1;
		for (int elem : data)
			product *= elem;
		return product;
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
		double sum = 0;
		for (int elem : data)
			sum += elem;
		return sum / data.length;
	}
	
	/**
	 * Determines how many times the value repeats itself in the given array
	 * @param data The array to be examined.
	 * @param val The value passed to verify if it repeats itself
	 * @return The count, how many times the value repeats itself
	 */
	public static int count(int[] data, int val) {
		int count = 0;
		for (int elem : data) {
			if (elem == val)
				count++;
		}
		return count;
	}
	
	/**
	 * Returns the given array with the new val
	 * @param data The array to be examined
	 * @param val The value to fill the entire array
	 * @return The array filled with the new value
	 */
	public static void fill(int[] data, int val) {
		for (int curr = 0; curr < data.length; curr++) 
			data[curr] = val;
	}
	
	/**
	 * This methods fill the array from a given index to another given index with the desired value
	 * @param data The array to be examined
	 * @param val The value to fill the a portion of the array
	 * @param fromIndex The starting value of the array
	 * @param toIndex The final value of the array
	 * @return The String representation of the entire array
	 */
	public static void fill(int[] data, int val, int fromIndex, int toIndex) {
		if (fromIndex > toIndex)
			throw new IllegalArgumentException("cannot start after the final position.");
		if (fromIndex < 0 || toIndex > data.length)
			throw new ArrayIndexOutOfBoundsException("negative starting index or index greater than limit.");
		
		for (int pos = fromIndex; pos < toIndex; pos++)
			data[pos] = val;
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
}
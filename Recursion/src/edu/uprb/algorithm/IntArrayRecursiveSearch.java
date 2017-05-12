/*
 * University of Puerto Rico at Bayamï¿½n
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 * Original Author
 * *************************************************
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Christopher Cruz Rubert
 * Student
 */

package edu.uprb.algorithm;

/**
 * This class contains various static utility methods for searching 
 * integer arrays.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 03/01/2016
 * This is the original version
 * ****************************************************************
 * This class contains various static utility methods for searching
 * integer arrays, plus a new linearSearch recursive method
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 03/16/2016
 * Homework version
 */
public final class IntArrayRecursiveSearch {

	/**
	 * Private constructor used to prevent instantiation.
	 */
	private IntArrayRecursiveSearch() { }

	/**
	 * Searches for the given element in the given array.
	 * @param data The array to be examined.
	 * @param elem The element to be searched for.
	 * @return The position of the element or -(insertion point + 1) if
	 *         it is not found.  The insertion point is defined as the 
	 *         point at which an item would be inserted into the array to 
	 *         keep it sorted.
	 */
	public static int binarySearch(int[] data, int elem) {
		return binarySearch(data, 0, data.length - 1, elem);
	}

	// Recursively searches for an element in an array.
	private static int binarySearch(int[] data, int low, int high, int elem) {
		if (low > high)
			return -(low + 1);
		else {
			int mid = (low + high) / 2;
			if (elem == data[mid])
				return mid;
			else if (elem < data[mid])
				return binarySearch(data, low, mid - 1, elem);
			else
				return binarySearch(data, mid + 1, high, elem);
		}
	}
	
	/**
	 * Searches for the given element in the given array.
	 * @param data The array to be examined.
	 * @param elem The element to be searched for.
	 * @return The position of the element or -1 if it is not found.
	 */
	public static int linearSearch(int[] data, int elem){
		return linearSearch(data, data.length, elem);
	}
	
	// Recursively searches for an element in an array.
	private static int linearSearch(int[] data, int len, int elem){
		if(len == 0)
			return - 1;
		else if (elem == data[len - 1])
			return len - 1;
		else
			return linearSearch(data, len - 1, elem);
		}

}
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
 * This class contains various static utility methods for searching 
 * integer arrays.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 02/11/2016
 * This is the original version
 * *******************************************************
 * This class contains various static utility methods for searching
 * integer arrays, plus new methods for the class
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 02/29/2016
 */
public final class IntArraySearch {

	/**
	 * Private constructor used to prevent instantiation.
	 */
	private IntArraySearch() { }

	/**
	 * Searches for the given element in the given array.
	 * @param data The array to be examined.
	 * @param elem The element to be searched for.
	 * @return The position of the element or -1 if it is not found.
	 */
	public static int linearSearch(int[] data, int elem) {
		for (int curr = 0; curr < data.length; curr++)
			if (elem == data[curr])
				return curr;     // found at curr
		return -1;               // not found
	}
	
	/**
	 * Searches for the given elemen in the given array between two given indexes
	 * @param data The array to be examined.
	 * @param elem The element to be searched for.
	 * @param fromIndex The starting index.
	 * @param toIndex The final index.
	 * @return The position of the element or -1 if it is not found.
	 */
	public static int linearSearch(int[] data, int elem, int fromIndex, int toIndex) {
		if (fromIndex > toIndex)
			throw new IllegalArgumentException("cannot start after the final position.");
		if (fromIndex < 0 || toIndex > data.length)
			throw new ArrayIndexOutOfBoundsException("negative starting index or index greater than limit.");
		
		for (int curr = fromIndex; curr < toIndex; curr++)
			if (elem == data[curr])
				return curr;	//found at curr
		return -1;				//not found
	}

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
		int low = 0;
		int high = data.length - 1;

		while (low <= high) {
			int middle = (low + high) / 2;
			int midElem = data[middle];

			if (elem < midElem)
				high = middle - 1;
			else if (elem > midElem)
				low = middle + 1;
			else
				return middle;    // found at middle
		}
		return -(low + 1);        // not found
	}

	/**
	 * Searches for the given element in the given array.
	 * @param data The array to be examined.
	 * @param elem The element to be searched for.
	 * @param fromIndex The starting index.
	 * @param toIndex The final index.
	 * @return The position of the element or -(insertion point +1) if
	 * 			it is not found.  The insertion point is defined as the
	 * 			point at which an item would be inserted into the array to
	 * 			keep it sorted.
	 */
	public static int binarySearch(int[] data, int elem, int fromIndex, int toIndex) {
		if (fromIndex > toIndex)
			throw new IllegalArgumentException("cannot start after the final position.");
		if (fromIndex < 0 || toIndex > data.length)
			throw new ArrayIndexOutOfBoundsException("negative starting index or index greater than limit.");
		
		int low = fromIndex;
		int high = toIndex;
		
		while (low <= high) {
			int middle = (low + high) / 2;
			int midElem = data[middle];
			
			if (elem < midElem)
				high = middle - 1;
			else if (elem > midElem)
				low = middle + 1;
			else
				return middle;		//found at middle
		}
		return -(low + 1);			// not found
	}
}
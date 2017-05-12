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
 * This class contains various static utility methods for sorting 
 * integer arrays.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 02/16/2016
 * This is the original author
 * *****************************************************************
 * This class contains various static utility methods for sorting
 * integer arrays, plus new methods
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 02/9/2016
 */
public final class IntArraySort {

	/**
	 * Private constructor used to prevent instantiation.
	 */
	private IntArraySort() { }

	/**
	 * Sorts the elements of the given array.
	 * @param data The array to be sorted.
	 */
	public static void selectionSort(int[] data) {
		for (int pos = 0; pos < data.length - 1; pos++) {
			int minIdx = pos;
			for (int curr = pos + 1; curr < data.length; curr++)
				if (data[curr] < data[minIdx])
					minIdx = curr;
			if (pos != minIdx) {
				int temp = data[pos];
				data[pos] = data[minIdx];
				data[minIdx] = temp;
			}
		}
	}

	/**
	 * Sorts the element of the given array.
	 * @param data The array to be sorted
	 * @param fromIndex The starting index.
	 * @param toIndex The ending index.
	 */
	public static void selectionSort(int[] data, int fromIndex, int toIndex) {
		if (fromIndex > toIndex)
			throw new IllegalArgumentException("starting index greater than limit.");
		if (fromIndex < 0 || toIndex > data.length)
			throw new IllegalArgumentException("negative starting index or final index greater than limit.");
		
		for (int pos = fromIndex; pos <= toIndex - 1; pos++) {
			int minIdx = pos;
			for (int curr = pos + 1; curr <= toIndex; curr++)
				if (data[curr] < data[minIdx])
					minIdx = curr;
			if (pos != minIdx) {
				int temp = data[pos];
				data[pos] = data[minIdx];
				data[minIdx] = temp;
			}
		}
	}

	/**
	 * Sorts the elements of the given array.
	 * @param data The array to be sorted.
	 */
	public static void insertionSort(int[] data) {
		for (int curr = 1; curr < data.length; curr++) {
			int temp = data[curr], pos = curr;
			while (pos > 0 && temp < data[pos - 1]) {
				data[pos] = data[pos - 1];
				pos--;
			}
			data[pos] = temp;
		}
	}

	/**
	 * Sorts the elements of the given array.
	 * @param data The array to be sorted.
	 * @param fromIndex The staring index.
	 * @param toIndex The final index.
	 */
	public static void insertionSort(int[] data, int fromIndex, int toIndex) {
		if (fromIndex > toIndex)
			throw new IllegalArgumentException("starting index greater than limit.");
		if (fromIndex < 0 || toIndex > data.length)
			throw new IllegalArgumentException("negative starting index or final index greater than limit.");
		
		for (int curr  = fromIndex + 1; curr <= toIndex; curr++) {
			int temp = data[curr], pos = curr;
			while (pos > fromIndex && temp < data[pos - 1]) {
				data[pos] = data[pos - 1];
				pos--;
			}
			data[pos] = temp;
		}
	}
}
/*
 * University of Puerto Rico at Bayamï¿½n
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 * *************************************************
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Christopher Cruz Rubert
 * Student
 */

package edu.uprb.algorithm;

/**
 * This class contains various static utility methods for sorting 
 * integer arrays.
 * @author Antonio F. Huertas <antonio.huertas@upr.edu>
 * @version 03/03/2016
 * This is the original version
 * ***********************************************************
 * This class contains various static utility methods for sorting
 * integer arrays, plus a insertionSort recursive method
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 03/16/2016
 * Homework version
 */
public final class IntArrayRecursiveSort {
	
	/**
	 * Private constructor used to prevent instantiation.
	 */
	private IntArrayRecursiveSort() { }
	
	/**
	 * Sorts the elements of the given array.
	 * @param data The array to be sorted.
	 */
	public static void mergeSort(int[] data) {
		if (data.length > 1) {
			int len1 = data.length / 2, len2 = data.length - len1;
			int[] first = new int[len1], second = new int[len2];

			for (int curr1 = 0; curr1 < len1; curr1++)
				first[curr1] = data[curr1];
			for (int curr2 = 0; curr2 < len2; curr2++)
				second[curr2] = data[len1 + curr2];

			mergeSort(first);
			mergeSort(second);
			merge(first, second, data);
		}
	}

	/**
	 * Merges the two given sorted arrays to form a third sorted array.
	 * @param first   The first sorted array.
	 * @param second  The second sorted array.
	 * @param data    The resultant sorted array.
	 */
	private static void merge(int[] first, int[] second, int[] data) {
		int curr = 0, curr1 = 0, curr2 = 0;
		
		while (curr1 < first.length && curr2 < second.length) {
			if (first[curr1] < second[curr2])
				data[curr++] = first[curr1++];
			else
				data[curr++] = second[curr2++];	
		}
		while (curr1 < first.length)
			data[curr++] = first[curr1++];
		while (curr2 < second.length)
			data[curr++] = second[curr2++];
	}

	/**
	 * Sorts the elements of the given array.
	 * @param data The array to be sorted.
	 */
	public static void quickSort(int[] data) {
		quickSort(data, 0, data.length - 1);
	}

	private static void quickSort(int data[], int low, int high) {
		int index = partition(data, low, high);
		if (low < index - 1)
			quickSort(data, low, index - 1);
		if (index < high)
			quickSort(data, index, high);
	}

	/**
	 * Partitions an array in two portions: those elements less than the
	 * pivot and those elements greater than the pivot.
	 * @param data The array to be partitioned.
	 * @param low   The first index of the array.
	 * @param high  The last index of the array.
	 * @return The start of the second portion.
	 */
	private static int partition(int data[], int low, int high)
	{
		int pivotElem = data[(low + high) / 2];
		int left = low, right = high;

		while (left <= right) {
			while (data[left] < pivotElem)
				left++;
			while (data[right] > pivotElem)
				right--;
			if (left <= right) {
				int temp = data[left];
				data[left++] = data[right];
				data[right--] = temp;
			}
		}
		return left;  // start of second portion
	 }
	
	
	/**
	 * Sorts the elements of the given array.
	 * @param data The array to be sorted.
	 */
	public static void selectionSort(int[] data) {
		selectionSort(data, 0);
	}
	
	//Recursively sorts the array
	private static void selectionSort(int[] data, int len) {
		if (len < data.length) {
			int min = selection(data, len);
			if (min != len) {
				int temp = data[min];
				data[min] = data[len];
				data[len] = temp;
			}
			selectionSort(data, len + 1);
		}
	}
	
	private static int selection(int[] data, int fromIndex) {
		int min = fromIndex;
		for (int curr = fromIndex; curr < data.length; curr++) {
			if (data[curr] < data[min])
				min = curr;
		}
		return min;
	}
}
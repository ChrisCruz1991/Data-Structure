/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

package edu.uprb.company;

/**
 * This class is an exception thrown when setting invalid values
 * @author Christopher Cruz 841-09-1908 <christopher.cruz2@upr.edu>
 * @version 02/01/2016
 */
@SuppressWarnings("serial")
public class InvalidEmployeeException extends RuntimeException {
	
	/**
	 * Creates an exception with the given message
	 * @param str The detail message
	 */
	public InvalidEmployeeException(String str) {
		super(str);
	}
	
	/**
	 * Creates an exception with no detail message
	 */
	public InvalidEmployeeException() {
		super();
	}

}

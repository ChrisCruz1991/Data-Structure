
/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

package edu.uprb.datastructure;


/**
 * This class is an exception thrown when the list is empty
 * @author Christopher Cruz 841-09-1908 <christopher.cruz2@upr.edu>
 * @version 
 */
@SuppressWarnings("serial")
public class EmptyLinkedListException extends RuntimeException{
	
	/**
	 * Creates an exception with the given message.
	 * @param str The given message.
	 */
	
	public EmptyLinkedListException(String str) {
		super(str);
	}
	
	/**
	 * Creates an exception with no given detail
	 */
	
	public EmptyLinkedListException() {
		super();
	}

}

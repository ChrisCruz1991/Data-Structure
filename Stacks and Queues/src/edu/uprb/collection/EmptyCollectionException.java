
/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

/*
 * EmptyCollectionException.java
 * This is the exception thrown when trying to get an element from an 
 * empty collection.
 */

package edu.uprb.collection;

@SuppressWarnings("serial")
public class EmptyCollectionException extends RuntimeException {
	
	// Creates an exception with no detail message.
	public EmptyCollectionException() {
		super();
	}
	
	// Creates an exception with the given detail message.
	public EmptyCollectionException(String msg) {
		super(msg);
	}

}
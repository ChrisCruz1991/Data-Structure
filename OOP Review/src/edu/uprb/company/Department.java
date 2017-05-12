
/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

package edu.uprb.company;

/**
 * This enumerated type represents different types of departments
 * @author Christopher Cruz 841-09-1908 <christopher.cruz2@upr.edu>
 * version 01/28/2016
 */
public enum Department {
	
	SALE, MKTG, HMRS, FINA, INTE;
	
	/**
	 * Returns the real name of each enum
	 * @return the real name of each enum
	 */
	@Override
	public String toString() {
		switch(this) {
		case SALE: return "Sale";
		case MKTG: return "Marketing";
		case HMRS: return "Human Resources";
		case FINA: return "Finance";
		case INTE: return "Information Technology";
		default: return "Sale";
		}
	}

}

/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */
package edu.uprb.test;

import edu.uprb.company.*;

/**
 * This class is the test application for the enum class Department
 * @author Christopher Cruz 841-09-1908 <christopher.cruz2@upr.edu>
 * version 01/28/2016
 */
public class DepartmentTest {

	/**
	 * Serves as the entry point for this application
	 * @param args Not applicable: The command-line arguments
	 */
	public static void main(String[] args) {

		/** Create two instances of the Department class */
		Department dep1 = Department.SALE;
		Department dep2 = Department.MKTG;

		System.out.println("Two departments have been created...");
		System.out.println("This is dep1...");
		printDep(dep1);
		System.out.println("This is dep2...");
		printDep(dep2);

		System.out.println("Are dep1 and dep2 equal? " + dep1.equals(dep2));
		System.out.print("Comparing the departments: ");
		if (dep1.compareTo(dep2) < 0)
			System.out.println("dep1 goes before dep2");
		else if (dep1.compareTo(dep2) > 0)
			System.out.println("dep1 goes after dep2");
		else
			System.out.println("dep1 and dep2 are the same");
		System.out.println();

		dep1 = Department.HMRS;
		dep2 = Department.INTE;

		System.out.println("The two departments have been changed...");
		System.out.println("This is dep1...");
		printDep(dep1);
		System.out.println("This is dep2...");
		printDep(dep2);

		System.out.println("These are the available departments...");
		for (Department d : Department.values())
			System.out.println(d);
		System.out.println();

		System.out.println("End of tests.");
		System.exit(0);
	}

	/**
	 * Displays the department
	 * @param dep The department
	 */
	private static void printDep(Department dep) {
		System.out.println("Value: " + dep);
		System.out.println("real name: " + dep.name());
		System.out.println("ordinal value: " + dep.ordinal());
		System.out.println();
	}

}

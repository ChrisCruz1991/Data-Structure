/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */
package edu.uprb.app;

import java.text.DecimalFormat;

import edu.uprb.company.*;

/**
 * This class is an application that prints an array of Employees
 * @author Christopher Cruz 841-09-1908 <christopher.cruz2@upr.edu>
 * @version 02/01/2016
 */
public class EmployeeArrayPrintApp {

	/**
	 * Serves as the entry point for this application
	 * @param args Non applicable: The command-line arguments
	 */
	public static void main(String[] args) {
		Employee arr[] = {
				new HourlyEmployee(1111, "Yashira Cruz", Department.SALE, 40, 8.25),
				new SalesEmployee(2222, "Gilberto Cruz", Department.MKTG, 1500.00, 0.75),
				new HourlyEmployee(),
				new SalesEmployee(),
				new SalesEmployee(3333, "Wilmer Soto", Department.FINA, 2000.00, 0.50)};

		System.out.println("Five employees have been created...");
		System.out.println();

		//Display the employees
		System.out.println("These are the employees...");
		for(Employee elem: arr)
			printEmployee(elem);

		//End application with success
		System.out.println("End of application.");
		System.exit(0);
	}

	/**
	 * Displays the employees information
	 * @param emp The employee to display
	 */
	private static void printEmployee(Employee emp) {
		DecimalFormat format = new DecimalFormat("$#,##0.00");
		
		System.out.println("Type: " + emp.getClass().getSimpleName());
		System.out.println("Data: " + emp);
		System.out.println("Weekly Salary: " + format.format(emp.weeklySalary()));
		System.out.println();
	}
}

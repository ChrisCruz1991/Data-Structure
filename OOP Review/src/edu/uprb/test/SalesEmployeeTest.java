/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */
package edu.uprb.test;

import edu.uprb.company.*;

/**
 * This class is a test application for SalesEmployee
 * @author Christopher Cruz 841-09-1908 <christopher.cruz2@upr.edu>
 * version 01/28/2016
 *
 */
public class SalesEmployeeTest {

	/**
	 * Serves as an entry point for this application
	 * @param args Not applicable: The command-line arguments
	 */
	public static void main(String[] args) {
		
		//Create two instances of the SalesEmployee class
		SalesEmployee salesEmp1 = new SalesEmployee(1000, "Christopher Cruz", Department.MKTG,
				1000.00, 0.50);
		SalesEmployee salesEmp2 = new SalesEmployee();

		//Display the information for both employees
		System.out.println("Two sales employees were created...");
		System.out.println("This is employee salesEmp1...");
		printSalesEmp(salesEmp1);
		System.out.println("This is employee salesEmp2...");
		printSalesEmp(salesEmp2);
		System.out.println();

		//Verify if they are equal based on their id
		System.out.println("Are these employees equal? " + salesEmp1.equals(salesEmp2));
		System.out.println();

		salesEmp2.setEmployeeId(1000);
		
		System.out.println("The employee salesEmp2 id was changed to " + salesEmp2.getEmployeeId());
		System.out.println();

		//Verify if they are equal based on their id
		System.out.println("Are these employees equal? " + salesEmp1.equals(salesEmp2));
		System.out.println();

		//Verify if the InvalidEmployeeException works for 
		//invalid values for name, commissionRate and salesAmount
		try {
			System.out.println("Trying to change the employee salesEmp2 id to a invalid value...");
			salesEmp2.setEmployeeId(1);
			System.out.println("The id of employee salesEmp2 was changed to " + salesEmp2.getEmployeeId());
		}
		catch (InvalidEmployeeException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println();

		try {
			System.out.println("Trying to change the employees salesEmp2 name to a invalid value...");
			salesEmp2.setName("Y");
			System.out.println("The name of employee salesEmp2 was changed to " + salesEmp2.getName());
		}
		catch (InvalidEmployeeException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println();

		try {
			System.out.println("Trying to change the employees salesEmp2 commission to a invalid value...");
			salesEmp2.setCommisionRate(-0.50);
			System.out.println("The commision rate of employee salesEmp2 was changed to " + salesEmp2.getCommisionRate());
		}
		catch (InvalidEmployeeException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println();

		try {
			System.out.println("Trying to change the employee salesEmp2 sales amount to a invalid value...");
			salesEmp2.setSalesAmount(-1.00);
			System.out.println("The sales amount of employee salesEmp2 was changed to " + salesEmp2.getSalesAmount());
		}
		catch (InvalidEmployeeException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println();

		//Display employee 2
		System.out.println("This is employee salesEmp2...");
		printSalesEmp(salesEmp2);
		
		//Exit application with success
		System.out.println("End of test.");
		System.exit(0);
	}

	/**
	 * Displays the general information for the sales employee
	 * with its weekly salary included
	 * @param sales The sales employee
	 */
	private static void printSalesEmp(SalesEmployee sales) {
		System.out.println("Data: " + sales);
		System.out.println("Weekly salary: " + sales.weeklySalary());
		System.out.println();
	}
}

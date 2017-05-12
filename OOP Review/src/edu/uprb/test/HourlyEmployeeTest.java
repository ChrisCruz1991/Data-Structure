
/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

package edu.uprb.test;
import edu.uprb.company.*;

/**
 * This class is a test application for HourlyEmployee
 * @author Christopher Cruz 841-09-1908 <christopher.cruz2@upr.edu>
 * version 01/28/2016
 *
 */
public class HourlyEmployeeTest {

	/**
	 * Serves as an entry point for this application
	 * @param args Not applicable: The command-line argument
	 */
	public static void main(String[] args) {
		
		//Create two instances of the HourlyEmployee class
		HourlyEmployee hrEmp1 = new HourlyEmployee(5000, "Stacey Ann", Department.HMRS, 42, 7.25);
		HourlyEmployee hrEmp2 = new HourlyEmployee();

		//Display both hourly employees
		System.out.println("Two hourly employee has been created...");
		System.out.println("This is employee hrEmp1...");
		printHrEmp(hrEmp1);
		System.out.println("This is employee hrEmp2...");
		printHrEmp(hrEmp2);
		System.out.println();

		//Verify if both are equals
		System.out.println("Are these employees equal? " + hrEmp1.equals(hrEmp2));
		System.out.println();

		hrEmp2.setEmployeeId(5000);

		//Display the changed value
		System.out.println("The employee hrEmp2 was changed...");
		System.out.println("The employee id is " + hrEmp2.getEmployeeId());
		System.out.println();

		//Verify if they are equal
		System.out.println("Are these employees equal? " + hrEmp1.equals(hrEmp2));
		System.out.println();

		//Verify if the InvalidEmployeeException handles a incorrect value
		//for the name, hoursWorked, and payRate
		try {
			System.out.println("Trying to put an invalid id to employee hrEmp2...");
			hrEmp2.setEmployeeId(9);
			System.out.println("The employee hrEmp2 information was changed to " + 
					hrEmp2.getEmployeeId());
		}
		catch (InvalidEmployeeException ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println();

		try {
			System.out.println("Trying to put an invalid name to employee hrEmp2...");
			hrEmp2.setName("N");
			System.out.println("The employee hrEmp2 information was changed to " + 
					hrEmp2.getName());
		}
		catch (InvalidEmployeeException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println();

		try {
			System.out.println("Trying to put an invalid hour to employee hrEmp2...");
			hrEmp2.setHoursWorked(-1);
			System.out.println("The employee hrEmp2 hours was changed to " + 
					hrEmp2.getHoursWorked());
		}
		catch (InvalidEmployeeException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println();
		
		try {
			System.out.println("Trying to put an invalid pay rate to employee hrEmp2..");
			hrEmp2.setPayRate(-5.50);
			System.out.println("The employe hrEmp2 pay rate was changed to " + 
					hrEmp2.getPayRate());
		}
		catch (InvalidEmployeeException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println();
		
		//Display the employee 2
		System.out.println("This is employee hrEmp2...");
		printHrEmp(hrEmp2);

		//Exit application with success
		System.out.println("End of test.");
		System.exit(0);
	}
	
	/**
	 * Displays the hourly employee
	 * @param hrEmp the hourly employee to display
	 */
	private static void printHrEmp(HourlyEmployee hrEmp) {
		System.out.println("Data: " + hrEmp);
		System.out.println("Weekly Salary: " + hrEmp.weeklySalary());
		System.out.println();
	}

}


/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

package edu.uprb.company;

import java.text.DecimalFormat;

/**
 * This class will calculate the hours worked
 * and the pay rate of the hourly employee
 * @author Christopher Cruz 841-09-1908 <christopher.cruz2@upr.edu>
 * version 01/28/2016
 */

public class HourlyEmployee extends Employee {

	/** The hours worked by the employee */
	private int hoursWorked;

	/** The pay rate of the employee */
	private double payRate;

	/**
	 * Creates an hourly employee with the given values
	 * @param employeeId The employees id
	 * @param name The employees name
	 * @param department The employees department
	 * @param hoursWorked The employees hours worked
	 * @param payRate The employees pay rate
	 */
	public HourlyEmployee(int employeeId, String name, Department department, int hoursWorked, double payRate) {
		super(employeeId, name, department);
		setHoursWorked(hoursWorked);
		setPayRate(payRate);
	}

	/**
	 * Creates a hourly employee with the default values
	 */
	public HourlyEmployee() {
		super();
		hoursWorked = 40;
		payRate = 10.0;
	}

	/**
	 * Sets the hours worked by the employee
	 * @param hoursWorked
	 * @throws InvalidEmployeeException if the given value is either
	 * negative or greater than 60
	 */
	public void setHoursWorked(int hoursWorked) {
		if(hoursWorked < 0 || hoursWorked > 60)
			throw new InvalidEmployeeException("Error: Invalid hours");
		this.hoursWorked = hoursWorked;
	}

	/**
	 * Sets the pay rate of the employee
	 * @param payRate
	 * @throws InvalidEmployeeException if the given value is either
	 * less than 7.00 or greater than 50.00
	 */
	public void setPayRate(double payRate) {
		if(payRate < 7.00 || payRate > 50.00)
			throw new InvalidEmployeeException("Error: Invalid pay rate.");
		this.payRate = payRate;
	}

	/**
	 * Returns the hours worked by the employee
	 * @return the hours worked by the employee
	 */
	public int getHoursWorked() {
		return hoursWorked;
	}

	/**
	 * Returns the pay rate of the employee
	 * @return the pay rate of the employee
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * Returns the weekly salary of the employee
	 * after calculating his hours worked and his pay rate
	 * @return the weekly salary of the employee
	 */
	@Override
	public double weeklySalary() {
		double salary = 0.00;
		if(hoursWorked <= 40) 
		return hoursWorked * payRate;
		else if(hoursWorked > 40) 
			salary = (hoursWorked * payRate) + ((hoursWorked - 40) * (2 * payRate));
		return salary;
	}

	/**
	 * Returns the String representation of this employee
	 * @return the String representation of this employee
	 */
	@Override
	public String toString() {
		DecimalFormat payFormat = new DecimalFormat("$#,##0.00");
		DecimalFormat hourFormat = new DecimalFormat("#0");
		return super.toString() + ", hours= " + hourFormat.format(hoursWorked) + 
				", pay rate= " + payFormat.format(payRate);
	}

}

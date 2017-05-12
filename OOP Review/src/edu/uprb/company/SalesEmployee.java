
/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

package edu.uprb.company;

import java.text.DecimalFormat;

/**
 * This class sets the information for the
 * sales employee type, derived from the Employee class
 * @author Christopher Cruz 841-09-1908 <christopher.cruz2@upr.edu>
 * version 01/28/2016
 */
public class SalesEmployee extends Employee {

	/**The sales amount of the sales employee */
	private double salesAmount;

	/**The commision rate of the sales employee */
	private double commisionRate;

	/**
	 * Creates an sales employee with the information provided
	 * @param employeeId The employee id
	 * @param name The employee name
	 * @param department The employee department
	 * @param salesAmount The employee sales amount
	 * @param commisionRate The employee commission rate
	 */
	public SalesEmployee(int employeeId, String name, Department department, double salesAmount, 
			double commisionRate) {
		super(employeeId, name, department);
		setSalesAmount(salesAmount);
		setCommisionRate(commisionRate);
	}

	/**
	 * Creates an sales employee with the default information
	 */
	public SalesEmployee() {
		super();
		salesAmount = 0.00;
		commisionRate = 0.10;
	}

	/**
	 * Returns the sales amount
	 * @return the sales amount
	 */
	public double getSalesAmount() {
		return salesAmount;
	}

	/**
	 * Returns the commision rate
	 * @return the commision rate
	 */
	public double getCommisionRate() {
		return commisionRate;
	}

	/**
	 * Sets the commission rate of the sales employee
	 * @param commisionRate
	 * @throws InvalidEmployeeException if the commisionRate is negative
	 * or greater than 1.00
	 */
	public void setCommisionRate(double commisionRate) {
		if(commisionRate < 0.00 || commisionRate > 1.00)
			throw new InvalidEmployeeException("Error: Invalid commision rate.");
		this.commisionRate = commisionRate;
	}

	/**
	 * Sets the sales amount of the sales employee
	 * @param salesAmount
	 * @throws InvalidEmployeeException if the salesAmount is negative
	 */
	public void setSalesAmount(double salesAmount) {
		if(salesAmount < 0.00)
			throw new InvalidEmployeeException("Error: Invalid sales amount.");
		this.salesAmount = salesAmount;
	}

	/**
	 * Returns the weekly salary of the sales employee
	 * @return the weekly salary of the sales employee
	 */
	@Override
	public double weeklySalary() {
		return salesAmount * commisionRate;
	}

	/**
	 * Returns a String representation of the sales employee with 
	 * information of the super class
	 * @return a String representation of the sales employee with
	 * information of the super class
	 */
	@Override
	public String toString() {
		DecimalFormat fmtSales = new DecimalFormat("$#,##0.00");
		DecimalFormat fmtComm = new DecimalFormat("0.00");

		return super.toString() + ", sales amount= " + fmtSales.format(salesAmount) +
				", commision rate= " + fmtComm.format(commisionRate);
	}
}

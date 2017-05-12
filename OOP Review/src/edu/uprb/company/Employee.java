
/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

package edu.uprb.company;

/**
 * This is an abstract class that holds 
 * information for a company employee
 * @author Christopher Cruz 841-09-1908 <christopher.cruz2@upr.edu>
 * @version 01/28/2016
 *
 */
public abstract class Employee {
	
	/** The employee id */
	private int employeeId;
	
	/** The employees name */
	private String name;
	
	/** The employees department */
	private Department department;
	
	
	/**
	 * Creates an employee with its information
	 * @param employeeId The employee id
	 * @param name The employee name
	 * @param department The employee department
	 */
	public Employee(int employeeId, String name, Department department) {
		setEmployeeId(employeeId);
		setName(name);
		setDepartment(department);
	}
	
	/**
	 * Creates an employee with default values
	 */
	public Employee() {
		this(9999, "UNKNOWN", Department.SALE);
	}
	
	/**
	 * Sets the employee id to the given value
	 * @param employeeId The employees id
	 */
	public void setEmployeeId(int employeeId) {
		if(employeeId < 1000 || employeeId > 9999)
			throw new InvalidEmployeeException("Error: Invalid employee Id.");
		this.employeeId = employeeId;
	}
	
	/**
	 * Sets the name to the given value
	 * @param name The name of the employee
	 */
	public void setName(String name) {
		if(name.length() < 5 || name.length() > 20)
			throw new InvalidEmployeeException("Error: Invalid employee name.");
		this.name = name;
	}
	
	/**
	 * Sets the department to the given value
	 * @param department The employees department
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	/**
	 * Returns the employees id
	 * @return the employees id
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * Returns the name of the employee
	 * @return The name of the employee
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Return the type of department
	 * @return the type of department
	 */
	public Department getDepartment() {
		return department;
	}
	
	/**
	 * Returns the weekly Salary for the employee
	 * @return the weekly salary for the employee
	 */
	public abstract double weeklySalary();
	
	/**
	 * Determines whether this employee has the same data
	 * as the object based on its id
	 * @param obj The object this employee is compared to
	 * @return {code true} if this employee is equal to the other object
	 */
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return this.employeeId == other.employeeId;
	}
	
	/**
	 * Return a String representation of this employee
	 * @return a String representation of this employee
	 */
	@Override
	public String toString() {
		return "ID= " + employeeId + ", name= " + name +
				", department= " + department;
	}
}

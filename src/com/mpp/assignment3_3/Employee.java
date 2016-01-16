package com.mpp.assignment3_3;

public class Employee {

	private int employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String date;
	private String ssn;
	private double salary;
	private Position position;

	public Employee(int employeeId, String firstName, String middleName, String lastName, String date, String ssn,
			double salary, Position position) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.date = date;
		this.ssn = ssn;
		this.salary = salary;
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void print() {

		System.out.println("-----Employee Detail---------");
		System.out.println("Employee Name: "+firstName+" "+middleName+" "+lastName);
		System.out.println("Employee Birthdate: "+date);
		System.out.println("Employee SSN: "+ ssn);
		System.out.printf("Employee Salary: $%,.2f\n",salary);
	}

}

package com.mpp.assignment3_3;

import java.util.ArrayList;

public class Company {
	private String name;

	private ArrayList<Department> department;

	public Company(String name) {

		this.name = name;
	}

	public ArrayList<Department> getDepartment() {
		return department;
	}

	public void addDepartment(Department department) {
		this.department.add(department);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {

	}

	public double getSalary() {
		return 0;

	}

	public void printReportingHierarcy() {

	}

	public Position getTopExecutive() {
		return null;

	}

}

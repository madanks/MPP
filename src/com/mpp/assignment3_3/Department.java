package com.mpp.assignment3_3;

import java.util.ArrayList;

public class Department {

	private String name;
	private String location;
	private Company company;

	private ArrayList<Position> position;

	public Department(String name, String location, Company company) {
		this.name = name;
		this.location = location;
		this.company = company;
	}

	public void addPosition(Position p) {
		position.add(p);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void print() {

	}

	public double getSalary() {
		return 0;

	}

	public void printReportingHierarcy() {

	}

	public Position getDepartmentHead() {
		return null;

	}

}

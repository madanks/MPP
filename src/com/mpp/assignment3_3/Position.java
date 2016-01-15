package com.mpp.assignment3_3;

import java.util.ArrayList;

public class Position {

	private String title;

	private String description;

	private Position superior;

	private ArrayList<Position> inferior;

	private ArrayList<Employee> employee;

	public void add(Employee employee) {
		this.employee.add(employee);
	}

	public String getTitle() {
		return title;
	}

	public Position getSuperior() {
		return superior;
	}

	public void setSuperior(Position superior) {
		this.superior = superior;
	}

	public void addInferiorPosition(Position p) {
		inferior.add(p);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void print() {

	}

	public double getSalary() {
		return 0;

	}

	public void printReportingHierarcy() {

	}

	public boolean isManager() {
		return false;

	}

}

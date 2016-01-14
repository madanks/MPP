package com.mpp.assignment2;

import java.util.ArrayList;

public class Staff extends Person {

	private double salary;

	private ArrayList course;

	public Staff(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
		course = new ArrayList();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

package com.mpp.assignment5_1;

public class Salaried extends Employee {

	public double salary;

	public Salaried(double salary) {
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(DateRange dr) {
		return salary;

	}

}

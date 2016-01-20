package com.mpp.assignment5_1;

import java.util.GregorianCalendar;

public class Salaried extends Employee {

	public double salary;

	public Salaried(int empid,double salary) {
		super(empid);
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(DateRange daterang) {
		return salary;

	}

}

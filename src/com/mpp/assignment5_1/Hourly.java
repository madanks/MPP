package com.mpp.assignment5_1;

import java.util.GregorianCalendar;

public class Hourly extends Employee {

	public double hourlyWage;
	public int hourPerWeek;

	public Hourly(int empid, double hourlyWage, int hourPerWeek) {
		super(empid);
		this.hourlyWage = hourlyWage;
		this.hourPerWeek = hourPerWeek;
	}

	public double calcGrossPay(DateRange daterang) {
		double grossamt = hourPerWeek * 4 * hourlyWage;

		return grossamt;

	}

}

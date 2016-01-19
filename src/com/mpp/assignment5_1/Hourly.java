package com.mpp.assignment5_1;

public class Hourly extends Employee {

	public double hourlyWage;
	public int hourPerWeek;

	public Hourly(double hourlyWage, int hourPerWeek) {

		this.hourlyWage = hourlyWage;
		this.hourPerWeek = hourPerWeek;
	}

	public double calcGrossPay() {
		return hourPerWeek * 4 * hourlyWage;

	}

}

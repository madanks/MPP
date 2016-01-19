package com.mpp.assignment5_1;

import java.util.List;

public abstract class Employee {

	private int empId;
	List<PayCheck> paycheck;

	public PayCheck calcCompensation() {

		return null;
	}

	public void print() {

	}

	public abstract double calcGrossPay(DateRange dr);

}

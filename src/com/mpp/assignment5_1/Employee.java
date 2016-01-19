package com.mpp.assignment5_1;

import java.util.List;

public abstract class Employee {

	private int empId;
	List<PayCheck> paycheck;

	public PayCheck calcCompensation(int month, int year) {
		double grossAmt = calcGrossPay();

		double fica = grossAmt * 0.23;
		double state = grossAmt * 0.05;
		double local = grossAmt * 0.01;
		double medicare = grossAmt * 0.03;
		double socialSecurity = grossAmt * 0.075;
		//PayCheck pc = new PayCheck(fica, state, local, medicare, socialSecurity, socialSecurity, null);
		return null;
	}

	public void print() {

	}

	public abstract double calcGrossPay();

}

package com.mpp.assignment5_1;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public abstract class Employee {

	private int empId;
	private List<PayCheck> paycheck = new ArrayList<PayCheck>();

	public PayCheck calcCompensation(int month, int year) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(GregorianCalendar.YEAR, year);
		cal.set(GregorianCalendar.MONTH, month);
		DateRange dr = new DateRange(DateRange.getStartDate(cal),
				DateRange.getEndDate(cal));

		double grossAmt = calcGrossPay(dr);

		double fica = grossAmt * 0.23;
		double state = grossAmt * 0.05;
		double local = grossAmt * 0.01;
		double medicare = grossAmt * 0.03;
		double socialSecurity = grossAmt * 0.075;
		PayCheck pc = new PayCheck(grossAmt, fica, state, local, medicare,
				socialSecurity, dr, this);
	
		paycheck.add(pc);
		return pc;
	}

	public void print() {

	}

	public abstract double calcGrossPay(DateRange daterang);

}

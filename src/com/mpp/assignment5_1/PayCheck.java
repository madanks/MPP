package com.mpp.assignment5_1;

public class PayCheck {

	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private DateRange payPeriod;

	private Employee employee;

	public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity,
			DateRange payPeriod, Employee employee) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriod = payPeriod;
		this.employee = employee;
	}

	public String print() {
		return "PayCheck [grossPay=" + grossPay + ", fica=" + fica + ", state=" + state + ", local=" + local
				+ ", medicare=" + medicare + ", socialSecurity=" + socialSecurity + ", payPeriod=" + payPeriod + "]";
	}

	public double getNetPay() {
		return grossPay - fica - state - local - medicare - socialSecurity;
	}

}

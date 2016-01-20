package com.mpp.assignment5_1;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Commissioned extends Employee {

	private double baseSalary;
	private double commission;
	private List<Order> order = new ArrayList<Order>();

	public Commissioned(int empid,double baseSalary) {
		super(empid);
		this.baseSalary = baseSalary;
	}

	@Override
	public double calcGrossPay(DateRange daterang) {
		return baseSalary + getCommission(daterang);

	}

	public void add(Order o) {
		order.add(o);
	}

	public double getCommission(DateRange daterang) {
		double sum = 0;
		for (Order o : order) {
			if (daterang.isInRange(o.getOrderDate())) {
				sum += o.getOrderAmount();
			}
		}
		return 0.07 * sum;
	}

}

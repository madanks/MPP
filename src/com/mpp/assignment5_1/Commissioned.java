package com.mpp.assignment5_1;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {

	private double baseSalary;
	private double commission;
	private List<Order> order = new ArrayList<Order>();

	@Override
	public double calcGrossPay(DateRange dr) {
		return baseSalary + getCommission();

	}

	public void add(Order o) {
		order.add(o);
	}

	public double getCommission() {
		double sum = 0;
		for (Order o : order) {
			sum += o.getOrderAmount();
		}
		return 0.07 * sum;
	}

}

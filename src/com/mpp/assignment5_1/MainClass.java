package com.mpp.assignment5_1;

import java.util.GregorianCalendar;

public class MainClass {
	public static void main(String[] args) {

		Employee e1 = new Hourly(1,10, 50);
		Employee e2 = new Salaried(2,2000);

		Commissioned e3 = new Commissioned(3,800);
		Order o = new Order(e3, 5, new GregorianCalendar(2016, 3, 10), 15000);
		Order o1 = new Order(e3, 5, new GregorianCalendar(2016, 1, 10), 6000);
		e3.add(o);
		e3.add(o1);
		DateRange dr = new DateRange(new GregorianCalendar(2016, 3, 1), new GregorianCalendar(2016, 3, 30));
		System.out.printf("Gross Amount: $%,.2f\n", e1.calcGrossPay(dr));
		e1.calcCompensation(3, 2016).getNetPay();
		System.out.println("-------------------------------------------------");
		System.out.printf("Gross Amount: $%,.2f\n", e2.calcGrossPay(dr));
		e2.calcCompensation(3, 2016).getNetPay();
		System.out.println("-------------------------------------------------");
		System.out.printf("Gross Amount: $%,.2f\n", e3.calcGrossPay(dr));
		e3.calcCompensation(3, 2016).getNetPay();
	}

}

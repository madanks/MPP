package com.mpp.assignment3_1;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Company cg = new Company("Chaudhry Group");
		Department noodle = new Department("Noodles", "Jhapa");
		Department juice = new Department("Juice", "Biratnagar");

		cg.addDept(noodle);
		cg.addDept(juice);

		Position marketing = new Position("Marketing", "Marketing the Product");
		Position it = new Position("IT", "Looks IT department");

		noodle.addPosition(it);
		juice.addPosition(marketing);

		Employee hari = new Employee("1", "Hari", "", "Siwakoti", new Date(), "1111111111", 12000.0);
		Employee sabina = new Employee("2", "Sabina", "", "Siwakoti", new Date(), "111111113", 15000.0);
		Employee manoj = new Employee("3", "Manoj", "", "Siwakoti", new Date(), "1111111111", 19000.0);
		Employee niru = new Employee("4", "Niru", "", "Siwakoti", new Date(), "1111111111", 11000.0);

		it.addEmp(sabina);
		it.addEmp(manoj);

		marketing.addEmp(hari);
		marketing.addEmp(niru);

		cg.print();
	}
}

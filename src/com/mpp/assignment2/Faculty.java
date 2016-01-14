package com.mpp.assignment2;

import java.util.ArrayList;

public final class Faculty extends Person {
	private double salary;

	private ArrayList course;

	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
		course = new ArrayList();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getTotalUnits() {
		int unit = 0;
		for (Object c : course) {
			if (c instanceof Course) {
				unit += ((Course) c).getUnits();
			}
		}
		return unit;

	}

	public void addCourse(Course c) {

		course.add(c);
	}

}

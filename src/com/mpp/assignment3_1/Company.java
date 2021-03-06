package com.mpp.assignment3_1;

import java.util.ArrayList;

public class Company {
	private String name;
	ArrayList<Department> dept;

	public Company(String name) {
		this.name = name;
		dept = new ArrayList<Department>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addDept(Department d) {
		d.setcomp(this);
		dept.add(d);
	}

	public void print() {
		System.out.println("Company Name: " + getName());
		for (Department dep : dept) {
			dep.print();
		}
		
	}
}
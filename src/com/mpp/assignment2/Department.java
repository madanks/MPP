package com.mpp.assignment2;

import java.util.ArrayList;

public class Department {

	private String name;

	private ArrayList person = new ArrayList();

	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalSalary() {
		double total = 0;
		for (Object p : person) {
			if (p instanceof Faculty) {
				total += ((Faculty) p).getSalary();
			} else if (p instanceof Staff) {
				total += ((Staff) p).getSalary();
			}
		}
		return total;
	}

	public void showAllMembers() {
		for (Object p : person) {
			if (p instanceof Faculty) {
				System.out.printf("\nName : %s  Phone : %s Age : %d Type : Faculty", ((Faculty) p).getName(),
						((Faculty) p).getPhone(), ((Faculty) p).getAge(), ((Faculty) p));
			} else if (p instanceof Staff) {
				System.out.printf("\nName : %s  Phone : %s Age : %d Type : Faculty", ((Staff) p).getName(),
						((Staff) p).getPhone(), ((Staff) p).getAge());

			} else {
				System.out.printf("\nName : %s  Phone : %s Age : %d Type : Faculty", ((Student) p).getName(),
						((Student) p).getPhone(), ((Student) p).getAge());

			}
		}

	}

	public void unitsPerFaculty() {
		for (Object p : person) {
			if (p instanceof Faculty) {
				System.out.printf("\nName : %s  Phone : %s Age : %d Units : %d\n", ((Faculty) p).getName(),
						((Faculty) p).getPhone(), ((Faculty) p).getAge(), ((Faculty) p).getTotalUnits());

			}
		}

	}

	public void addPerson(Person p) {
		person.add(p);
	}

	public void facultyStudent() {
		for (Object p : person) {
			if (p instanceof Faculty) {
				// System.out.println("Faculty Member:" + ((Faculty)
				// p).getName());
				System.out
						.println("-------------------Faculty Member:" + ((Faculty) p).getName() + "------------------");
				for (Object pp : person) {
					if (pp instanceof Student) {
						if (((Student) pp).isFaculty((Faculty) p)) {
							System.out.println(((Student) pp).getName());
						}
					} else if (pp instanceof StaffStudent) {
						if (((StaffStudent) pp).isFaculty((Faculty) p)) {
							System.out.println(((StaffStudent) pp).getName());
						}
					}

				}

			}
		}

	}
}

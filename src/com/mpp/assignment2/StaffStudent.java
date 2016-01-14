package com.mpp.assignment2;

import java.util.Date;

public class StaffStudent extends Staff {
	private Date startDate;

	private Student s;

	public StaffStudent(String name, String phone, int age, double salary, double GPA, Date startDate) {
		super(name, phone, age, salary);
		s = new Student(name, phone, age, GPA);
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void addCourse(Course c) {
		s.addCourse(c);
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public boolean isFaculty(Faculty f) {
		for (Course c : s.getCourses()) {

			if (f.getName().equals(c.getFaculty().getName())) {
				return true;
			}
		}

		return false;
	}

}

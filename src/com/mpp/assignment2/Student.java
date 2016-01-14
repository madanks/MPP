package com.mpp.assignment2;

import java.util.ArrayList;

public class Student extends Person {

	private double gpa;

	private ArrayList<Course> courses= new ArrayList<>();

	public Student(String name, String phone, int age, double gpa) {
		super(name, phone, age);
		this.gpa = gpa;

	}

	public int getTotalUnits() {
		int unit = 0;
		for (Object c : courses) {
			if (c instanceof Course) {
				unit += ((Course) c).getUnits();
			}
		}
		return unit;

	}

	public void addCourse(Course c) {
		courses.add(c);
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public boolean isFaculty(Faculty f) {
		for (Course c : courses) {

			if (f.getName().equals(c.getFaculty().getName())) {
				return true;
			}
		}

		return false;
	}

}

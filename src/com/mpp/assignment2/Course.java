package com.mpp.assignment2;

public class Course {

	private String number;

	private String title;

	private int units;

	private Faculty faculty;
	
	

	public Course(String number, String title, int units, Faculty faculty) {
		
		this.number = number;
		this.title = title;
		this.units = units;
		this.faculty = faculty;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

}

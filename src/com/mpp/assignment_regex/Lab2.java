package com.mpp.assignment_regex;

import java.util.Scanner;

public class Lab2 {

	final static String REGEX = "[A-Z]{2}[0-9]{4}[A-Z]{3}";

	public static void main(String[] args) {
		System.out.println("Enter your License Plate Number: ");
		Scanner s = new Scanner(System.in);
		CheckLicensePlate(s.next());

	}

	public static void CheckLicensePlate(String s) {
		if (s.matches(REGEX)) {
			System.out.println(s + " License Plate is Valid");
		} else {
			System.out.println(s + " License Plate is Invalid");
		}
	}

}

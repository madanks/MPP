package com.mpp.assignment_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab2_Lab3_Pattern_Matcher {
	public static void main(String[] args) {
		System.out.println("Enter your License Plate Number: ");
		Scanner s = new Scanner(System.in);
		lab_2(s.nextLine());

		System.out.println("Enter your string: ");
		lab_3(s.nextLine());
	}

	public static void lab_2(String str) {
		Pattern pat = Pattern.compile("[A-Z]{2}[0-9]{4}[A-Z]{3}");
		Matcher match = pat.matcher(str);

		if (match.matches()) {
			System.out.println(str + " License Plate is Valid");
		} else {
			System.out.println(str + " License Plate is Invalid");
		}
	}

	public static void lab_3(String str) {

		Pattern pat = Pattern.compile("[8]");
		Matcher match = pat.matcher(str);
		String s = "";
		while (match.find()) {
			s = match.replaceAll("Eight");
		}
		System.out.println(s);
	}
}

package com.mpp.assignment_regex;

import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		System.out.println("Enter the string you want :");
		Scanner s = new Scanner(System.in);
		ReplaceEight(s.nextLine());
	}

	public static void ReplaceEight(String num) {
		String s = num.replaceAll("[8]", "Eight");

		String s1 = num.replaceAll("\\b8\\b", "Eight");
		System.out.println(s);
		System.out.println(s1);
	}

}

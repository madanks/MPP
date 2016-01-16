package com.mpp.assignment3_4;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Enter the number of package you want to send");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("Enter the Weight of the product:");
			double weight = s.nextDouble();
			System.out.println("Enter the description of the product:");
			String desc = s.next();
			System.out.println("Enter the zone to send product:");
			String zone = s.next();
			Package pups = new UPS(desc, weight, zone, "UPS");
			Package pusmail = new USMail(desc, weight, zone, "US Mail");
			Package pfedex = new FedEx(desc, weight, zone, "FedEx");

			System.out
					.println(pups.rate() < pusmail.rate() ? (pups.rate() < pfedex
							.rate() ? pups.rate() : pfedex.rate()) : (pusmail
							.rate() < pfedex.rate() ? pusmail.rate() : pfedex
							.rate()));
			
			System.out.println(pups.rate());
			System.out.println(pusmail.rate());
			System.out.println(pfedex.rate());
		}

	}

}

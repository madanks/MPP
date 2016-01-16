package com.mpp.assignment3_4;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Enter the number of package you want to send");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		ArrayList<Package> pack = new ArrayList<Package>();

		for (int i = 0; i < num; i++) {
			ArrayList<Package> pack1 = new ArrayList<Package>();
			System.out.println("----------------------------------------");
			System.out.println("Enter the Weight of the product:"+(i+1));
			double weight = s.nextDouble();
			System.out.println("Enter the description of the product:"+(i+1));
			String desc = s.next();
			System.out.println("Enter the zone to send product:"+(i+1));
			String zone = s.next();
			Package pups = new UPS(desc, weight, zone, "UPS");
			Package pusmail = new USMail(desc, weight, zone, "US Mail");
			Package pfedex = new FedEx(desc, weight, zone, "FedEx");
			Package pdhl= new DHL(desc, weight, zone, "DHL");
			pack1.add(pups);
			pack1.add(pusmail);
			pack1.add(pfedex);
			pack1.add(pdhl);
			Package mincost = pack1.get(0);
			for (int j = 1; j < pack1.size(); j++) {
				if (pack1.get(j).rate() < mincost.rate()) {
					mincost = pack1.get(j);
				}
			}
			pack.add(mincost);

		}

		for (Package p : pack) {
			System.out.printf(" %s   $%.2f   %s\n",p.getDesc(),p.rate(),p.getQurName());
		}

	}

}

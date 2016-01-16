package com.mpp.assignment3_4;

public class UPS extends Package {

	public UPS(String desc, double weight, String zone,String q) {
		super(desc, weight, zone,q);
	}

	public double rate() {
		return 0.45 * getWeight();
	}

}

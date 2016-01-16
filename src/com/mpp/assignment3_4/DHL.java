package com.mpp.assignment3_4;

public class DHL extends Package {

	public DHL(String desc, double weight, String zone, String qurName) {
		super(desc, weight, zone, qurName);
	}

	@Override
	public double rate() {

		return 0.40*getWeight();
	}

}

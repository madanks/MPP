package com.mpp.assignment3;

public class USMail extends Package {

	public USMail(String desc, double weight, String zone,String q) {
		super(desc, weight, zone,q);
	}
	@Override
	public double rate() {

		return getWeight() > 3 ? getWeight() * 0.55 : 1;
	}

}

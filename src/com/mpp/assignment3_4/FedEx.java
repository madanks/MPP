package com.mpp.assignment3_4;

public class FedEx extends Package {

	public FedEx(String desc, double weight, String zone, String q) {
		super(desc, weight, zone, q);
	}

	@Override
	public double rate() {
		if (getZone().equalsIgnoreCase("IA")
				|| getZone().equalsIgnoreCase("MT")
				|| getZone().equalsIgnoreCase("OR")
				|| getZone().equalsIgnoreCase("CA")) {
			return 0.35 * getWeight();

		} else if (getZone().equalsIgnoreCase("TX")
				|| getZone().equalsIgnoreCase("UT")) {
			return 0.30 * getWeight();
		} else if (getZone().equalsIgnoreCase("FL")
				|| getZone().equalsIgnoreCase("MA")
				|| getZone().equalsIgnoreCase("OH")) {
			return 0.55 * getWeight();
		} else {
			return 0.43 * getWeight();
		}
	}
}

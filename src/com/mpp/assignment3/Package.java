package com.mpp.assignment3;

public abstract class Package {

	private String desc;
	private double weight;
	private String zone;
	private String qurName;

	public Package(String desc, double weight, String zone, String qurName) {
		this.desc = desc;
		this.weight = weight;
		this.zone = zone;
		this.qurName = qurName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getQurName() {
		return qurName;
	}

	public void setQurName(String qurName) {
		this.qurName = qurName;
	}

	public abstract double rate();

}

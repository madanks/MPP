package com.mpp.assignment5_1;

import java.util.GregorianCalendar;

public class Order {

	private Commissioned com;
	private int orderNum;
	private GregorianCalendar orderDate;
	private double orderAmount;

	public Order(Commissioned com, int orderNum, GregorianCalendar orderDate, double orderAmount) {
		
		this.com = com;
		this.orderNum = orderNum;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public Commissioned getCom() {
		return com;
	}

	public void setCom(Commissioned com) {
		this.com = com;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public GregorianCalendar getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(GregorianCalendar orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

}

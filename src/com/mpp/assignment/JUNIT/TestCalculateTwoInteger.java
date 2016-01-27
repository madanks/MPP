package com.mpp.assignment.JUNIT;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCalculateTwoInteger extends TestCase {

	public static void main(String[] args) {
	}

	public TestCalculateTwoInteger(String arg0) {
		super(arg0);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testSum() {

		CalculateTwoInteger c1 = new CalculateTwoInteger();
		int result = c1.sum(10, 50);
		assertEquals(60, result);
	}

	@Test
	public void testProduct() {

		CalculateTwoInteger c1 = new CalculateTwoInteger();
		int result = c1.product(10, 3);
		assertEquals(30, result);
	}

}

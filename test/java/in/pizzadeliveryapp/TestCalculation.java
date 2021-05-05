package in.pizzadeliveryapp;

import org.junit.Test;

public class TestCalculation {

	@Test
	public void test() {
		double amount = 150;
		int quantity = 1;
		double gst = 0.07;
		Calculation.calculate1(quantity, amount, gst);

	}

	@Test
	public void test2() {
		double amount = 200;
		int quantity = 1;
		double gst = 0.07;
		Calculation.calculate2(quantity, amount, gst);

	}

	@Test
	public void test3() {
		double amount = 250;
		int quantity = 1;
		double gst = 0.07;
		Calculation.calculate3(quantity, amount, gst);

	}
}

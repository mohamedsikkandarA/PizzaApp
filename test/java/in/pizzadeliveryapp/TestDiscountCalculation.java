package in.pizzadeliveryapp;

import java.time.LocalTime;

import org.junit.Test;

public class TestDiscountCalculation {

	@Test
	public void testdiscount1() {
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		int minute = time.getMinute();
		double amount = 160.5;
		int kilometer = 10;
		DiscountCalculation.Time(hour, minute, amount, kilometer, time);
	}

	@Test
	public void testdiscount2() {
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		int minute = time.getMinute();
		double amount = 214.0;
		int kilometer = 15;
		DiscountCalculation.Time(hour, minute, amount, kilometer, time);
	}

	@Test
	public void testdiscount3() {
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		int minute = time.getMinute();
		double amount = 267.5;
		int kilometer = 20;
		DiscountCalculation.Time(hour, minute, amount, kilometer, time);
	}
}

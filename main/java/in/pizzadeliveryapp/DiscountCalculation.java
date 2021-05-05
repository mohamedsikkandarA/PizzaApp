package in.pizzadeliveryapp;

import java.time.LocalTime;

public class DiscountCalculation {
	public static void Time(int hour, int minute, double amount, int kilometer, LocalTime time) {
		if (hour >= 15 && hour <= 17) {
			System.out.println("IT'S 50% DISCOUNT TIME" + "\n");
			amount = amount / 2;
			System.out.println("50% LESS AMOUNT:" + amount + "\n");
		} else {
			System.out.println("TOTAL AMOUNT:" + amount + "\n");

		}

		if (kilometer >= 5 && kilometer <= 15) {
			amount = amount + 50;
			System.out.println("GST AMOUNT + DELIVERY CHARGES AMOUNT" + "\n" + amount + "\n");
		} else if (kilometer >= 16 && kilometer <= 25) {
			amount = amount + 100;
			System.out.println("GST AMOUNT + DELIVERY CHARGES AMOUNT" + "\n" + amount + "\n");
		}

		System.out.println("ORDER TIME:" + time + "\n");
		time = time.plusMinutes(30);

		System.out.println("YOU GET A DELIVERY IN ON TIME:" + "\n" + time + "\n");

	}
}

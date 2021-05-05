package in.pizzadeliveryapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddpizzaTypes {

	@Test
	public void TestAddpizzaTypes1() {
		String pizzaName = "VEG PIZZA";
		boolean isValid = PizzaTypes.addPizzaTypes(pizzaName);
		assertTrue(isValid);
		PizzaTypes.displayPizzaTypes();
	}

	@Test
	public void TestAddpizzaTypes2() {
		String pizzaName = "CHICKEN PIZZA";
		boolean isValid = PizzaTypes.addPizzaTypes(pizzaName);
		assertTrue(isValid);
		PizzaTypes.displayPizzaTypes();
	}
	
	@Test
	public void TestAddpizzaTypes3() {
		String pizzaName = "PANNER PIZZA";
		boolean isValid = PizzaTypes.addPizzaTypes(pizzaName);
		assertTrue(isValid);
		PizzaTypes.displayPizzaTypes();
	}

}

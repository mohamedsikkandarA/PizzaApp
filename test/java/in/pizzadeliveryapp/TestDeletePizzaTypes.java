package in.pizzadeliveryapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDeletePizzaTypes {
		@Test
		public void TestDeletePizzaTypes1(){
			String pizzaName = "VEG PIZZA";
			PizzaTypes.addPizzaTypes(pizzaName);
			String pizzaName1 = "CHICKEN PIZZA";
			PizzaTypes.addPizzaTypes(pizzaName1);
			PizzaTypes.displayPizzaTypes();
			boolean  isDeleted =PizzaTypes.deletePizzaTypes("VEG PIZZA");
			PizzaTypes.displayPizzaTypes();
			assertTrue(isDeleted);
		}
		
	}



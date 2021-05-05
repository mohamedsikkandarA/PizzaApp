package in.pizzadeliveryapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUpdatePizzaTypes {

	@Test
	public void TestUpdatePizzaTypes1() {
		String oldname = "CHICKEN PIZZA";
		String newname = "PANNER PIZZA";
		PizzaTypes.addPizzaTypes(oldname);  
		PizzaTypes.displayPizzaTypes();						
		boolean isUpdated = PizzaTypes.updatePizzaTypes(oldname, newname);  	
		PizzaTypes.displayPizzaTypes();						
		assertTrue(isUpdated);
		
	}

}

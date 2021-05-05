package in.pizzadeliveryapp;

import java.util.ArrayList;

public class PizzaTypes {

	static ArrayList<String> pizzaTypes = new ArrayList<String>();

	public static boolean addPizzaTypes(String pizzaName) {
		pizzaTypes.add(pizzaName);
		return true;
	}

	public static boolean deletePizzaTypes(String pizzaName) {
		int index = pizzaTypes.indexOf(pizzaName);
		pizzaTypes.remove(index);
		return true;
	}

	public static boolean updatePizzaTypes(String pizzaName, String newname) {
		int index = pizzaTypes.indexOf(pizzaName);
		pizzaTypes.set(index, newname);
		return true;
	}

	public static void displayPizzaTypes() {
		System.out.println("*************LIST OF PIZZA TYPES**************");
		for (int i = 0; i < pizzaTypes.size(); i++) {
			System.out.println(pizzaTypes.get(i));
		}
	}

}


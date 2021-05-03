package foodapplication;

import java.util.ArrayList;
import java.util.HashMap;

public class PizzaTypes {

	static ArrayList<String> pizzaTypes = new ArrayList<String>();

	public static void food() {

		/**
		 * 
		 *Pizza Types 
		 * 
		 **/ 
		System.out.println("PIZZA TYPES");
		System.out.println("-----------");
		
		/**
		 * Pizza Types Is Stored In ArrayList 
		 */

		pizzaTypes.add("VEG.PIZZA(Rs.150 PER.QTY)");
		pizzaTypes.add("MASROOM.PIZZA(Rs.200 PER.QTY)");
		pizzaTypes.add("PANNER.PIZZA(Rs.250 PER.QTY)");
		
		/**
		 * Print A Pizza Types IN One By One
		 */

		for (String type : pizzaTypes) {
			System.out.println(type);
		}

		
		/**
		 * Search Option Is check A One Type Of Pizza Is Available Or Not
		 * And This Is Boolean Check Process
		 * Then Return a True Or False      
		 */
		boolean exists = false;
		String searchpizzaTypes = "masroom.pizza(Rs.200 PER.QTY)";
		for (String type : pizzaTypes) {
			if (type.equalsIgnoreCase(searchpizzaTypes)) {
				exists = true;
				break;

			}

		}

		System.out.println(searchpizzaTypes + " EXISTS ? " + exists + "\n");
	}

	
	/**
	 * This is Modify A Pizza Types
	 * Add
	 * Delete
	 * Update
	 * All Thinks Are Do This Part  
	 */
	
	
	//ADDED
	public static void ModifypizzaTypes() {
		System.out.println("PIZZA TYPE ONE ADDED SUCESSFULLY");
		System.out.println("--------------------------------" + "\n");
		pizzaTypes.add("CHICKEN.PIZZA(Rs.300 PER.QTY)" + "\n");
		for (String type : pizzaTypes) {
			System.out.println(type);
		}
		
	//DELETED
		System.out.println("PIZZA TYPE ONE DELETED SUCCESSFULLY");
		System.out.println("-----------------------------------" + "\n");
		pizzaTypes.remove(3);
		for (String type : pizzaTypes) {
			System.out.println(type);
		}
		
	//UPDATED
		System.out.println("PIZZA TYPE ONE UPDATED SUCCESSFULLY");
		System.out.println("-----------------------------------" + "\n");
		pizzaTypes.set(pizzaTypes.indexOf("PANNER.PIZZA(Rs.250 PER.QTY)"), "CHICKEN.PIZZA(Rs.250 PER.QTY)");
		for (String type : pizzaTypes) {
			System.out.println(type);

		}
	}
}

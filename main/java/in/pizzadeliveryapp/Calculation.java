package in.pizzadeliveryapp;

public class Calculation {

	public static void calculate1(int quantity, double amount, double gst ) {

		double totalamount = quantity * amount;
		double gstamount = (totalamount * gst) + totalamount;
		System.out.println("*************List Of Total Amount**************");
		System.out.println("PizzaType:veg pizza");
		System.out.println("Quantity:" + quantity);
		System.out.println("TotalAmount:" + totalamount);
		System.out.println("TotalAmount + GST amount:" + gstamount);
		
	}

	public static void calculate2(int quantity, double amount, double gst) {

		double totalamount = quantity * amount;
		double gstamount = (totalamount * gst) + totalamount;
		System.out.println("*************List Of Total Amount**************");
		System.out.println("PizzaType:chicken pizza");
		System.out.println("Quantity:" + quantity);
		System.out.println("TotalAmount:" + totalamount);
		System.out.println("TotalAmount + GST amount:" + gstamount);
		
	}

	public static void calculate3(int quantity, double amount, double gst) {

		double totalamount = quantity * amount;
		double gstamount = (totalamount * gst) + totalamount;
		System.out.println("*************List Of Total Amount**************");
		System.out.println("PizzaType:Panner pizza");
		System.out.println("Quantity:" + quantity);
		System.out.println("TotalAmount:" + totalamount);
		System.out.println("TotalAmount + GST amount:" + gstamount);
		

	}
}

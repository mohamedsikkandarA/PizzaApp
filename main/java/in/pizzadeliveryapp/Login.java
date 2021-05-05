package in.pizzadeliveryapp;

import java.util.ArrayList;

public class Login {
	static ArrayList<User> userList = new ArrayList<User>();
	static {
		User user1 = new User();
		user1.name = "mohamed";
		user1.email = "mohamed@gmail.com";
		user1.password = "96986";

		User user2 = new User();
		user2.name = "sikkandar";
		user2.email = "sikkandar@gmail.com";
		user2.password = "12143";

		userList.add(user1);
		userList.add(user2);

	}

	public static void display() {

		for (User user : userList) {
			System.out.println(user.name + "-" + user.email + "-" + user.password);
		}
	}

	public static boolean login(String email, String password) {
		boolean exists = false;
		for (User user : userList) {
			if (user.email.equalsIgnoreCase(email) && user.password.equals(password)) {
				exists = true;
				break;
			}
		}

		if (exists) {
			System.out.println("valid" + "\n" + email + "\n" + password);
		} else {
			System.out.println("invalid" + "\n" + email + "\n" + password);
		}
		return exists;
	}

}

package in.pizzadeliveryapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogin {
	
	@Test
	public void testdisplay() {
		Login.display();
	}

	@Test
	public void test() { // correct user name and password
		String email = "mohamed@gmail.com";
		String password = "96986";
		boolean actual = Login.login(email, password);
		assertTrue(actual);
	}

	@Test
	public void test1() { // wrong user and correct password
		String email = "fazil@gmail.com";
		String password = "12143";
		boolean actual = Login.login(email, password);
		assertFalse(actual);
	}

	@Test
	public void test2() { // wrong user and wrong password
		String email = "tamim@live.com";
		String password = "125678";
		boolean actual = Login.login(email, password);
		assertFalse(actual);
	}
	
	@Test
	public void test3() { // wrong user and wrong password
		String email = " mohamed@gmail.com";
		String password = "125678";
		boolean actual = Login.login(email, password);
		assertFalse(actual);
	}
	
	@Test
	public void test4() { // wrong user and wrong password
		String email = "mohamed@gmali.com";
		String password = "125678";
		boolean actual = Login.login(email, password);
		assertFalse(actual);
	}
	
	

}

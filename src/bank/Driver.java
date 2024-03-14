
package bank;

import java.util.Scanner;
   
/*
 * Custom Exception Class which will throw invalid age
 */
class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		super(msg);
	}
}


public class Driver {
	static Scanner sc = new Scanner(System.in);
	static {
		System.out.println("=============================================================================");
		System.out.println("|                                                                           |");
		System.out.println("|                         WELCOME TO JSPIDERS BANK                          |");
		System.out.println("|                                                                           |");
		System.out.println("=============================================================================");
	}
	
	public static void function() {
		System.out.println("Select your option: ");
		System.out.println("1 - Login to your bank account");
		System.out.println("2 - Create to new bank account");
		System.out.println("3 - Admin login");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			
		}
		case 2: {
			
		}
		case 3: {
			Manager m = new Manager();
			m.login(null, null);
		}
		}
	}
	
	public static void main(String[] args) {
		function(); 
		CreateAccount acc1 = new CreateAccount();
		acc1.start();
	}
}  
package bank;

import java.util.Scanner;

public class Customer {
	static Scanner sc = new Scanner(System.in);
	String username;
	String password;
	long accNumber; // unique account number
	String accType; // account type (CURRENT/SAVING)
	String accHoldersFirstName; // full name of account holder
	String accHoldersLastName; // full name of account holder
	long phone; // phone number of account holder
	String address; // current address of account holder
	String idProof; // any government id of account holder(Aadhaar card, voderID, etc)
	int age; // age of account holder ()
	String gender; // gender of account holder
	String dob; // date of birth of account holder ()
	String pan; // permanent account number
	double balance;
	
	
	String tempFirstName = "Vikas";
	String tempLastName = "Meena";
	String tempUsername = "vikas123";
	String tempPassword = "Vikas123@2";
	long tempBankAccountNumber = 986534462673L;
	double tempBalance = 2500;
	boolean loginStatus;
	
	public Customer() {
		
	}
	
	public Customer(String accType, String accHoldersFirstName, String accHoldersLastName, 
			long phone, String address, String idProof, int age, String gender, String dob, 
			String pan, String username, String password) {
		super();
		this.accType = accType;
		this.accHoldersFirstName = accHoldersFirstName;
		this.accHoldersLastName = accHoldersLastName;
		this.phone = phone;
		this.address = address;
		this.idProof = idProof;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.pan = pan;
	}

	
	public void login() {
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("|                  BANK ACCOUNT LOGIN                 |");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		boolean shouldContinue = true;
		while (shouldContinue) {
			System.out.println();
			System.out.print("Enter your username: ");
			String uname = sc.next();
			System.out.print("Enter your password: ");
			String pwd = sc.next();
			if (tempUsername.equals(uname) && tempPassword.equals(pwd)) {
				loginStatus = true;
				shouldContinue = false;
				dashboard();
			}
			else {
				 System.out.println("Your username or password is wrong.");
				 System.out.println("================================================================================");
			}
		}	 
	}
	
	public void dashboard() {
			System.out.println();
			System.out.println("================================================================================");
			System.out.println("| " + "Welcome " + tempFirstName + " " + tempLastName + " |");
			System.out.println("Select your option: ");
			System.out.println("1: Fund Transfer");
			System.out.println("2: Bill payment");
			System.out.println("3: Fixed deposit");
			System.out.println("4: UPI");
			System.out.println("5: View Statement");
			System.out.println("6: View current balance");
			System.out.println("7: Return on main menu");
			System.out.println("8: Exit the application");
			int choice = sc.nextInt();
			Opertions op = new Opertions();
			System.out.println();
			switch (choice) {
			case 1: {
				op.fundTransfer();
			}
			case 2: {
				System.out.println("Coming Soon...");
				dashboard();
				break;
			}
			case 3: {
				System.out.println("Coming Soon...");
				dashboard();
				break;
			}
			case 4: {
				System.out.println("Coming Soon...");
				dashboard();
				break;
			}
			case 5: {
				System.out.println("================================================================================");
				System.out.println();
				System.out.println("Ashutosh Mishra (Debited) - ₹1000");
				System.out.println("AlbertRaj (Credited) - ₹1000");
				System.out.println("Self (Credited) - ₹2500");
				dashboard();
				break;
			}
			case 6: {
				System.out.println("Your current balance is: "+ this.tempBalance);
				dashboard();
				break;
			}
			case 7: {
				System.out.println("Your account has been logout.");
				System.out.println();
				CreateAccount newAcc = new CreateAccount();
				System.out.println("================================================================================");
				newAcc.start();
				break;
			}
			case 8: {
				System.out.println();
				System.out.println("----- Thank You -----");
				System.exit(0);
			}
			default: {
				
			}
			}
	}
}

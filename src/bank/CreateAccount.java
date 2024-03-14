package bank;

import java.util.InputMismatchException;
import java.util.Scanner;



/* 
 * Create a new bank account
 * Customer can create two types of account saving and current account.
 */
public class CreateAccount extends Customer {
	// This method will provide a functionality to create a new account in this bank
		// After successfully creating a account, it will any ask you to create an another account
		public void register() {
			try {
					System.out.println();
					System.out.println("================================================================================");
					System.out.println("Do you want to create a new bank account(press 1 to continue or press any key to exit)");
					int choice = sc.nextInt();
					System.out.println();
					switch(choice) { 
					case 1: {
						System.out.println();
						accType();
						accHoldersFirstName();
						accHoldersLastName();
						phone();
						address();
						idProof();
						age();
						gender();
						dob();
						pan();
						
						System.out.println("Your account has been created successfully.");
						System.out.println("Now you can create a username and password for net banking account");
						username();
						password();
						System.out.println("Your net banking account is created.");
						System.out.println();
						boolean continueChoice = true;
						while (continueChoice) {
							System.out.println("================================================================================");
							System.out.println("type 1: Return back");
							System.out.println("type 2: Exit from the application");
						try {
							int choice2 = sc.nextInt();
							
							switch (choice2) {
							case 1: {
								System.out.println();
								System.out.println("================================================================================");
								this.start();
								System.out.println("================================================================================");
								continueChoice = false;
								break;
							}
							case 2: {
								System.exit(0);
								System.out.println("================================================================================");
								continueChoice = false;
								break;
							}
							default : {
								System.out.println("Invalid input");
								System.out.println("================================================================================");
							}
							}
						} catch (Exception e) {
							System.out.println("Please enter input in numbers");
							System.out.println();
							sc.nextLine();
						}
						
						
					}
						}	
					}		
			}
			catch (Exception e) {
				System.out.println("Please provide a valid input");
				System.out.println();
				sc.nextLine();
			}
		}
		
		
		// This method is use to select account type that user want
		public String accType() {
			System.out.println("Select your account type: ");
			System.out.println("Choose 1 - Saving");
			System.out.println("Choose 2 - Current"); 
			try {
				int accTypeChoice = sc.nextInt();
				switch (accTypeChoice) {
				case 1: {
					return "saving";
				}
				case 2: {
					return "current";
				}
				default: {
					System.out.println("Wrong choice! Try Again");
					accType();
				}
				}
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! Try Again");
				sc.nextLine();
				accType();
			}
			return "";
		}
		
		// This method is use to take first name of an account holder
		public void accHoldersFirstName() {
			System.out.print("Enter first name: ");
			sc.nextLine();
			this.accHoldersFirstName = sc.next().toLowerCase();
		}
		
		// This method is use to take first name of an account holder
		public void accHoldersLastName() {
			System.out.print("Enter last name: ");
			sc.nextLine();
			this.accHoldersLastName = sc.next().toLowerCase();
		}
		
		// Updated methods for name
		public String firstName() {
			System.out.println("Enter your first name ");
			String firstName = sc.nextLine();
			for (int i = 0; i < firstName.length(); i++) {
				if (firstName.charAt(i) > 25 && firstName.charAt(i) < 91 || firstName.charAt(i) > 96 && firstName.charAt(i) < 123) {
					
				} else {
					System.out.println("Try again! Enter your name");
					return firstName();
				}
			}
			return firstName;
		}
		
		// Updated methods for phone number
		public long phoneNumber() {
			System.out.println("Enter your phone number ");
			try {
				long phoneNumber = sc.nextLong();
				if (phoneNumber > 999999999 && phoneNumber < 9999999999L) {
					return phoneNumber;
				} else {
					System.out.println("Try again! Enter 10 digit phone number");
					return phoneNumber();
				}
			} catch (InputMismatchException ie) {
				System.out.println("Invalid phone number! Try again and enter 10 digit phone number");
				return phoneNumber();
			}	
		}
		
		
		 
		
		// This method is use to take phone number of an account holder.
		public void phone() {
			boolean shouldContinue = true;
			do {
				System.out.println("================================================================================");
				System.out.print("enter your phone number: +91");
				int count = 0;
				try {
					this.phone = sc.nextLong();
					long tempPhone = this.phone;
					
					// count the number of digit in phone number
					while (tempPhone != 0) {
						tempPhone  /= 10;
					    ++count;
					}
					
					// it will check the number of digit should be equal to 10 digit
					if (count < 10 || count > 10) {
						System.out.println("Please enter your valid phone number.");
					}
					else {
						shouldContinue = false;
					}
				} catch (InputMismatchException e) {
					System.out.println("Please give valid input");
					System.out.println();
					sc.nextLine();
				}
			} while (shouldContinue);
		}
		
		
		// This method is use to take address of an account holder.
		public void address() {
			boolean shouldContinue = true;
			do {
				System.out.println("================================================================================");
				System.out.print("enter your address: ");
				try {
					sc.nextLine();
					this.address=sc.nextLine();
					shouldContinue = false;
				} catch (InputMismatchException e) {
					System.out.println("Please give valid input");
					System.out.println();
					sc.nextLine();
				}
			} while (shouldContinue);
		}
			
		// This method is use to 
		public void idProof() {
			boolean shouldContinue = true;
			do {
				System.out.println("================================================================================");
				System.out.println("select your ID: ");
				System.out.println("type 1: Passport");
				System.out.println("type 2: Voter ID Card"); 
				System.out.println("type 3: PAN Card"); 
				System.out.println("type 4: Driving License"); 
				System.out.println("type 5: Voter ID Card"); 
				System.out.println("type 6: Other ID"); 
				int idProofChoice = 0;
				try {
					idProofChoice = sc.nextInt();
					switch (idProofChoice) {
					case 1: {
						this.idProof = "Passport";
						shouldContinue = false;
						break;
					}
					case 2: {
						this.idProof = "Voter ID Card";
						shouldContinue = false;
						break;
					}
					case 3: {
						this.idProof = "PAN Card";
						shouldContinue = false;
						break;
					}
					case 4: {
						this.idProof = "Driving License";
						shouldContinue = false;
						break;
					}
					case 5: {
						this.idProof = "Voter ID Card";
						shouldContinue = false;
						break;
					}
					case 6: {
						this.idProof = "Other ID";
						System.out.println("Mention your ID");
						shouldContinue = false;
						break;
					}
					default: {
						System.out.println("Please give valid input");
						System.out.println();
					}
				}
				} catch (InputMismatchException e) {
					System.out.println("Please give valid input");
					System.out.println();
					sc.nextLine();
				}
				finally {
					System.out.println("Please note: Original document should be produced for verification.");
				}
			} while (shouldContinue);
		}
		
		// This method will take users age
		public void age() {
			boolean shouldContinue = true;
			do {
				System.out.println("================================================================================");
				System.out.print("enter your age: ");
				try {
					this.age = sc.nextInt();
					if (age < 18) {
						System.out.println("Your age is not valid to create a bank account");
					} else if (age > 100) {
						System.out.println("Please give your valid age");
					} else {
						shouldContinue = false;
					}
				} catch (InputMismatchException e) {
					System.out.println("Please give valid input");
					System.out.println();
					sc.nextLine();
				}
			} while (shouldContinue);
		}
		
		// This method will take users gender
		public void gender() {
			boolean shouldContinue = true;
			do {
				System.out.println("================================================================================");
				System.out.println("select your gender: ");
				System.out.println("type 1: Male");
				System.out.println("type 2: Female"); 
				System.out.println("type 3: Others"); 
				int genderChoice = 0;
				try {
					genderChoice = sc.nextInt();
					switch (genderChoice) {
					case 1: {
						this.gender = "Male";
						shouldContinue = false;
						break;
					}
					case 2: {
						this.gender = "Female";
						shouldContinue = false;
						break;
					}
					case 3: {
						this.gender = "Others";
						shouldContinue = false;
						break;
					}
					default: {
						System.out.println("Please give valid input");
						System.out.println();
					}
				}
				} catch (InputMismatchException e) {
					System.out.println("Please give valid input");
					System.out.println();
					sc.nextLine();
				}
			} while (shouldContinue);
		}
		
		// This method will take users gender
		public void dob() {
			boolean shouldContinue = true;
			do {
				System.out.println("================================================================================");
				System.out.print("enter your date of birth(dd:mm:yyyy): ");
				try {
					this.dob = sc.next();
					shouldContinue = false;
				} catch (InputMismatchException e) {
					System.out.println("Please give valid input");
					System.out.println();
					sc.nextLine();
				}
			} while (shouldContinue);
		}
		
		// This method will take users gender
		public void pan() {
			boolean shouldContinue = true;
			do {
				System.out.println("================================================================================");
				System.out.print("enter your pan card number: ");
				try {
					sc.nextLine();
					this.pan = sc.nextLine().trim();
					if (this.pan.length() < 10 || this.pan.length() > 10) {
						System.out.println("Please enter valid pan card number. ");
					} else {
						shouldContinue = false;
					}
				} catch (InputMismatchException e) {
					System.out.println("Please give valid input");
					System.out.println();
					sc.nextLine();
				}
			} while (shouldContinue);
		}
		
		// method take a username from the user
		public void username() {
			boolean shouldContinue = true;
			do {
				System.out.println("================================================================================");
				System.out.print("enter provide a your username: ");
				try {
					this.username = sc.nextLine().trim();
					shouldContinue = false;
				} catch (Exception e) {
					System.out.println("Please give valid input");
					System.out.println();
					sc.nextLine();
				}
			} while (shouldContinue);
		}
		
		// method take a password from the user
			public void password() {
				boolean shouldContinue = true;
				do {
					System.out.print("enter provide a password: ");
					try {
						this.password = sc.nextLine().trim();
						shouldContinue = false;
					} catch (InputMismatchException e) {
						System.out.println("Please give valid input");
						System.out.println();
						sc.nextLine();
					}
				} while (shouldContinue);
			}
		
		
		
		
		
		public void start() {
			
		}
		
	}

	/*
	 * This class will handle all the fund transferred by the customer
	 */
	class Opertions extends Customer {
		static Scanner sc = new Scanner(System.in);
		String beneficiaryName;
		long accountNumber;
		boolean continueTransaction = true;
		public void fundTransfer() {
			double tempAmount = 0;
			try {
				do {
					try {
					System.out.println("================================================================================");
					System.out.print("Enter Beneficiary Name: ");
					this.beneficiaryName = sc.nextLine();
					
					// account number validation
					System.out.print("Enter 12 digit Account Number: ");
					try {
						this.accountNumber = sc.nextLong();
					} catch (Exception e) {
						System.out.println("Invalid account number! Try again");
						sc.nextLine();
					}
					
					// amount validation
					boolean confirmAmount = true;
					while (confirmAmount) {
						System.out.print("Enter your Amount: ");
					try {
					tempAmount = sc.nextInt();
						if (tempAmount > this.tempBalance) {
							System.out.println();
							System.out.println("Insufficient balance");
							System.out.println();
						}
						else {
							confirmAmount = false;
						}
					
					} catch (Exception e) {
						System.out.println("Invalid amount! Try again");
						sc.nextLine();
					}}
					
					
					boolean cancelTransaction = true;
					String transactionChoice = null;
					while (cancelTransaction) {
					System.out.println();
					System.out.println("Please confirm the details");
					System.out.println("Beneficiary Name : "+beneficiaryName);
					System.out.println("Account Number : "+accountNumber);
					System.out.println("Amount : "+ tempAmount);
					System.out.println("Type 'yes' to confirm the details or 'no' to cancel the transaction.");
					transactionChoice = sc.next().toLowerCase();
					if (transactionChoice.equals("yes")) {
						tempBalance = tempBalance - tempAmount;
						System.out.println("Your transaction is successful.");
						System.out.println();
						cancelTransaction = false;
					}
					else if (transactionChoice.equals("no")) {
						System.out.println("Transaction failed.");
						cancelTransaction = false;
					}
					else {
						System.out.println("Invalid input! Try Again.");
					}
					}
					System.out.println("================================================================================");
					System.out.println("Do you want to continue with another transaction?");
					System.out.println("1: To Continue");
					System.out.println("2: To return on dashboard");
					int takeTransferChoice = sc.nextInt();
					switch (takeTransferChoice) {
					case 1: {
						sc.nextLine();
						break;
					}
					case 2: {
						continueTransaction = false;
						dashboard();
						break;
					}
					default : {
						System.out.println("Invalid input! Try again.");
					}
					}
					} catch (Exception e) {
						System.out.println("Transaction failed! Try again.");
						System.out.println();
						sc.nextLine();
					}
				} while (continueTransaction);
			
			
			} catch (Exception e ) {
				System.out.println("Transaction failed! Try again.");
				System.out.println();
				sc.nextLine();
			}
		}
}

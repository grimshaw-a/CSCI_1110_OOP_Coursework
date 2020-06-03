//Date: 06.03.20
//Author: Adam Grimshaw
//Course: OOP
//Description: Functions like an ATM using accounts from the Account class.

import java.util.Scanner;

class ATM {
	public static void main(String[] args) {
		//Create accounts
		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100, 0.05);
		}
		
		//Initialize ATM screen
		requestID(accounts);
	}
	
	public static void requestID(Account[] array) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your account ID: ");
		int enteredID = input.nextInt();
		if(enteredID < 10) {
			createMenu(enteredID, array);
		} else {
			requestID(array);
		}
	}
	
	public static void createMenu(int accountID, Account[] array) {
		Scanner input = new Scanner(System.in);
		System.out.println("MAIN MENU");
		System.out.println("1) Check Balance");
		System.out.println("2) Withdraw");
		System.out.println("3) Deposit");
		System.out.println("4) Exit");
		System.out.print("Please make a selection: ");
		int selection = input.nextInt();
		
		switch (selection) {
			case 1: System.out.printf("The current balance is $%.2f \n", array[accountID].getBalance());
					createMenu(accountID, array);
					break;
			
			case 2: System.out.print("Enter an amount to withdraw: "); 
					double amount = input.nextDouble();
					array[accountID].withdraw(amount);
					System.out.printf("Withdrawing $%.2f \n", amount);
					System.out.printf("The current balance is $%.2f \n", array[accountID].getBalance());
					createMenu(accountID, array);
					break;
			
			case 3: System.out.print("Enter an amount to deposit: "); 
					amount = input.nextDouble();
					array[accountID].deposit(amount);
					System.out.printf("Depositing $%.2f \n", amount);
					System.out.printf("The current balance is $%.2f \n", array[accountID].getBalance());
					createMenu(accountID, array);
					break;
			
			case 4: requestID(array); break;
		}
	}
}
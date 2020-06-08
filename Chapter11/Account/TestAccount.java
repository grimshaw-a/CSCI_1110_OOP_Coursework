//Date: 6.8.20
//Author: Adam Grimshaw
//Class: OOP
//Description: This program tests the account, checkingaccount, and savingsaccount classes.

class TestAccount {
	public static void main(String[] args) {
		Account accountA = new Account(5, 384.58, 0.02);
		Account accountB = new CheckingAccount(6, 1024.00, 0.02);
		Account accountC = new SavingsAccount(7, 567.89, 0.03);
		
		System.out.println(accountA.toString());
		accountB.withdraw(300);
		System.out.println(accountB.toString());
		accountB.withdraw(1200);
		System.out.println(accountB.toString());
		accountB.withdraw(300);
		System.out.println(accountB.toString());
		System.out.println(accountC.toString());
		accountC.withdraw(800);
		System.out.println(accountC.toString());
	}
}
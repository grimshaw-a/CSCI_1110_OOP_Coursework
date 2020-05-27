/*
Adam Grimshaw
Date: 5/27/20
Class: OOP
Description: This program creates an account.
*/

class Bank {
	public static void main(String[] args) {
		Account account1 = new Account(1122, 20000, 0.045);
		account1.withdraw(2500);
		account1.deposit(3000);
		System.out.println("The current balance is " + account1.getBalance());
		System.out.println("The monthly interest is " + account1.getMonthlyInterest());
		System.out.println("This account was created on " + account1.getDateCreated());
	}
}
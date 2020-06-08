//Date: 6.8.20
//Author: Adam Grimshaw
//Class: OOP
//Description: This class describes a savings account.

public class SavingsAccount extends Account{
	
	SavingsAccount() {
		super();
	}
	
	SavingsAccount(int initialID, double initialBalance, double initialInterestRate) {
		super(initialID, initialBalance, initialInterestRate);
	}
	
	public void withdraw(double amount) {
		if(amount > this.getBalance()) {
			System.out.println("Withdrawal exceeds account balance. Transaction declined.");
		} else {
			this.setBalance(this.getBalance() - amount);
		}
	}	
}
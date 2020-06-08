//Date: 6.8.20
//Author: Adam Grimshaw
//Class: OOP
//Description: This class describes a checking account.

public class CheckingAccount extends Account{
	private double overDraftLimit = 500;
	
	CheckingAccount() {
		super();
	}
	
	CheckingAccount(int initialID, double initialBalance, double initialInterestRate) {
		super(initialID, initialBalance, initialInterestRate);
	}
	
	public double getOverDraftLimit() {
		return this.overDraftLimit;
	}
	
	public void setOverDraftLimit(double newLimit) {
		overDraftLimit = newLimit;
	}
	
	public void withdraw(double amount) {
		if(amount > overDraftLimit + this.getBalance()) {
			System.out.println("Withdrawal exceeds overdraft limit. Transaction declined.");
		} else {
			this.setBalance(this.getBalance() - amount);
		}
	}
}
import java.util.*;

class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	Account() {
	}
	Account(int initialID, double initialBalance, double initialInterestRate) {
		id = initialID;
		balance = initialBalance;
		annualInterestRate = initialInterestRate;
		dateCreated = new Date();
	}
	
	int getID() {
		return id;
	}
	double getBalance() {
		return this.balance;
	}
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	Date getDateCreated() {
		return dateCreated;
	}
	void setID(int newID) {
		id = newID;
	}
	void setBalance(double newBalance) {
		balance = newBalance;
	}
	void setAnnualInterestRate(double newRate) {
		annualInterestRate = newRate;
	}
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	void withdraw(double amount) {
		balance -= amount;
	}
	void deposit(double amount) {
		balance += amount;
	}

}
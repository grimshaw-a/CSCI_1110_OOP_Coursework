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
	
	public int getID() {
		return id;
	}
	public double getBalance() {
		return this.balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setID(int newID) {
		id = newID;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newRate) {
		annualInterestRate = newRate;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public void deposit(double amount) {
		balance += amount;
	}

}

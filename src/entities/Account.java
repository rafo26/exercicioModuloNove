package entities;

public class Account {
	public int accountNumber; 
	public String accountHolder;
	private double balance;
	
	public Account(int accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public String data () {
		return "Account " + accountNumber + ", Holder " + accountHolder + ", Balance " + balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}


	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount ;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5;
	}
	
}

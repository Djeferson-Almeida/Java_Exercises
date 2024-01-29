package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	
	public Account() {}
	
	public Account (int number,String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account (int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	
	public Integer getNumber (int number) {
		return number;
	}
	
	public String getHolder(String holder) {
		return holder;
	}
	
	public double getBalance(double balance) {
		return balance;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
}

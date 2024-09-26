package com.techlabs.model;

public class Account {
	private int accountNumber;
	private String Name;
	private double balance;
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		Name = name;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

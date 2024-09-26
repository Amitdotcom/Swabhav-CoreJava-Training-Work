package com.techlabs.model;

import com.techlabs.exceptions.InsufficientBalanceException;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	public Account(long accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void credit(int amount) {
		if(amount<=0) {
			System.err.println("Enter valid amount");
			return;
		}
		setBalance(getBalance()+amount);
	}
	public void debit(int amount) {
		if(amount<=0) {
			System.err.println("Enter valid amount");
			return;
		}
		if(amount>getBalance()) {
			throw new InsufficientBalanceException(getBalance());
		}
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}

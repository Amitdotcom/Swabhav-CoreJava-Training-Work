package com.techlabs.creational.factory.model;

public class SavingsAccount implements IAccount{
	private long accountNumber;
	private String name;
	private double balance;
	private double minimumBalance;
	
	
	public SavingsAccount(long accountNumber, String name, double balance, double minimumBalance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.minimumBalance = minimumBalance;
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


	public double getMinimumBalance() {
		return minimumBalance;
	}


	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}


	@Override
	public double credit(double amount) {
		// TODO Auto-generated method stub
		return balance += amount;
	}

	@Override
	public double debit(double amount) {
		// TODO Auto-generated method stub
		return balance -= amount;
	}
	
}

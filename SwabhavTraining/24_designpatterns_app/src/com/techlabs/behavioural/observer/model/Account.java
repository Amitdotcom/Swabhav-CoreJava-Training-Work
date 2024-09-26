package com.techlabs.behavioural.observer.model;

import java.util.List;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers;
	private String operation;
	public Account(long accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public List<INotifier> getNotifiers() {
		return notifiers;
	}
	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
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
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double credit(double amount) {
		if(amount<=0)
		{
			System.out.println("Please enter a value more than 0");
			return (Double) null ;
		}
		balance += amount;
		this.operation = "Credit";
		System.out.println("Amount creditted successfully. Your updated balance is: " + this.balance);
		
		return balance;
	}
	public double debit(double amount) {
		if(amount>balance) {
			throw new InsufficientFundsException();
		}
		balance -= amount;
		this.operation = "Debit";
		System.out.println("Amount debitted successfully. Your updated balance is: " + this.balance);
		return balance;
	}
	public void addNotifier(INotifier notifier) {
		notifiers.add(notifier);
		System.out.println("Notifier added successfully.");
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", notifiers="
				+ notifiers + "]";
	}
	
}

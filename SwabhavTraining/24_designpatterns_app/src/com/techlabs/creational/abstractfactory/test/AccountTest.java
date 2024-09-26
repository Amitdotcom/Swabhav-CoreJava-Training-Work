package com.techlabs.creational.abstractfactory.test;

import java.util.Scanner;

import com.aurionpro.creational.abstractfactory.model.AccountType;
import com.aurionpro.creational.abstractfactory.model.IAccount;
import com.aurionpro.creational.abstractfactory.model.IAccountFactory;
import com.aurionpro.creational.abstractfactory.model.SavingsAccountFactory;

public class AccountTest {
	static Scanner scanner = new Scanner(System.in);
	private void menu() {
		System.out.println("Choose what you want to do today. \n 1. Create Account \n 2. Exit");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1: 
			typeOfAccount();
		}
		
	}
	private void typeOfAccount() {
		System.out.println("Choose which account you wish to create. \n 1. Savings Account \n 2. Current Account \n 3. Exit");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter your name");
			String name = scanner.next();
			System.out.println("Enter your balance");
			double balance = scanner.nextDouble();
			long accountNumber =(long) (Math.random()*Math.pow(10, 10));
			IAccountFactory savingsAccount = new SavingsAccountFactory();
			IAccount account = savingsAccount.makeAccount(accountNumber, name, balance, AccountType.SAVINGS_ACCOUNT);
		}
	}
	public static void main(String[] args) 
		
	
}
}

package com.techlabs.test;

import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingsAccount;

public class AccountCheckerTest {
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(123456, "Kaivalya", 30000, 10000);
		CurrentAccount currentAccount = new CurrentAccount(213456, "Nishank" , 40000, 25000);
				System.out.println(savingsAccount);
				System.out.println(currentAccount);
	}
}

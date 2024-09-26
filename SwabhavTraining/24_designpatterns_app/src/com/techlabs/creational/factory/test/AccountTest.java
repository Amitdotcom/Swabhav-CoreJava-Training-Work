package com.techlabs.creational.factory.test;

import com.techlabs.creational.factory.model.AccountFactory;
import com.techlabs.creational.factory.model.AccountType;
import com.techlabs.creational.factory.model.IAccount;

public class AccountTest {
	public static void main(String[] args) {
		IAccount account;
		account = AccountFactory.accountFactory(123, "Kaivalya", 100, AccountType.CURRENT_ACCOUNT);
		account.credit(100);
		System.out.println(account);
	}
}

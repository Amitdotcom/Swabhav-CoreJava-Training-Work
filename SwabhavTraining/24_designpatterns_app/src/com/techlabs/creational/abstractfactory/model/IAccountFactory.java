package com.techlabs.creational.abstractfactory.model;

public interface IAccountFactory {
	IAccount makeAccount(long accountNumber, String name, double balance, double x);

	IAccount makeAccount(long accountNumber, String name, double balance, AccountType x);
}

package com.techlabs.behavioural.observer.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.behavioural.observer.model.Account;
import com.techlabs.behavioural.observer.model.AppNotifier;
import com.techlabs.behavioural.observer.model.EmailNotifier;
import com.techlabs.behavioural.observer.model.INotifier;
import com.techlabs.behavioural.observer.model.SmsNotifier;

public class AccountTest {
	static Scanner scanner = new Scanner(System.in);
	static INotifier smsNotifier;
	static INotifier emailNotifer;
	static INotifier appNotifier;
	static List<INotifier> notifiers = new ArrayList<INotifier>();

	private static void optionForMoreNotifiers(Account account) {
		System.out.println("Would you like to add any other notifiers? 1. Yes 2. No");
		int choice = scanner.nextInt();
		if (choice == 1) {
			addingNotifiers(account);
		}
		if (choice == 2) {
			return;
		}
		System.out.println("Please enter a valid input!");
		return;
		
		

	}

	private static void addingNotifiers(Account account) {
		System.out.println(
				"Which notifications would you like to receive? 1. SMS Notifications, 2. Email Notifications, 3. App Notifications, 4. Exit");
		int choice = scanner.nextInt();
		switch (choice) {

		case 1:
			smsNotifier  = new SmsNotifier();
			notifiers.add(smsNotifier);
			optionForMoreNotifiers(account);
			break;
		case 2:
			emailNotifer = new EmailNotifier();
			notifiers.add(emailNotifer);
			optionForMoreNotifiers(account);
			break;
		case 3:
			appNotifier = new AppNotifier();
			notifiers.add(appNotifier);
			optionForMoreNotifiers(account);
			break;
		case 4:
			return;
		default:
			System.out.println("Please enter a valid input");
		}

	}

	public static void main(String[] args) {

		Account account = new Account(123456, "Kaivalya", 5000);
		addingNotifiers(account);
		account.credit(1000);
		
		if(notifiers.contains(smsNotifier)) {
			smsNotifier.notify(account);
		}
		if(notifiers.contains(emailNotifer)) {
			emailNotifer.notify(account);
		}
		if(notifiers.contains(appNotifier)) {
			appNotifier.notify(account);
		}
	}
}

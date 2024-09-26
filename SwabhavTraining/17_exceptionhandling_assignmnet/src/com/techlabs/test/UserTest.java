package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exceptions.emailNotValidException;
import com.techlabs.exceptions.passwordNotValidException;
import com.techlabs.model.User;

public class UserTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter your email Id:");
			String email = scanner.nextLine().trim();
			try {
				User.emailValidator(email);
			} catch (emailNotValidException exception) {
				System.out.println(exception.getMessage());
				return;
			}
			System.out.println("Enter your password:");
			String password = scanner.nextLine().trim();
			try {
				User.passwordValidator(password);
			} catch (passwordNotValidException e) {
				System.out.println(e.getMessage());
			}
			User user = new User(email, password);
			System.out.println(user);
		} finally {
			System.exit(0);
		}
	}
}

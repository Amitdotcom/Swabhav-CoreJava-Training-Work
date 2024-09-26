package com.techlabs.test;

import com.techlabs.model.IFactorial;

public class IFactorialTest {
	public static void main(String[] args) {
	
		IFactorial factorial = (int number) ->{
			
			int temp=1;
			for (int i=1;i<=number;i++) {
				temp *=i;
			}
			return temp;
		};
		System.out.println(factorial.factorial(3));
	}
}

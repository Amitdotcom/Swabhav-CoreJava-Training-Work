package com.techlabs.test;

import com.techlabs.model.BankTransferPayment;
import com.techlabs.model.CreditCardPayment;
import com.techlabs.model.PayPalPayment;
import com.techlabs.model.Payment;

public class PaymentTest {
	public static void main(String[] args) {
		Payment payment;
		payment = new CreditCardPayment();
		payment.refund();
		payment.processPayment();
		
		payment = new PayPalPayment();
		payment.refund();
		payment.processPayment();
		
		payment = new BankTransferPayment();
		payment.refund();
		payment.processPayment();
		
	}
}

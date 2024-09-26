package com.techlabs.test;

import com.techlabs.model.BankTransferPayment;
import com.techlabs.model.CreditCardPayment;
import com.techlabs.model.PayPalPayment;
import com.techlabs.model.Payment;

public class PaymentTest {
	public static void main(String[] args) {
		CreditCardPayment creditCardPayment = new CreditCardPayment();
		creditCardPayment.processPayment();
		creditCardPayment.refund();
		
		PayPalPayment payPalPayment = new PayPalPayment();
		payPalPayment.processPayment();
		payPalPayment.refund();
		
		BankTransferPayment bankTransfer = new BankTransferPayment();
		bankTransfer.processPayment();
		bankTransfer.refund();
		
		Payment payment;
		
		payment = new CreditCardPayment();
		payment.processPayment();
		payment.refund();
		
		payment = new PayPalPayment();
		payment.processPayment();
		payment.refund();
		
		payment = new BankTransferPayment();
		payment.processPayment();
		payment.refund();
	}
}

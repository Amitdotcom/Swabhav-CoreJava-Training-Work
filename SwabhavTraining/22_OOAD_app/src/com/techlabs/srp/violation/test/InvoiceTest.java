package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.model.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("123", "Invoice for Milk", 300, 12);
		
		double tax = invoice.calculateTax(invoice.getTax(), invoice.getAmount());
		System.out.println("Your tax is : " + tax);
		
		System.out.println(invoice.printInvoice());
		
	}
}

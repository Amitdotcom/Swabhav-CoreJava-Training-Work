package com.techlabs.dip.solution.model;

public class TaxCalculator {
	private int amount;
	private int rate;
	public TaxCalculator(int amount, int rate, DBLogger dblogger, NetworkLogger networkLogger) {
		super();
		this.amount = amount;
		this.rate = rate;
	}
	public int calculateTax(int amount, int rate) {
		int tax = 0;
		try {
			tax = amount/rate;
			System.out.println(tax);
		}catch(Exception e) {
			new DBLogger().log("Divide By zero");
			new NetworkLogger().log("Dividing by zero");
		}
		return tax;
	}
	
	

}

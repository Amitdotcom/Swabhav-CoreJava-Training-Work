package com.techlabs.dip.solution.test;

import com.techlabs.dip.solution.model.DBLogger;
import com.techlabs.dip.solution.model.NetworkLogger;
import com.techlabs.dip.violation.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator(10, 20,new DBLogger(), new NetworkLogger());
		tax.calculateTax(100, 0);
	}
	
}

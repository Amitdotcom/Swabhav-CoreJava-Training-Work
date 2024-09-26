package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.model.FestivalType;
import com.techlabs.ocp.violation.model.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(123, "Kaivalya", 400, 10, FestivalType.DIWALI);
		double simpleInterest = fixedDeposit.InterestRateCalculator();
		System.out.println(simpleInterest);
		
	}
}

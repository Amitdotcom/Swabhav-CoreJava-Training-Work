package com.techlabs.test;

import com.techlabs.model.GoldenHat;
import com.techlabs.model.IHat;
import com.techlabs.model.PremiumHat;
import com.techlabs.model.RibonHat;
import com.techlabs.model.StandardHat;

public class HatTest {
	public static void main(String[] args) {
		IHat standardHat = new StandardHat();
		System.out.println(standardHat.getName());
		standardHat = new GoldenHat(standardHat);
		System.out.println(standardHat.getName());
		IHat premiumHat = new PremiumHat();
		System.out.println(premiumHat.getName());
		premiumHat = new RibonHat(premiumHat);
		System.out.println(premiumHat.getPrice());
}
}

package com.techlabs.structural.facade.test;

import com.techlabs.structural.facade.model.HotelReception;

public class HotelReceptionTest {
	public static void main(String[] args) {
		HotelReception reception = new HotelReception();
		reception.getIndianMenu();
		
		reception.getItalianMenu();
	}
}

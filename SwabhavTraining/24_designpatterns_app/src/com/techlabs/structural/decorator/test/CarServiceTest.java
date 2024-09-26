package com.techlabs.structural.decorator.test;

import com.techlabs.structural.decorator.model.CarInspection;
import com.techlabs.structural.decorator.model.ICarService;

public class CarServiceTest {
	public static void main(String[] args) {
		ICarService car = new CarInspection();
		System.out.println(car.getCost());
		
		
	}
}

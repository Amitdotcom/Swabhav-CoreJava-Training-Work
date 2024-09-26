package com.techlabs.creational.factory.test;

import com.techlabs.creational.factory.model.CarCompany;
import com.techlabs.creational.factory.model.CarFactory;
import com.techlabs.creational.factory.model.ICar;

public class CarTest {
	public static void main(String[] args) {
		ICar car;
		car = CarFactory.makeCar(CarCompany.MARUTI);
		car.start();
		car.stop();
		
	}
}

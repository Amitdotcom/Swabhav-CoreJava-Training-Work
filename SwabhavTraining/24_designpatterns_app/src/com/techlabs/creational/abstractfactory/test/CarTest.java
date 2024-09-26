package com.techlabs.creational.abstractfactory.test;

import com.techlabs.creational.abstractfactory.model.ICar;
import com.techlabs.creational.abstractfactory.model.ICarFactory;
import com.techlabs.creational.abstractfactory.model.MarutiFactory;

public class CarTest {
	public static void main(String[] args) {
		ICarFactory factory  = new MarutiFactory();
		ICar maruti = factory.makeCar();
		maruti.start();
		maruti.stop();
	}
}

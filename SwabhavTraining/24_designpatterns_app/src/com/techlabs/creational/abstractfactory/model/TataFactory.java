package com.techlabs.creational.abstractfactory.model;

public class TataFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		// TODO Auto-generated method stub
		return new TataCar();
	}

}

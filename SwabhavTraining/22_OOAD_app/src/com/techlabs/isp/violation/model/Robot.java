package com.techlabs.isp.violation.model;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot has started the work");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot has stopped the work");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Robot is eating");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Robot is drinking");
	}

}

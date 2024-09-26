package com.techlabs.behavioural.command.test;

import com.techlabs.behavioural.command.model.Command;
import com.techlabs.behavioural.command.model.Fan;
import com.techlabs.behavioural.command.model.FanOffCommand;
import com.techlabs.behavioural.command.model.FanOnCommand;

public class RemoteTest {
	public static void main(String[] args) {
		Fan fan = new Fan();
		fan.turnOn();
		fan.turnOn();
		
		Command fanOn = new	FanOnCommand(fan);
		Command fanOff = new FanOffCommand(fan);
		fanOn.execute();
	}
	
}

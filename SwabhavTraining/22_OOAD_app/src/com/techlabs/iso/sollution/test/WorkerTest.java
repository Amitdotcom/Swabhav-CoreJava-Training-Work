package com.techlabs.iso.sollution.test;

import com.techlabs.iso.solution.model.Labour;
import com.techlabs.isp.violation.model.Robot;

public class WorkerTest {
	public static void main(String[] args) {
		Labour labour = new Labour();
		labour.drink();
		Robot robot = new Robot();
		robot.startWork();
	}
}

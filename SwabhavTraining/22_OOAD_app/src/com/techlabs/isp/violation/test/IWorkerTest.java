package com.techlabs.isp.violation.test;

import com.techlabs.isp.violation.model.Labour;
import com.techlabs.isp.violation.model.Robot;

public class IWorkerTest {
	public static void main(String[] args) {
		Labour labour = new Labour();
		labour.drink();
		
		Robot robot = new Robot();
		robot.drink();
	}
}

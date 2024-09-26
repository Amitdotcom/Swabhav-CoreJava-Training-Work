package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.model.Circle;
import com.techlabs.ocp.violation.model.Rectangle;

public class ShapeTest {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.getArea());
		
		Circle circle = new Circle(29);
		System.out.println(circle.getArea());
	}
		
	
}

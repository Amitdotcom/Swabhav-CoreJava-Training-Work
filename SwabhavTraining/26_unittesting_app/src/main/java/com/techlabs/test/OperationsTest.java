package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techlabs.model.Operations;

class OperationsTest {

	Operations operations;
	@BeforeEach // Executed before executing each method
	// if we do @BeforeAll this will be executed once before all methods but only once. Works only with static methods
	void init() {
		operations = new Operations();
	}
	@AfterEach // executed after executing each method
	// same as that for afterall
	void status() {
		System.out.println("Test executed");
	}
	@Test
	void testAddition() {
//		int actual = operations.addition(5, 5);
//		int expected = 10;
		// Function to test whether the acutal and expected are matching or not if
		// matching test case will pass otherwise it will fail
//		assertEquals(expected, actual);
		assertEquals(10, operations.addition(5, 5), "This function must do addition");
		assertEquals(29, operations.addition(10, 19));
		assertEquals(55, operations.addition(50, 5));

	}
	@Test
	void testSubtraction() {
		assertEquals(10, operations.subtraction(15, 5), "This function must do subtraction");
		
	}
	@Test
	void testMultiplication() {
		assertEquals(25, operations.mulitplication(5, 5), "This function must do multiplication");
		
	}
	@Test
	void testDivision() {
		
		assertThrows(ArithmeticException.class, ()->operations.division(10, 0) );
		assertEquals(10, operations.division(50, 5), "This function must do division");
	}

}

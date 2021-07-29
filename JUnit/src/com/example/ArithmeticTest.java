package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ArithmeticTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before method");
	}
	
	@Test
	public void testAdd() {
		System.out.println("Test add ");
		assertEquals(7,ArithmeticOp.add(3,4));
		
	}
	
	@Test
	public void testSub() {
		System.out.println("Test sub ");
		assertEquals(5, ArithmeticOp.sub(10, 5));
		
	}
	
	@Test
	public void testMultiply() {
		System.out.println("Test multiply ");
		assertEquals(6, ArithmeticOp.multiply(2, 3));
		
	}
	



}

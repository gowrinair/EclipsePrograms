package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestConcat {

	@Before
	public void setUp() throws Exception {
		System.out.println("Before method");
	}

	@Test
	public void test() {
		String str="hellohai";
		assertEquals("hellohai",str);
	}

}

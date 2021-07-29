package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLargest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLargest() {
		assertEquals(5, LargestNumber.largestOf3(10, 5, 3));
	}
	

}

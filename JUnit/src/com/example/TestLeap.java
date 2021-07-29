package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLeap {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLeap() {
		assertEquals("Leap year",LeapYear.leapYear());
	}

}

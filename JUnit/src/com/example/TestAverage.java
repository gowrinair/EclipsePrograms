package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAverage {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public  void testAverage() {
		assertEquals(5, Average.average());
	}

}

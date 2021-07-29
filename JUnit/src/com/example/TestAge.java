package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAge {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAge() {
		assertEquals("child",Age.age());
	}

}

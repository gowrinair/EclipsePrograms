package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPerimeter {

	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void testPerimeter() {
		assertEquals(20, CirclePerimeter.Perimeter());
		
	}

}

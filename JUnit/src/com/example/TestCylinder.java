package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCylinder {

	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void testSA() {
		assertEquals(24,CylinderSA.SurfaceArea());
	}

}

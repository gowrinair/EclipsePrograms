package NewJUnit;

import static org.junit.Assert.*;

import org.junit.Before;

public class Test {

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@org.junit.Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("test");
	}

}

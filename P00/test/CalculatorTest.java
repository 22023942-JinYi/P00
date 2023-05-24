import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
	}
	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(expected, actual);
	}
	@Test
	public final void testMultiple() {
		int a = 5;
		int b = 1111;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 5555;
		assertEquals(expected, actual);
	}
	@Test
	public final void testDivide() {
		int a = 12;
		int b = 6;
		
		if(b != 0) {
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 2;
		assertEquals(expected, actual);
		}
		else {
			System.out.println("The denominator is 0");
		}
	}
}

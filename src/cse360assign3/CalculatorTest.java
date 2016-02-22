package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator c = new Calculator();
		assertNotNull(c);
	}

	@Test
	public void testGetTotal() {
		Calculator c = new Calculator();
		
		assertEquals(c.getTotal(),0); // test if the inital value = 0
		c.add(3);
		assertEquals(c.getTotal(),3);
	}

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		
		c.add(3);
		c.add(4);
		
		assertEquals(c.getTotal(),7);
		
		c.add(1);
		
		assertEquals(c.getTotal(),8);
		
		c.add(-3);
		
		assertEquals(c.getTotal(),5); //test - numbers
	}

	@Test
	public void testSubtract() {
		Calculator c = new Calculator();
		
		c.subtract(0);
		
		assertEquals(c.getTotal(),0);
		
		c.add(12);
		c.subtract(2);
		c.subtract(3);
		
		assertEquals(c.getTotal(),7);
		
		c.subtract(7);
		
		assertEquals(c.getTotal(),0);
	}

	@Test
	public void testMultiply() {
		Calculator c = new Calculator();
		
		c.multiply(9);
		
		assertEquals(c.getTotal(),0);
		
		c.add(2);
		c.multiply(4);
		
		assertEquals(c.getTotal(),8);
		
		c.multiply(0);
		
		assertEquals(c.getTotal(),0);
	}

	@Test
	public void testDivide() {
		Calculator c = new Calculator();
		
		c.divide(3);
		
		assertEquals(c.getTotal(),0);
		
		c.add(2);
		c.divide(2);
		
		assertEquals(c.getTotal(),1);
		
		c.add(16);
		
		c.divide(4);
		
		assertEquals(c.getTotal(),4);
		
		
		c.divide(3);
		
		c.divide(4);
		
		c.divide(0);
		
		assertEquals(c.getTotal(),0); // test divide by zero
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}

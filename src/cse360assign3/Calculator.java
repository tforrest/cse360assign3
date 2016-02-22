package cse360assign3;
/**
 * Calculator keeps a running total of an int
 * by multiplying dividing adding and subtracting
 * @author Thomas Forrest
 *
 */

public class Calculator {
	/**Keeps track of the total */
	private int total;
	
	/**
	 * Constructor for calculator
	 * sets a totals int to 0
	 * 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the private int total
	 * 
	 * @return total 
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds an int value to total
	 * 
	 * @param value
	 */
	public void add (int value) {
		
		total = total + value;
		
	}
	/**
	 * Subtracts an int value from total
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		
		total = total - value;
		
	}
	
	/**Multiple an int value from total
	 * 
	 * @param value
	 */
	public void multiply (int value) {
		
		total = total * value;
		
	}
	
	/**
	 * Divide total by an int value
	 * 
	 * @param value
	 */
	public void divide (int value) {
		
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
		
	}
	/**
	 * Return the history of the calculator 
	 * 
	 * @return string 
	 */
	public String getHistory () {
		return "";
	}
}
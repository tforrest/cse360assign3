package cse360assign3;
/**
 * Calculator keeps a running total of an int
 * by multiplying dividing adding and subtracting
 * 
 * https://github.com/tforrest/cse360assign3
 * @author Thomas Forrest
 *
 */

public class Calculator {
	/**Keeps track of the total */
	private int total;
	
	/** Keeps track of the history */
	private String history;
	
	/**
	 * Constructor for calculator
	 * sets a totals int to 0
	 * and history to "0"
	 * 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
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
	 * and updates history
	 * @param value
	 */
	public void add (int value) {
		
		history = history + " " + "+" + " " + Integer.toString(value);
		
		total = total + value;
		
	}
	/**
	 * Subtracts an int value from total
	 * and updates history
	 * @param value
	 */
	public void subtract (int value) {
		
		history = history + " " + "-" + " " + Integer.toString(value);
		
		total = total - value;
		
	}
	
	/**Multiple an int value from total
	 * and updates history
	 * @param value
	 */
	public void multiply (int value) {
		
		history = history + " " + "*" + " " + Integer.toString(value);
		
		total = total * value;
		
	}
	
	/**
	 * Divide total by an int value
	 * and updates history
	 * @param value
	 */
	public void divide (int value) {
		
		history = history + " " + "/" + " " + Integer.toString(value);
		
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
	 * @return  history 
	 */
	public String getHistory () {
		return history;
	}
}
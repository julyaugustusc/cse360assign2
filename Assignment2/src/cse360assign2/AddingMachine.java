/**
 *  @author Augustus Crosby
 *  Class: CSE 360
 *  Assignment: 2
 *  Description: Adds and subtracts from total with a getter for the total while also 
 *  	keeping an arraylist of what has been done previously and prints the arraylist
 *  	upon calling toString().
 */
package cse360assign2;

import java.util.ArrayList;

public class AddingMachine {

	private int total;
	private ArrayList<String> historyInputed = new ArrayList<String>();
	private int indexOfArray;
	private StringBuilder outputString = new StringBuilder();
	
	/**Constructor of AddingMachine Class
	 * 
	 */
	
	public AddingMachine() {
		total = 0;  // not needed - included for clarity
		historyInputed.add("0");
	}
	
	/**Gets total
	 * 
	 * @return total
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**Adds value to total. Also adds a '+' and the value to the ArrayList
	 * 
	 * @param value
	 */
	
	public void add (int value) {
		total = total + value;
		historyInputed.add("+");
		historyInputed.add(String.valueOf(value));
	}
	
	/**Subtracts value from total. Also adds a '-' and the value to the ArrayList
	 * 
	 * @param value
	 */
	
	public void subtract (int value) {
		total = total - value;
		historyInputed.add("-");
		historyInputed.add(String.valueOf(value));
	}
	
	/**Takes the arraylist and builds a string of the history of adds and subtracts. Clears 
	 * stringbuilder object each time at beginning to make sure that if called twice, 
	 * doesn't add everything to the string again twice.
	 * 
	 * @return outputString.toString()
	 */
		
	public String toString() {
		outputString.setLength(0);
		for(indexOfArray = 0; indexOfArray < historyInputed.size(); indexOfArray++ ) {
			outputString.append(historyInputed.get(indexOfArray) + " ");
		}
		return outputString.toString();
	}
	/**Sets necessary variables to default values. "Clears"
	 * 
	 */

	public void clear() {
		total = 0;
		historyInputed.clear();
		historyInputed.add("0");
		outputString.setLength(0);
	}

}
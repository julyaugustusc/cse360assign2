/**
 *  @author Augustus Crosby
 *  Class: CSE 360
 *  Assignment: 2
 *  Description: A test of a AddingMachine.java that 
 *  	tests to make sure the total returns correctly
 *  	as well as makes sure the toString() method outputs 
 *  	appropriately in all cases including those with clear()
 *  	and when toString() is called multiple times.
 */

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void testInput() {
		AddingMachine AM = new AddingMachine();
		assertNotNull(AM);
	}
	
	@Test
	void testBase() {
		AddingMachine AM = new AddingMachine();
		assertEquals(0, AM.getTotal());
	}
	
	@Test
	void testAddition() {
		AddingMachine AM = new AddingMachine();
		AM.add(5);
		assertEquals(5, AM.getTotal());
	}
	
	@Test
	void testSubtraction() {
		AddingMachine AM = new AddingMachine();
		AM.subtract(5);
		assertEquals(-5, AM.getTotal());
	}
	
	@Test
	void testAddNSub() {
		AddingMachine AM = new AddingMachine();
		AM.add(12);
		AM.subtract(5);
		assertEquals(7, AM.getTotal());
	}
	
	@Test
	void testToString0() {
		AddingMachine AM = new AddingMachine();
		assertEquals("0 ", AM.toString());
	}
	
	@Test
	void testToString1() {
		AddingMachine AM = new AddingMachine();
		AM.add(12);
		AM.subtract(5);
		assertEquals("0 + 12 - 5 ", AM.toString());
	}
	
	@Test
	void testToString2() {
		AddingMachine AM = new AddingMachine();
		AM.add(12);
		AM.subtract(5);
		AM.add(9);
		AM.add(7);
		AM.subtract(13);
		assertEquals("0 + 12 - 5 + 9 + 7 - 13 ", AM.toString());
	}
	
	@Test
	void testClear() {
		AddingMachine AM = new AddingMachine();
		AM.add(12);
		AM.subtract(5);
		AM.add(9);
		AM.add(7);
		AM.subtract(13);
		AM.clear();
		assertEquals("0 ", AM.toString());
	}
	
	@Test
	void testToString3() {//outputs twice
		AddingMachine AM = new AddingMachine();
		AM.add(12);
		AM.subtract(5);
		AM.add(9);
		AM.add(7);
		AM.subtract(13);
		AM.toString();
		AM.subtract(13);
		assertEquals("0 + 12 - 5 + 9 + 7 - 13 - 13 ", AM.toString());
	}
	
	@Test
	void testClearWithToString() {
		AddingMachine AM = new AddingMachine();
		AM.add(12);
		AM.subtract(5);
		AM.add(9);
		AM.add(7);
		AM.subtract(13);
		AM.toString();
		AM.clear();
		assertEquals("0 ", AM.toString());
	}

}

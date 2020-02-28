package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	
	/**
	 * This tests if a set that has one item in it has a length of 1
	 */

	@Test
	public void testInsertOnce() {
		SetADT<String> one = new JavaSet<>();
		one.insert("A");
		assertEquals(one.size(), 1);

	}
	/**
	 * This tests if the set only adds each unique item once by confirming the size of the set
	 */
	//Adriana
	@Test
	public void testRepeatedInsert() {
		SetADT<String> repeat = new JavaSet<>();
		repeat.insert("A");
		repeat.insert("A");
		assertEquals(repeat.size(), 1);
	}
	
	
	/**
	 * This tests if the set adds each unique item to the set by confirming the size of the set
	 */
	//Adriana
	@Test
	public void testUniqueInsert() {
		SetADT<String> unique = new JavaSet<>();
		unique.insert("A");
		unique.insert("B");
		assertEquals(unique.size(), 2);
		
	}

	
	/**
	 * This tests if insert() inserts the value as its parameter by using contains()
	 */
	//Kaia
	@Test
	public void testInsertTrue() {
		SetADT<String> tInsert = new JavaSet<>();
		tInsert.insert("A");
		assertEquals(tInsert.contains("A"), true);
		
	}
	
	/**
	 * This tests if the size method on SetADT returns the correct size even with repeated values
	 */
	//Kaia
	@Test
	public void testSize() {
		SetADT<String> sizes = new JavaSet<>();
		sizes.insert("A");
		sizes.insert("B");
		sizes.insert("C");
		sizes.insert("A");
		assertEquals(sizes.size(), 3);
		
	}
	
	/**
	 * This tests if the size method on SetADT returns the correct size even with repeated values
	 */
	//Kaia
	@Test
	public void testContainTrue() {
		SetADT<String> contains = new JavaSet<>();
		contains.insert("A");
		contains.insert("B");
		contains.insert("C");
		contains.insert("A");
		assertTrue(contains.contains("A"));
		
	}
	
	/**
	 * This tests if the contains method returns false for values not in the set
	 */
	//Kaia
	@Test
	public void testContainFalse() {
		SetADT<String> contains = new JavaSet<>();
		contains.insert("A");
		contains.insert("B");
		contains.insert("C");
		contains.insert("A");
		assertFalse(contains.contains("D"));
		
	}
	
	/**
	 * This tests if the remove method removes the letter from the set and make sure the list is the right size so 
	 * we don't have to rely on fully on either contains or size
	 */
	//Adriana
	@Test
	public void testRemoveTrue() {
		SetADT<String> ab = new JavaSet<>();
		ab.insert("A");
		ab.insert("B");
		ab.remove("A");
		assertFalse(ab.contains("A"));       // to make sure a doesn't exist anymore
		assertEquals(ab.size(),1);            // to check if it is actually out
		
	}
	
	/**
	 * This tests if the remove method removes the letter from the set and make sure the list is the right size so 
	 * we don't have to rely on fully on either contains or size
	 */
	//Adriana
	@Test
	public void testRemoveFalse() {
		SetADT<String> ab = new JavaSet<>();
		ab.insert("A");
		ab.insert("B");
		ab.remove("C");                   // to make sure that it doesn't remove another value that is in the set with the removing of a value not in the set
		assertEquals(ab.size(),2);             
		
	}
	

	
	
	
}

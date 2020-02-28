package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// You might want this; if you're using Map<String, Integer> anywhere...
	// JUnit has an assertEquals(Object, Object) and an assertEquals(int, int).
	// When you give it assertEquals(Integer, int) it doesn't know which to use (but both would be OK!)
	// This method gets around that by forcing the (int, int) version.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
	}
	
	//Adriana
	@Test
	public void testOnePut() {
		MapADT<String, String> one = new JavaMap<>();
		one.put("A","letter");
		assertEquals(one.size(), 1);
	}
	//Adriana
	@Test
	public void testPutReplace() {
		MapADT<String, String> one = new JavaMap<>();
		one.put("A","letter");
		assertEquals(one.get("A"), "letter");
		one.put("A", "number");
		assertEquals(one.get("A"), "number");
	}
	
	//Kaia
	@Test
	public void testGetValue() {
		MapADT<String, String> one = new JavaMap<>();
		one.put("A","letter");
		assertEquals(one.get("A"), "letter");
		assertEquals(one.get("B"), null);
	}
	
	//Kaia
	@Test
	public void testSizeMultiple() {
		MapADT<String, String> one = new JavaMap<>();
		one.put("A","letter");
		one.put("B","letter");
		one.put("A","letter");
		assertEquals(one.size(), 2);
	}
	
	//Kaia
	@Test
	public void testRemoveOne() {
		MapADT<String, String> one = new JavaMap<>();
		one.put("A","letter");
		assertEquals(one.size(), 1);
		one.remove("A");
		assertEquals(one.size(), 0);
	}
	
	
}

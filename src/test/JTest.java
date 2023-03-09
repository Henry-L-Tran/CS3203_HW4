package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Target;

public class JTest {

	@Test
	void arrayIsEmpty() {
		var length = new Target();
		int[] emptyArray = new int[5];
		int[] filledArray = {10,11,12,13,14,15};
		assertEquals(false, length.equal(emptyArray, 22));
		assertEquals(true, length.equal(filledArray, 22));
	}
	
	@Test
	void arraySize1() {
		var size = new Target();
		int[] array1 = {3};
		int[]array2 = {1,2,3};
		assertEquals(false, size.equal(array1, 6));
		//Same array size of 1, but the number is the target value.
		assertEquals(false, size.equal(array1, 3));
		assertEquals(true, size.equal(array2, 3));
		
	}
	
	@Test
	void arrayDifferentNumbers() {
		var check = new Target();
		int[] arraySame = {2,2,3,4,4};
		int[] arrayDifferent = {1,3,5,7,9};
		assertEquals(false, check.equal(arraySame, 4));
		assertEquals(true, check.equal(arrayDifferent, 12));
	}
	
	@Test
	void arrayIsFalse() {
		var notTrue = new Target();
		int[] array = {1,2,3,4,5,6,7,8};
		int[] array2 = {2,4,6,8,10,12};
		assertEquals(false, notTrue.equal(array, 16));
		assertEquals(false, notTrue.equal(array2, 2));
	}
	
	@Test
	void arrayIsTrue() {
		var isTrue = new Target();
		int[] array = {1,3,5,4,7,8};
		int[] array2 = {11,35,32,53,12};
		assertEquals(true, isTrue.equal(array, 11));
		assertEquals(true, isTrue.equal(array2, 67));
		
	}
		
	@Test
	void arrayElementsAdjacent() {
		var targets = new Target();
		int[] array = {1,2,3,4,5};
		assertEquals(true, targets.equal(array, 3));
		assertEquals(true, targets.equal(array, 5));
		assertEquals(true, targets.equal(array, 7));
		assertEquals(true, targets.equal(array, 9));
		assertEquals(false, targets.equal(array, 10));
	}
	
	@Test 
	void arrayElementsFirstAndLast() {
		var elements = new Target();
		int[] array = {5,10,15,20,25,30,35};
		int[] array2 = {3,6,9,12,15,18,21,24};
		int[] array3 = {23,342,31,89,44,32,17};
		assertEquals(true, elements.equal(array, 40));
		assertEquals(true, elements.equal(array2, 27));
		assertEquals(true, elements.equal(array3, 40));
	}
	
	@Test
	void arrayIsNegative() {
		var negative = new Target();
		int[] nNumbers = {-2,-3,-5,-11,-56,-32};
		assertEquals(true, negative.equal(nNumbers, -34));
		assertEquals(true, negative.equal(nNumbers, -5));
		assertEquals(true, negative.equal(nNumbers, -16));
		//Same integer but it's positive instead.
		assertEquals(false, negative.equal(nNumbers, 16));
	}
	
	@Test 
	void arrayMultipleElementPairs() {
		//Multiple element pairs that can add to target.
		var multiple = new Target();
		int[] array = {1,23,1,20,4,8,16,5,19,14,10};
		assertEquals(true, multiple.equal(array, 24));
		
	}
}
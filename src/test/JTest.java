package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Target;

public class JTest {

	@Test
	void arrayDifferentNumbers() {
		var check = new Target();
		int[] arraySame = {2,2,3,4,4};
		int[] arrayDifferent = {1,3,5,7,9};
		assertEquals(false, check.equal(arraySame, 2));
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
	void arrayOutOfBounds() {
		var bounds = new Target();
		int[] array = {1,2,3,4,5};
		assertDoesNotThrow(IndexOutOfBoundsException.class, () -> bounds.equal(array, 4));
	}
	@Test
	void arraySize5() {
		var targets = new Target();
		int[] array = {1,2,3,4,5};
		assertEquals(true, targets.equal(array, 4));
		assertEquals(false, targets.equal(array, 10));
	}
}
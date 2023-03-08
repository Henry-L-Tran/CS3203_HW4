package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Target;

public class JTest {

	@Test
	void arrayOutOfBounds() {
		assertThrows(IndexOutOfBoundsException.class,)
	}
	@Test
	void arraySize5() {
		var targets = new Target();
		int[] array = {1,2,3,4,5};
		assertEquals(true, targets.equal(array, 4));
	}
}
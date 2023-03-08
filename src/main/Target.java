package main;

public class Target {

	public boolean equal(int[] numbers, int target) {
		
		for(int i = 0; i < numbers.length; i++) {
			if((numbers[i] + numbers[i + 1]) == target) {
				return true;
			}
			
		}
		
		return false;
		
	}
}

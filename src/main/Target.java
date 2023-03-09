package main;

public class Target {

	public boolean equal(int[] numbers, int target) {
		
		if(numbers.length <= 1) {
			return false;
		}
		
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = 1; j < numbers.length; j++) {
				if(numbers[i] != numbers[j]) {
					if((numbers[i] + numbers[j]) == target) {
						return true;
					}
				}
			}
			
		}
		
		return false;
		
	}
}

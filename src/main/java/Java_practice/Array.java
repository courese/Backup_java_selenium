package Java_practice;

public class Array {
	
		public static void main(String[] args) {
			int[] numbers = {10, 20, 30, 40, 50};

	        // Find the largest number
	        int max = numbers[0];
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }
	        System.out.println("The largest number in the array is: " + max);
	    }
	}
	




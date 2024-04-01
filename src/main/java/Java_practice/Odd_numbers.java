package Java_practice;

import java.util.List;

public class Odd_numbers {
	
	List<Integer> numbers = List.of (1,2,3,4,5,6,7,8,9);
	System.out.println("odd numbers in the list are : ");
	printOddNumbers(numbers);
	
	public static void printOddNumbers(List<Integer> numbers)
	{
		for(int number :numbers) {
			if(number%2 !=0) {
				System.out.println(number);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

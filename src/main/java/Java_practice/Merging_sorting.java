package Java_practice;

import java.util.Arrays;

public class Merging_sorting {
	
	public void sorting()
	{
		int[] a1= {4,56,78,34};
		
		System.out.println("Given array list is : " +Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println("Given array list is : " +Arrays.toString(a1));
		
	}
	
	public void merging()
	{
		int[] a = {3,5,6,7,2};
		int[] b = {5,2,6,8,4};
		int length = a.length + b.length;
		int[] c = new int[length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(a, 0, c, a.length, b.length);
		System.out.println("Merging list is :" +Arrays.toString(c));
		Arrays.sort(c);
		System.out.println("sorting is :" +Arrays.toString(c));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merging_sorting a = new Merging_sorting();
		a.merging();
		

	}

}

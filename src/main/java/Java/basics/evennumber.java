package Java.basics;

public class evennumber {
	int n; //global variable
	public void even(int n) //method with parameter
	{ 
		if (n>= 40) {
			
	        for (int i=n; i<=60; i++) {
	        	if(i%2==0) 	{
	        		System.out.println(i);
	        	}
	        }
	}
		else
    	{
    		System.out.println("Number is less than 40");
    	}
	}
	
	//Java Program to print Odd and Even Numbers from an Array
	public void list_array()
	{
		int a[] = {1,2,3,4,5,6,7,8,9};
		for(int i =0; i<a.length;i++)
		if (a[i]%2!=0)
		{
			System.out.println(a[i]+ "is an odd number");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("even numbers are :");
		evennumber sample = new evennumber();
		sample.even(49);
		sample.list_array();

	}

}

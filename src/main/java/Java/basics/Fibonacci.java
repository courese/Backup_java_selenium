package Java.basics;

public class Fibonacci {
	int n=10;
	int a=1, b=1,c;
	public void series()
	{
		System.out.println("Fibonacci series :");
		System.out.println(a);
		System.out.println(b);
 		for (int i=3;i<n;i++)
		{
 			c=a+b;
 			System.out.println(c);		
		a=b;
		b=c;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibonacci sample = new Fibonacci();
		sample.series();
	}
}

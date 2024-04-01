package Java_practice;

public class pattern {
	
private int i;

public void basic(int rows)
	{
	
		for(int i=0;i<rows;i++)

		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

public void triangle()
{
	int rows=4;
	for(int i=1;i<=rows; i++)
	{
		for(int j=1; j<=rows-i; j++)
		{
			System.out.print(" ");
		}
	for(int j=1; j<=i; j++)
	{
		System.out.print(j+ " ");
	}
	System.out.println();
}
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern s= new pattern();
		//s.basic(4);
		s.triangle();

	}

}

package Java.basics;

public class loopconditions {
	public void whileloop()
	{
		int i=20;
		while(i<=30)
		{	
		
		if (i==30)
		{
			System.out.print(i);
		}
		else
		{
			System.out.print(i +",");
		}
		i=i+2;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("The outputs are :" );	
		loopconditions sample = new loopconditions();
		sample.whileloop();
	
	}
}

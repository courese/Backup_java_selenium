package Java_practice;

public class Programs_1 {
	
	//String original ="maha";
	String reversed_name="";
	public void reverse_a_string(String original)
	{
		//String reversed_string = null;
		for(int i=0;i<original.length();i++)
			reversed_name = original.charAt(i)+reversed_name;
		System.out.println("original name: " +original);
		System.out.println("Reversed name: " +reversed_name);
	}
	
	public void reverse_a_number()
	{
		int original_number = 21061996;
		int reverse = 0;
		while(original_number>0)
		{
			int remainder = original_number%10;
			reverse = reverse*10+remainder;
			original_number=original_number/10;
			}
		System.out.println("reversed number is " +reverse);
	}
		
	public void swapping_numbers()
	{
		int a = 10, b=20;
		System.out.println("Before swapping for a is "+a +"and b is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping for a is "+a +"and b is "+b);
	}
	
	public void vowel_string(String str)
	{
		//String str= new String("This is Mahalakshmi");
				for(int i=0; i<str.length();i++)
				{
					if (str.charAt(i) =='a' || str.charAt(i) =='e'||str.charAt(i) =='i'||str.charAt(i) =='o'||str.charAt(i) =='u'||str.charAt(i) =='A'||str.charAt(i) =='E'||str.charAt(i) =='I'||str.charAt(i) =='O'||str.charAt(i) =='U') {;
					
					System.out.println("Given string " +str.charAt(i) +" is a vowel");	
					}
				else
				
					System.out.println("Given string " +str.charAt(i) +" is not a vowel");
				}
					
	}
	public void removing_Space()
	{
		String str="Good lunck";
		String result = str.replaceAll("\\s", "");
		System.out.println(result);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programs_1 result = new Programs_1();
		//result.reverse_a_string("Gowtham maha");
		//result.reverse_a_number();
		//result.swapping_numbers();
		//result.vowel_string("This is Mahalakshmi");
		result.removing_Space();

	}

}

package Java.basics;

public class vowel {
	public void alphabet(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch =='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println(ch+ " is a vowel.");
	}
	else
	{
		System.out.println(ch+ " is not a vowel.");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowel sample =new vowel();
		sample.alphabet('7');

	}

}

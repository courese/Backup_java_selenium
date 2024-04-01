package Java.basics;
public class vowelletter {
	public void character(char ch)
	{
		switch (ch)
		{
		case ('a'):
		case ('e'):
		case ('i'):
		case ('o'):
		case ('u'):
		case ('A'):
		case ('E'):
		case ('I'):
		case ('O'):
		case ('U'):
			System.out.println(ch+ " is a vowel");
			break;
    default:
    	System.out.println(ch + " is not a Vowel.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowelletter s =new vowelletter();
		s.character('A');
	}
}

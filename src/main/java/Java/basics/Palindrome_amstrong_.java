package Java.basics;

public class Palindrome_amstrong_ {
	public void Palindromenumber(int n) {
		int s = 0, r, t = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			s = s * 10 + r;
		}
		if (t == s) {
			System.out.println(t + " is a palindrome");
		} else {
			System.out.println(t + " is not a palindrome");
		}
	}

	public void amstrong(int n) {
		int t = n, s = 0, digit;
		while (n > 0) {
			digit = n % 10;
			s = s + (digit * digit * digit);
			n = n / 10;
		}
		if (s == t) {
			System.out.println(+t+" is an amstrong");
		} else {
			System.out.println(+t+" is not an amstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome_amstrong_ sample = new Palindrome_amstrong_();
		sample.Palindromenumber(1071);
		sample.amstrong(21061996);
	}

}

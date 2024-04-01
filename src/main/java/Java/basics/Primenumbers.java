package Java.basics;

public class Primenumbers {
	

	public void numbers(int n) {
		boolean prime=false;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				prime = true;
			}
		}
		if (prime != true) {
			System.out.println(" not a prime");
		} else {
			System.out.println(" prime");
		}
	}
	public void prime(int n)
	{
	    int count = 0;
	    int i = 1;
	    while (i <= n / 2) {
	      if (n % i == 0) {
	        count++;
	      }
	      i++;
	    }

	    if (count > 1) {
	      System.out.println("The number is not prime");
	    } else {
	      System.out.println("The number is prime");
	    }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primenumbers sample = new Primenumbers();
		sample.numbers(11);
		sample.prime(21);

	}

}

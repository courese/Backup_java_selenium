package Java.basics;

public class Factorial {
	public void number() {
		int i, fact = 1, n=5;
		for (i = 1; i <= n; i++){
		fact = fact * i;
		}
		System.out.println("Fctorial of " +n+ "! is " +fact);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial s = new Factorial();
		s.number();
	}

}

package Java.basics;

public class template {
		private int a =21; //Global variable
		private int b = 6; //Global variable
		private int c,d,e;
		private double f;	  //Global variable
		//Method without parameter and without returntype
		private void operation() {
			c = a+b;  
			d = a-b;
			e = a*b;
			f = a/b;
			System.out.println("a+b is " +c);
			System.out.println("a-b is " +d);
			System.out.println("a*b is " +e);
			System.out.println("a/b is " +f);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Output:");
			template Sample = new template(); //object implementation
			Sample.operation(); //method call
		
		}

	}

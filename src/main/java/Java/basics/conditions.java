package Java.basics;

public class conditions {
	public void ifconditions(int age)
	{
		if (age<20) {
			System.out.println("You are a Teenaged person");
		}
		
		else if (age>21&age<=35) {
			System.out.println("You are a women");
		}
		else if (age>35&age<=60) {
			System.out.println("You are about to become old");
		}
		else if (age>61) {
			System.out.println("you are senior citizen");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditions a = new conditions(); //object implementation
		a.ifconditions(60); //method call
	}

}

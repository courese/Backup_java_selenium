package Java_practice;

public class conversion {

	public void string_int()
	{
		String s = "100";
		int i=Integer.parseInt(s); 
		System.out.println(i);
	}
	
	public void int_string()
	{
		int i=100;
		String s= String.valueOf(i);
		System.out.println(s);
	}
	
	public void char_string()
	{
		char c='a';
		String s= String.valueOf(c);
		System.out.println(s +"jhgsadjh");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conversion j = new conversion();
		j.string_int();
		j.int_string();
		j.char_string();

	}

}

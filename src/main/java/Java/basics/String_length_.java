package Java.basics;

public class String_length_ {
	String str = " maha.r ";
	String str1 = " maha r";
	public void space()
	{
		System.out.println("the given name length is " +str.length()+ " letter");
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("a"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.compareTo(str1));
		System.out.println(str.contains(str1));
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
		System.out.println(str.replace(".","_"));
		System.out.println(str.substring(1, 3)); //dispplays the fiest n  n of index values
		System.out.println(str.substring(3)); // displays from the 3no of index to the end
		System.out.println(str.startsWith(" m")); //
		System.out.println(str.endsWith(" "));
		char[] convertcharfromstring = str.toCharArray();
		for (char eachvalue : convertcharfromstring)
		{
			System.out.println(eachvalue);
		}
	}
	public void items()
	{
		String[] food = {"Idly-10", "dhosa-5", "chapathi-15"};
		for(String eachvalue : food)
		{
			System.out.println(eachvalue); // it will display each items&value one by one
			String[] ItemsandValue = eachvalue.split("-");
			System.out.println("item name : " + ItemsandValue[0]);
			System.out.println("item name : " + ItemsandValue[1]);
			for (String eachitems : ItemsandValue)
			{
				System.out.println(eachitems);
			}
			
		}
	}
	public void file()
	{
		String filename = "sathishkumarR.txt";			
		// txt =textfile , xlsx =excel ,json =json file
		int charposition = filename.indexOf(".");
		String fileExtension =filename.substring(charposition);
		if(fileExtension.equalsIgnoreCase(".txt"))
		{
			System.out.println("This it txt file");
		}
		else if(fileExtension.equalsIgnoreCase(".xlsx"))
		{
			System.out.println("This it excel file");
		}
		else if(fileExtension.equalsIgnoreCase(".json"))
		{
			System.out.println("This is json file");
		}
		else
		{
			System.out.println("this is not a valid fil");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_length_ s =new String_length_();
		s.file();

	}

}

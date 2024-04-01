package Java.basics;
import java.util.*;
public class Conditional_MapConcepts {
	public void mapexecution() // Map interace doesn't allow to store duplicate keys and alows to store duplicate values. it is inherited by 3 class.
	{
		//HashMap<Integer,String>hs = new HashMap<Integer,String>(); //it will not store duplicate and it will be store in the ascending order
		//LinkedHashMap<Integer,String>hs = new LinkedHashMap<Integer,String>(); //it will not store duplicate and it will be store in the insertion order
		TreeMap<Integer,String>hs = new TreeMap<Integer,String>(); //it will not store duplicate and it will be store in the ascending order
		//instead add, Map class is using put to add the key pair value.
		hs.put(2, "Maha");
		hs.put(1, "lakshmi");
		hs.put(6, "java");
		hs.put(9, "course");
		// remove the value
		hs.remove(6);
		//update the value
		hs.replace(9, "java course");
		//get the values
		System.out.println(hs.get(2)); // it is to get the specific key value
		System.out.println(hs.keySet()); // it is to get all the key
		System.out.println(hs.values()); // it is to get all the value
		
		for(String eachval:hs.values()) // it is to get the each string values
		{
			System.out.println(eachval);
		}
		System.out.println(hs.clone());
		System.out.println(hs.containsKey(2));
		System.out.println(hs.isEmpty());
		hs.clear();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditional_MapConcepts s = new Conditional_MapConcepts();
		s. mapexecution();

	}

}

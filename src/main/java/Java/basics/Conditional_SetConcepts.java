package Java.basics;

import java.util.Iterator;
import java.util.*;

public class Conditional_SetConcepts {
	public void setinterface()
	{
		
		//HashSet<Integer> a = new HashSet<>(); // it will not store duplicate and it will be store in the ascending order
		//LinkedHashSet<Integer> a = new LinkedHashSet<>(); //it will not accepted the duplicate value and it will maintain the insertion order
		TreeSet<Integer> a = new TreeSet<>(); // it will not store duplicate and it will be store in the ascending order
		Object a1 = new HashSet<>();
		//adding  the value in the ArrayList collection
		a.add(7);
		a.add(2);
		a.add(1);
		a.add(2);
		//delete the value in the ArrayList collection
		a.remove(0);
		//update the value in the ArrayList collection
		//a.set(1, 9);
		//getting the value by using iterator method in the ArrayList
		Iterator it= a.iterator();  
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//getting the value by using for eachvalue method in the ArrayList
		for(int eachvalue :a)
		{
			System.out.println(eachvalue);
		}
		System.out.println(a.isEmpty());
		a1=a.clone();
		System.out.println(a.contains(2));
		a.clear();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditional_SetConcepts s =new Conditional_SetConcepts();
		s.setinterface();

	}

}

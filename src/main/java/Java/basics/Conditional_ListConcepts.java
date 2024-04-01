package Java.basics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Conditional_ListConcepts {
	public void first() {
		int[] age1 = new int[5];
		int[] age = {1,2,3,4,5};
		age1[0] =1;
		age1[1] =2; 
		age1[2] =3;
		age1[3] =4;
		age1[4] =5;
	}
	public void List_arraylist() {
		ArrayList <Integer> a = new ArrayList<>();
		Object b = new ArrayList<>();
		//adding  the value in the ArrayList collection
		a.add(7);
		a.add(2);
		a.add(1);
		a.add(6);
		//remove the value in the ArrayList collection
		a.remove(0);
		//update the value in the ArrayList collection
		a.set(1, 9);
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
		b=a.clone();
		System.out.println(a.contains(2));
		a.clear();
		
	}

	public void List_Linkedlist() {
		LinkedList <Integer> a = new LinkedList<>();
		Object b = new ArrayList<>();
		//adding  the value in the ArrayList collection
		a.add(7);
		a.add(2);
		a.add(1);
		a.add(6);
		//remove the value in the ArrayList collection
		a.remove(0);
		//update the value in the ArrayList collection
		a.set(1, 9);
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
		b=a.clone();
		System.out.println(a.contains(2));
		a.clear();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditional_ListConcepts s = new Conditional_ListConcepts();
		s.List_Linkedlist();

	}

}

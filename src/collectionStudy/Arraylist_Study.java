package collectionStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_Study {

	public static void main(String[] args) {
		ArrayList<String>a1 = new ArrayList<String>(); // Declearation of array list
		a1.add("Kolhpur");
		a1.add("Solapur");
		a1.add("Latur");
		a1.add("Nagpur");
		a1.add("Pandharpur"); // to add elements 
		System.out.println(a1);
		a1.add(2,"Tuljapur"); // Element Insertion
		System.out.println(a1);
		System.out.println(a1.get(3)); // Read element by Index 
		System.out.println(a1.set(0,"Maharashtra")); // Setting new value
		System.out.println(a1);
		a1.remove("Latur"); // Element remove by compile time
		System.out.println(a1);
		a1.remove(1); 
		System.out.println(a1);
		// -----------------------------------------------------
		ArrayList<String>a2=new ArrayList<String>();
		a2.add("Amol");
		a2.add("Devashish");
		a2.add("Shubhash");
		a2.add("Ankita");
		a2.add("Chaitali");
		a2.add("Karishma");
		//a2.addAll(a1);
		System.out.println(a2);
		a2.addAll(1, a1);
		System.out.println(a2);
		Collections.sort(a2); // sorting by asc
		System.out.println(a2);
		//--------------------------------------------------
		// By using Conventional For Loop Traversing
		
		for(int i=0;i<a2.size();i++) {
			System.out.println(a2.get(i));
		}
		 //----------For Each Loop------
		// For Each loop applicable in set,List and que
		
		System.out.println("-----------For Eachloop---------");
		for(String s:a2) {
			System.out.println(s);
		}
	//---------Iterator----
		System.out.println("-------------------------");
		Iterator<String> itr = a2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//------------List Iterator---------
		// List Iterator only applicable in list
		
		System.out.println("----------------------------");
		ListIterator<String> Litr = a2.listIterator();
		while(Litr.hasNext()) {
			System.out.println(Litr.next());
		}
		System.out.println("-----------------");
		while(Litr.hasPrevious()) {
			System.out.println(Litr.previous());
		}
		
	}

}

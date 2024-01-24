package seleniumProgram;

import java.util.ArrayList;

public class ArrayListUse {

	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("Amol");
		arr.add("Kolhapur");
		arr.add("Devashish");
		arr.add("Subhash");
		arr.add("Ankita");
		arr.add("Chaitali");
		arr.add("9284181002");
		arr.add("O +ve");
		
		System.out.println(arr);
		System.out.println("--------------------------------------------");
		Object arrnew= arr.clone();
		System.out.println("Cloned Array List --->"+arrnew);
		System.out.println(arrnew.equals("Pune"));
		System.out.println(arrnew.equals("Ankita"));
		System.out.println(arr.contains("Amol"));
		System.out.println("========================================");
		
		arr.ensureCapacity(4);
		arr.add("Atul");
		System.out.println(arr);
		arr.add("Karishma");
		System.out.println(arr);
		System.out.println("--------------------------------------");
		System.out.println(arr.get(4));
		System.out.println(arr.indexOf("Subhash"));
		
		System.out.println(arr.isEmpty());
		System.out.println("--------------------------------------");
		arr.set(1,"Shinde");
		System.out.println(arr);
		
		System.out.println(arr.size());
		System.out.println(arr.remove(7));
		System.out.println(arr.remove("9284181002"));
		
		
	}

}

package Mock_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sample1 {

	public static void main(String[] args) {
		ArrayList<String> Al = new ArrayList<>();
		Al.add("Pune");
		Al.add("Mumbai");
		Al.add("Sangli");
		Al.add("Satara");
		System.out.println(Al);
		// How to get data from Arraylist

		Al.get(2);
		System.out.println(Al.get(2));

		Al.remove(1);
		System.out.println(Al);

		Al.set(1, "Karad");
		System.out.println(Al);

		ArrayList<String> Al2 = new ArrayList<>();
		Al2.add("Karnatak");
		Al2.add("Mumbai");
		Al2.add("Sangli");
		Al2.add("Satara");
		System.out.println(Al2);

		// Al.addAll(Al2);
		// System.out.println(Al);
		Al.addAll(1, Al2);
		System.out.println(Al);

		// Al.clear();
		// System.out.println(Al);

		Collections.sort(Al);
		System.out.println(Al);
		System.out.println(Al.size());
		
		
	}

}

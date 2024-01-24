package Mock_Collection;

import java.util.TreeSet;

public class Treeset_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> Hs = new TreeSet<Integer>();
		Hs.add(100);
		Hs.add(50);
		Hs.add(10);
		Hs.add(20);
		Hs.add(80);
		Hs.add(120);
		Hs.add(30);
		Hs.add(40);
		Hs.add(40); // Duplicate not allowded

		System.out.println(Hs);
	}

}

package Mock_Collection;

import java.util.HashSet;

public class Set_Study {

	public static void main(String[] args) {
		HashSet<Integer> Hs = new HashSet<Integer>();
		Hs.add(10);
		Hs.add(20);
		Hs.add(30);
		Hs.add(40);
		Hs.add(40); // Duplicate not allowded
		Hs.add(null);
		System.out.println(Hs);
		
		System.out.println(Hs.size());
		System.out.println(Hs.remove(10));
		System.out.println(Hs);
		
	
	}

}

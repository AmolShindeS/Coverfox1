package Mock_Collection;

import java.util.LinkedHashSet;

public class SetUsingLinkset {

	public static void main(String[] args) {

		LinkedHashSet<Integer> Hs = new LinkedHashSet<Integer>();
		Hs.add(50);
		Hs.add(10);
		Hs.add(20);
		Hs.add(30);
		Hs.add(40);
		Hs.add(40); // Duplicate not allowded
		Hs.add(null);
		System.out.println(Hs);
	}

}

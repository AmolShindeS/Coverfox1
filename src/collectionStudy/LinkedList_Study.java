package collectionStudy;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Study {

	public static void main(String[] args) {
		LinkedList<Integer>Ll=new LinkedList<Integer>();
		Ll.add(10);
		Ll.add(20);
		Ll.add(30);
		Ll.add(40);
		Ll.add(50);
		System.out.println(Ll);
System.out.println(Ll.get(2));
System.out.println(Ll.set(0,100));
System.out.println(Ll);
System.out.println(Ll.remove(2));
System.out.println(Ll);
Collections.sort(Ll);
System.out.println(Ll);

for(int i=0;i<Ll.size();i++) {
	System.out.println(Ll.get(i));
}
 //----------For Each Loop------
// For Each loop applicable in set,List and que

System.out.println("-----------For Eachloop---------");
for(int s:Ll) {
	System.out.println(s);
}
//---------Iterator----
System.out.println("-----------Using Iterator --------------");
Iterator<Integer> itr = Ll.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

//------------List Iterator---------
// List Iterator only applicable in list

System.out.println("--------- List Iterator -------------------");
ListIterator<Integer> Litr = Ll.listIterator();
while(Litr.hasNext()) {
	System.out.println(Litr.next());
}
System.out.println("-----------------");
while(Litr.hasPrevious()) {
	System.out.println(Litr.previous());
}












	}

}

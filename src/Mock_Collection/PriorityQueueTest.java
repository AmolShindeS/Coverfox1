package Mock_Collection;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		Queue<String> pe = new LinkedList<String>();
        pe.offer("Deva");
        pe.offer("Amol");
        pe.offer("Ankita");
        pe.offer("Chaitali");
        pe.offer("Karishma");
        System.out.println(pe);
        
        System.out.println(pe.poll());
        System.out.println(pe);
        System.out.println(pe.peek());
	}

}

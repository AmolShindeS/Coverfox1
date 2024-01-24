package Mock_Collection;

import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		// First IN - Last Out
		Stack<String>S1 =new Stack<>();
		S1.push("Kolhapur");
		S1.push("Thane");
		S1.push("Pune");
		
		System.out.println(S1);
		
		System.out.println(S1.peek());// Indentify Last entered Data
		System.out.println(S1);
		System.out.println(S1.pop()); // Remove Last Entered Data
		System.out.println(S1);
	}

}

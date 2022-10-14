import java.util.*;
public class StackFW{
	public static void main(String args[]){
		Stack s = new Stack();
		System.out.println("Content of s: " + s);
		System.out.println("Size: " + s.size());
		System.out.println("Is empty? " + s.empty());
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("Content of s: " + s);
		System.out.println("Size: " + s.size());
		System.out.println("Popped: " + s.pop());
		System.out.println("Content of s after pop: " + s);
		System.out.println("Topmost element: " + s.peek());
		System.out.println("Content of s after peek: " + s);
		int srp = s.search(10);
		System.out.println("Stack relative postition of 10 is: " + srp);
		int srp1 = s.search(100);
		System.out.println("Stack relative postition of 100 is: " + srp1);
	}
}

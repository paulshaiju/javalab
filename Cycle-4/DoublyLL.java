import java.util.*;
public class DoublyLL{
	public static void main(String args[]){
		LinkedList<Integer> dl = new LinkedList<Integer>();
		System.out.println("List: " + dl);
		dl.add(10);
		dl.addFirst(20);
		dl.add(40);
		dl.addLast(30);
		System.out.println("List after insertion: " + dl);
		dl.remove(1);
		dl.removeFirst();
		dl.removeLast();
		System.out.println("List after deletion: " + dl);
	}
}

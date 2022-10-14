import java.util.*;
public class QueueFW{
	public static void main(String args[]){
		Queue<Integer> q = new LinkedList<Integer>();
		System.out.println("Contents of queue: " + q);
		System.out.println("Size: " + q.size());
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println("Contents of queue: " + q);
		System.out.println("Size: " + q.size());
		System.out.println("Front element: " + q.peek());
		System.out.println("Contents of queue after peek: " + q);
		System.out.println("Removed: " + q.poll());
		System.out.println("Contents of queue after poll: " + q);
		System.out.println("Removed: " + q.poll());
		System.out.println("Final queue: ");
		Iterator i = q.iterator();
		while(i.hasNext()){
			System.out.print(i.next() + " ");
		}
	}
}

import java.util.*;
public class ArrayListFW{
	public static void main(String args[]){
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Contents of list: " + al);
		System.out.println("Size: " + al.size());
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("Contents of list: " + al);
		System.out.println("Size: " + al.size());
		System.out.println("Returning second element: " + al.get(1));
		al.set(1, 25);
		System.out.println("List after changing second element: ");
		for(int num: al)
			System.out.print(num + " ");
	}
}

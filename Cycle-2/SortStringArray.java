import java.util.*;
public class SortStringArray
{
	public static void main(String s[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		n = sc.nextInt();
		String a[] = new String[n];
		System.out.println("Enter elements into array: ");
		for(int i = 0; i < n; i++)
			a[i] = sc.next();
		System.out.println("Array before sort: ");
		for(String x: a)
			System.out.print(x + "  ");
		Arrays.sort(a);
		System.out.println("\nArray after sort: ");
		for(String x: a)
			System.out.print(x + "  ");
	}
}

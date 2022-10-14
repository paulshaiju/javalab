import java.util.*;
public class SortArray
{
	public static void main(String s[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements into array: ");
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.println("Array before sort: ");
		for(int x: a)
			System.out.print(x + "  ");
		Arrays.sort(a);
		System.out.println("\nArray after sort: ");
		for(int x: a)
			System.out.print(x + "  ");
	}
}

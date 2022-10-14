import java.util.Scanner;
public class LargestN
{
	public static void main(String s[])
	{
		int n, i, largest;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements into array: ");
		for(i = 0; i < n; i++)
			a[i] = sc.nextInt();
		largest = a[0];
		for(i = 0; i < n; i++)
		{
			if(a[i] > largest)
				largest = a[i];
		}
		System.out.print("Largest number is: " + largest);
	}
}

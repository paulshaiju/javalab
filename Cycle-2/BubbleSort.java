import java.util.Scanner;
public class BubbleSort
{
	public static void main(String s[])
	{
		int n, i, j, temp, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements into array: ");
		for(i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.println("Array before sorting: ");
		for(i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		for(i = 0; i < n-1; i++)
		{
			for(j = 0; j < n-1-i; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					c++;
				}
			}
		}
		if(c == 0)
			System.out.print("\nArray is already sorted");
		else
		{
			System.out.println("\nArray after sorting: ");
			for(i = 0; i < n; i++)
				System.out.print(a[i] + " ");
		}
	}
}

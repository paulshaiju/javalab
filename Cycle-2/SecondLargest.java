import java.util.Scanner;
public class SecondLargest
{
	public static void main(String s[])
	{
		int n, i, j, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements into array: ");
		for(i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for(i = 0; i < n-1; i++)
		{
			for(j = 0; j < n-1-i; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.print("Second smallest: " + a[1] + " and second largest: " + a[n-2]);
	}
}

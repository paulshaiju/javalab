import java.util.Scanner;
public class LinearSearch
{
	public static void main(String s[])
	{
		int n, item, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements into array: ");
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.print("Enter item to be searched for: ");
		item = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
			if(a[i] == item)
			{
				flag = i+1;
				break;
			}
		}
		if(flag == 0)
			System.out.print(item + " not found");
		else
			System.out.print(item + " found at position " + flag);
	}
}

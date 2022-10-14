import java.util.Scanner;
public class Fibonacci
{
	public static void main(String s[])
	{
		int n, first = 0, second = 1, third;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		n = sc.nextInt();
		for(int i = 1; i < n; i++)
		{
			if(i == 1)
				System.out.print("Fibonacci series: " + first + " " + second + " ");
			else
			{
				third = first + second;
				System.out.print(third + " ");
				first = second;
				second = third;
			}
		}
	}
}

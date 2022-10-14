import java.util.Scanner;
public class SumNatural
{
	public static void main(String args[])
	{
		int n, i, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of numbers: ");
		n = sc.nextInt();
		for(i = 1; i <= n; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of first " + n + " natural numbers is " + sum);
	}
}

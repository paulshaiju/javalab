import java.util.Scanner;
public class RecursiveSum
{
	public static int sumDigit(int n)
	{
		int sum = 0;
		if(n == 0)
			return 0;
		else
		{
			sum = (n % 10) + sumDigit(n/10);
			return sum;
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n;
		n = sc.nextInt();
		System.out.print(sumDigit(n));
	}
}

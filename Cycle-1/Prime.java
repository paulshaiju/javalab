import java.util.Scanner;
public class Prime
{
	public static void main(String args[])
	{
		int n, i, flag = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		for(i = 2; i <= n/2; i++)
		{
			if(n == 2)
			{
				flag = 1;
				break;
			}
			else if(n % i == 0)
			{
				flag = 0;
				break;
			}
			else
				flag = 1;
		}
		
		if(flag == 1)
			System.out.println(n + " is prime");
		else
			System.out.println(n + " is not prime");
	}
}

import java.util.Scanner;
public class RecursiveFactorial
{	
	public static int fact(int num)
	{
		if(num == 1)
			return 1;
		else
			return num * fact(num - 1);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		System.out.print("Factorial: " + fact(n));
	}
}

import java.util.Scanner;
public class Factorial{
	public static void main(String s[])
	{
		int n, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++)
			fact = fact * i;
		System.out.println("Factorial of " + n + " = "  + fact);
	}
}

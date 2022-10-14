public class FactorialCmd
{
	public static void main(String s[])
	{
		int num, fact = 1;
		num = Integer.parseInt(s[0]);
		for(int i = 1; i <= num; i++)
			fact = fact * i;
		System.out.println("Factorial of " + num + ": " + fact);
	}
}

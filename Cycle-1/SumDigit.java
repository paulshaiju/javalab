import java.util.Scanner;
public class SumDigit
{
	public static void main(String s[])
	{
		int num, dig, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		while(num != 0)
		{
			dig = num % 10;
			sum = sum + dig;
			num = num / 10;
		}
		System.out.print("Sum of the digits of the number is: " + sum);
	}
}

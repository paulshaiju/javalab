import java.util.Scanner;
public class Reverse
{
	public static void main(String s[])
	{
		int num, dig, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		while(num != 0)
		{
			dig = num % 10;
			rev = rev * 10 + dig;
			num = num / 10;
		}
		System.out.print("Reverse of the number is: " + rev);
	}
}

import java.util.Scanner;
public class CheckPalindrome
{
	public static void main(String s[])
	{
		int num, dig, copyn, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		copyn = num;
		while(num != 0)
		{
			dig = num % 10;
			rev = rev * 10 + dig;
			num = num / 10;
		}
		if(rev == copyn)
			System.out.print(copyn + " is a palindrome");
		else
			System.out.print(copyn + " is a not palindrome");
	}
}

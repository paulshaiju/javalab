import java.util.*;
public class StringPalindrome
{
	public static void main(String args[])
	{
		String s, rev = "";
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		s = sc.nextLine();
		n = s.length();
		for(int i = n - 1; i >= 0; i--)
			rev += s.charAt(i);
		if(s.equals(rev))
			System.out.print(s + " is a palidrome");
		else
			System.out.print(s + " is not a palidrome");
	}
}

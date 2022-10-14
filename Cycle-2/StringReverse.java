import java.util.*;
public class StringReverse
{
	public static void main(String args[])
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		s = sc.nextLine();
		StringBuilder sbd = new StringBuilder(s);
		sbd.reverse();
		System.out.print("Reverse string: " + sbd);
	}
}

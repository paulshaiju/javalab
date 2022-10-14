import java.util.*;
public class SumStringInt
{
	public static void main(String args[])
	{
		int n, sum = 0;
		String s, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers with one space gap: ");
		s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		while(st.hasMoreTokens())
		{
			temp = st.nextToken();
			n = Integer.parseInt(temp);
			System.out.println(n);
			sum = sum + n;
		}
		System.out.println("Sum of entered integers: " + sum);
	}
}

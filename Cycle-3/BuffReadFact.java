import java.io.*;
import java.util.*;
public class BuffReadFact
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int n = Integer.parseInt(br.readLine());
		int fact = 1;
		if(n == 1)
			System.out.println("Factorial: 1");
		else
		{
			for(int i = 1; i <= n; i++)
				fact = fact * i;
			System.out.println("Factorial: " + fact);
		}
	}
}

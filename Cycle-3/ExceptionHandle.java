import java.util.Scanner;
public class ExceptionHandle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		try
		{
			int c;
			c = a/b;
			System.out.println(a + "/" + b + " = " + c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception found: " + ae);
		}
		finally
		{
			System.out.println("This will definitely be printed");
		}
	}
}

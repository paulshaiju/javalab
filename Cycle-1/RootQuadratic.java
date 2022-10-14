import java.util.Scanner;
public class RootQuadratic
{
	public static void main(String s[])
	{
		int a, b, c, D;
		double x1, x2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coefficient of x^2: ");
		a = sc.nextInt();
		System.out.println("Enter coefficient of x: ");
		b = sc.nextInt();
		System.out.println("Enter constant term: ");
		c = sc.nextInt();
		D = (b * b) - (4 * a * c);
		if(D > 0)
		{
			x1 = (-b + Math.sqrt(D))/(2 * a);
			x2 = (-b - Math.sqrt(D))/(2 * a);
			System.out.println("Roots are: " + x1 + " and " + x2);
		}
		else if(D == 0)
		{
			x1 = (-b)/(2 * a);
			x2 = x1;
			System.out.println("Roots are: " + x1 + " and " + x2);
		}
		else
		{
			x1 = (-b)/(2 * a);
			x2 = (Math.sqrt(-D))/(2 * a);
			System.out.println("Roots are: " + x1 + " + " + x2 + "i and " + x1 + " - " + x2 + "i");
		}
	}
}

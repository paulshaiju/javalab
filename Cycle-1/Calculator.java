import java.util.Scanner;
public class Calculator
{
	public static void main(String s[])
	{
		double num1, num2, ans;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		num1  = sc.nextDouble();
		System.out.println("Enter number 2: ");
		num2  = sc.nextDouble();
		System.out.println("Enter an operator (+,-,*,/): ");
		op = sc.next().charAt(0);
		switch(op)
		{
			case '+': ans = num1 + num2;
			break;
			case '-': ans = num1 - num2;
			break;
			case '*': ans = num1 * num2;
			break;
			case '/': ans = num1 / num2;
			break;
			default: System.out.println("Error! Enter correct operator");
			return;
		}
		System.out.println("Result: " + num1 + "" + op + "" + num2 + " = " + ans);
	}
}

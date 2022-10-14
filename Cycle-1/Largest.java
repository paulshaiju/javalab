import java.util.Scanner;
public class Largest
{
	public static void main(String args[])
	{
		int num1, num2, largest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		largest = num1;
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		if(num1 == num2)
			System.out.println("The numbers are equal");
		else{
			if(num2 > num1)
				largest = num2;
			System.out.println(largest + " is the largest number");
		}
	}
}

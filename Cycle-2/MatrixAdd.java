import java.util.Scanner;
public class MatrixAdd
{
	public static void main(String s[])
	{
		int r, c, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		r = sc.nextInt();
		System.out.print("Enter number of columns: ");
		c = sc.nextInt();
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		int sum[][] = new int[r][c];
		System.out.println("Enter elements into matrix A: ");
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements into matrix B: ");
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Sum of the matrices: ");
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				System.out.print(sum[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}

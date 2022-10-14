import java.util.Scanner;
public class MatrixMultiply
{
	public static void main(String s[])
	{
		int r1, c1, c2;
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[10][10];
		int b[][] = new int[10][10];
		int product[][] = new int[10][10];
		System.out.print("Enter number of rows for matrix A: ");
		r1 = sc.nextInt();
		System.out.print("Enter number of columns for matrix A: ");
		c1 = sc.nextInt();
		int r2 = c1;
		System.out.print("Enter number of columns for matrix B: ");
		c2 = sc.nextInt();
		
		System.out.println("Enter elements into matrix A: ");
		for(int i = 0; i < r1; i++){
			for(int j = 0; j < c1; j++)
				a[i][j] = sc.nextInt();
		}
		
		System.out.println("Enter elements into matrix B: ");
		for(int i = 0; i < r2; i++){
			for(int j = 0; j < c2; j++)
				b[i][j] = sc.nextInt();
		}
		
		System.out.println("Matrix A: ");
		for(int i = 0; i < r1; i++){
			for(int j = 0; j < c1; j++)
				System.out.print(a[i][j] + "  ");
			System.out.print("\n");
		}
		
		System.out.println("Matrix B: ");
		for(int i = 0; i < r2; i++){
			for(int j = 0; j < c2; j++)
				System.out.print(b[i][j] + "  ");
			System.out.print("\n");
		}
		
		for(int i = 0; i < r1; i++){
			for(int j = 0; j < c2; j++){
				for(int k = 0; k < r2; k++)
					product[i][j] += a[i][k] * b[k][j];
			}
		}
		
		System.out.println("Product of matrices: ");
		for(int i = 0; i < r1; i++){
			for(int j = 0; j < c2; j++)
				System.out.print(product[i][j] + "  ");
			System.out.print("\n");
		}
	}
}

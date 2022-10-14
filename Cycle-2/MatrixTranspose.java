import java.util.Scanner;
public class MatrixTranspose
{
	public static void main(String s[])
	{
		int r,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		r = sc.nextInt();
		System.out.print("Enter number of columns: ");
		c = sc.nextInt();
		int a[][] = new int[10][10];
		int transA[][] = new int[10][10];
		System.out.println("Enter elements into matrix: ");
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++)
				a[i][j] = sc.nextInt();
		}
		
		System.out.println("Matrix A: ");
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++)
				System.out.print(a[i][j] + "  ");
			System.out.print("\n");
		}
		
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++)
				transA[j][i] = a[i][j];
		}
		
		System.out.println("Transpose of matrix A: ");
		for(int i = 0; i < c; i++){
			for(int j = 0; j < r; j++)
				System.out.print(transA[i][j] + "  ");
			System.out.print("\n");
		}
	}
}

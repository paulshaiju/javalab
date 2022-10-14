import NewPackage.NewClass;
import java.util.*;
public class OddEvenCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		NewClass nc = new NewClass();
		System.out.println(nc.parityCheck(n));
	}
}

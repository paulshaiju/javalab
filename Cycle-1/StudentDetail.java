import java.util.Scanner;
public class StudentDetail
{
	public static void main(String s[])
	{
		int rno;
		String name;
		float sgpa;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student name: ");
		name = sc.nextLine();
		System.out.print("Enter student roll no: ");
		rno = sc.nextInt();
		System.out.print("Enter student SGPA: ");
		sgpa = sc.nextFloat();
		System.out.println("Roll No: " + rno);
		System.out.println("Name: " + name);
		System.out.println("SGPA: " + sgpa);
	}
}

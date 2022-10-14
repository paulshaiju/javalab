package Studpack;

class Student
{
	String name;
	int rollNo;
	float mark1, mark2, mark3;
	
	public Student()
	{
		name = "None";
		rollNo = 0;
		mark1 = mark2 = mark3 = 0;
	}
	
	Student(String name, int rno, float mark1, float mark2, float mark3)
	{
		this.name = name;
		this.rollNo = rno;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
}

interface Sports
{
	int grade = 100;
	void displayGrade();
}

public class Result extends Student implements Sports
{
	float total;
	
	public void displayGrade()
	{
		System.out.println("Grade: " + grade);
	}
	
	public void displayTotal()
	{
		System.out.println("\nRoll No: " + rollNo);
		displayGrade();
		System.out.println("Total: " + total + "/400");
	}
	
	public Result()
	{
		super();
		total = 0;
	}
	
	public Result(String name, int rno, float mark1, float mark2, float mark3)
	{
		super(name, rno, mark1, mark2, mark3);
		total = mark1 + mark2 + mark3 + grade;
	}
}

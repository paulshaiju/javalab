class Employee
{
	String className;
	double salary = 10000;
	void display(String className)
	{
		System.out.println("Name of class: " + className);
	}
	
	void calcSalary(double salary)
	{
		System.out.println("Salary of employee is " + salary);
	}
}

class Engineer extends Employee
{
	void calcSalary(double salary)
	{
		System.out.println("Salary of employee is " + salary);
	}
	
	void calcSalary()
	{
		super.calcSalary(salary);
	}
}

public class EmployeeDemo2
{
	public static void main(String args[])
	{
		Engineer engr = new Engineer();
		engr.display("Employee");
		engr.calcSalary();
		engr.calcSalary(20000);
	}
}

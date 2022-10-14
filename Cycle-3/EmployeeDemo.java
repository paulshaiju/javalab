class Employee
{
	String name;
	int age;
	String phoneNum;
	String address;
	double salary;
	
	void printSalary()
	{
		System.out.println("Salary: " + salary);
	}
	
	void printInfo()
	{
		System.out.println("\nName: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone No: " + phoneNum);
		System.out.println("Adress: " + address);
	}
}

class Officer extends Employee
{
	String specialization;
	
	Officer(String name, int age, String phno, String adrs, double sal, String spec)
	{
		this.name = name;
		this.age = age;
		this.phoneNum = phno;
		this.address = adrs;
		this.salary = sal;
		this.specialization = spec;
	}
}

class Manager extends Employee
{
	String department;
	
	Manager(String name, int age, String phno, String adrs, double sal, String dept)
	{
		this.name = name;
		this.age = age;
		this.phoneNum = phno;
		this.address = adrs;
		this.salary = sal;
		this.department = dept;
	}
}

public class EmployeeDemo
{
	public static void main(String args[])
	{
		Officer ofcr = new Officer("Aadil", 19, "1234567890", "Nizam Cottege", 10000, "Software Engineering");
		Manager mngr = new Manager("Adithyan", 20, "9876543210", "Rayyan", 20000, "Design");
		ofcr.printInfo();
		System.out.println("Specializaton: " + ofcr.specialization);
		ofcr.printSalary();
		mngr.printInfo();
		System.out.println("Department: " + mngr.department);
		mngr.printSalary();
	}
}

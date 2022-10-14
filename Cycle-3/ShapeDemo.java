abstract class Shape
{
	abstract void numberOfSides();
}

class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("A triangle has 3 sides");
	}
}

class Rectangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("A rectangle has 4 sides");
	}
}

class Hexagon extends Shape
{
	void numberOfSides()
	{
		System.out.println("A hexagon has 6 sides");
	}
}

public class ShapeDemo
{
	public static void main(String args[])
	{
		Triangle tri = new Triangle();
		Rectangle rect = new Rectangle();
		Hexagon hex = new Hexagon();
		tri.numberOfSides();
		rect.numberOfSides();
		hex.numberOfSides();
	}
}

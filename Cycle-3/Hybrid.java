import Studpack.Result;

public class Hybrid
{
	public static void main(String args[])
	{
		Result st1 = new Result("Aadil", 1, 100,100, 99);
		Result st2 = new Result("Abhin", 2, 99,99, 99);
		Result st3 = new Result("Abhinav", 3, 100,99, 99);
		Result st4 = new Result("Adithyan", 4, 100,100, 99);
		Result st5 = new Result("Dhinoo", 5, 100,100, 100);
		
		st1.displayTotal();
		st2.displayTotal();
		st3.displayTotal();
		st4.displayTotal();
		st5.displayTotal();
	}
}

import java.util.Scanner;
class Box{
	int length, breadth, height;
	Box(int l, int b, int h)
	{
		this.length = l;
		this.breadth = b;
		this.height = h;
	}
	int volume(){
		return length * breadth * height;
	}
}

public class BoxDemo{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int l,b,h;
		System.out.print("Enter length: ");
		l = sc.nextInt();
		System.out.print("Enter breadth: ");
		b = sc.nextInt();
		System.out.print("Enter height: ");
		h = sc.nextInt();
		Box mybox1 = new Box(l,b,h);
		int v = mybox1.volume();
		System.out.print("Volume: " + v);
	}
}

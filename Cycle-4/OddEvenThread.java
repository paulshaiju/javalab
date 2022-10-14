import java.util.*;
class Even extends Thread{
	int n;
	public Even(int n){
		this.n = n;
	}
	public void run(){
		for(int i = 2; i <= n; i = i+2){
			System.out.println("Even: " + i);
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
}
class Odd extends Thread{
	int n;
	public Odd(int n){
		this.n = n;
	}
	public void run(){
		for(int i = 1; i <= n; i = i+2){
			System.out.println("Odd: " + i);
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
}
public class OddEvenThread{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter limit: ");
		int n = sc.nextInt();
		Odd o = new Odd(n);
		Even e  = new Even(n);
		o.start();
		e.start();
	}
}

import java.util.Random;
class EvenThread implements Runnable{
	int n;
	public EvenThread(int n){
		this.n = n;
	}
	public void run(){
		System.out.println("Square of " + n + ": " + n*n);
	}
}
class OddThread implements Runnable{
	int n;
	public OddThread(int n){
		this.n = n;
	}
	public void run(){
		System.out.println("Cube of " + n + ": " + n*n*n);
	}
}
class RandomThread implements Runnable{
	public void run(){
		Random r = new Random();
		for(int i = 0; i <= 9; i++){
			int n = r.nextInt(10);
			try{Thread.sleep(1000);}catch(Exception e){}
			if(n%2 == 0)
				new Thread(new EvenThread(n)).start();
			else
				new Thread(new OddThread(n)).start();
		}
	}
}
public class RandomInt{
	public static void main(String args[]){
		new Thread(new RandomThread()).start();
	}
}

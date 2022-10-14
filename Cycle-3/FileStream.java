import java.io.*;
import java.util.*;
public class FileStream{
	public static void main(String args[]) throws IOException{
		try{
			FileInputStream fr = new FileInputStream("input2.txt");
			FileOutputStream fw = new FileOutputStream("output2.txt");
			int c;
			while((c = fr.read()) != -1){
				fw.write((char)c);
				fw.flush();
			}
			fr.close();
			fw.close();
			System.out.println("File copied");
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
	}
}

import java.io.*;
import java.util.*;
public class FileHandle
{
	public static void main(String args[]) throws IOException
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("input.txt"));
			FileWriter fw = new FileWriter("output.txt");
			String line;
			while((line = br.readLine()) != null)
			{
				fw.write(line);
				fw.flush();
			}
			br.close();
			fw.close();
			System.out.println("File copied");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception: " + e);
		}
	}
}

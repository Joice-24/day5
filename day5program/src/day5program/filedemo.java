package day5program;
import java.io.*;
public class filedemo {
	public static void main (String[] args) {
		try {
		FileWriter w1 = new FileWriter("file.txt");
		w1.write("Heloo joo");
			w1.close();
			System.out.println("Data written to file");
			FileReader r1 = new FileReader("file.txt");
			int character;
			while ((character = r1.read()) !=-1) {
				System.out.print((char)character);
			}
			r1.close();
			
		}
		catch (IOException e) {
			System.out.println("An error occurred:"+ e.getMessage());
		}
		
		
	}
}
 
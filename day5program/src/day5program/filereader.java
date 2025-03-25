package day5program;

import java.io.*;

public class filereader {
	public static void main (String[] args) {
		try {
		FileReader reader = new FileReader("file.txt");
		int character;
	
			System.out.println("File contents");
			FileReader reader1 = new FileReader("file.txt");
			                                                                    
			while ((character = reader1.read()) !=-1) {
				System.out.print((char)character);
			}
			reader1.close();
			
		}
		catch (IOException e) {
			System.out.println("Error reading the file:"+ e.getMessage());
		}
		
		
	}
}

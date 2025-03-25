package day5program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class buffredreader {
	public static void main(String[] args) {
		try {
			BufferedReader r1 = new BufferedReader(new FileReader ("C:\\test\\sample.txt"));
			String line;
			System.out.println("Reading file line by line:");
			while ((line=r1.readLine())!=null) {
				System.out.println(line);
			}
			r1.close();
		}catch(IOException e) {
			System.out.println("Error reading file:"+e.getMessage());
		}
	}
}

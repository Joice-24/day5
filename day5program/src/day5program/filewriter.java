package day5program;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
	public static void main (String[] args) {
		try {
			FileWriter writer = new FileWriter("file.txt");
			writer.write("Heloo joo");
				writer.close();
				System.out.println("Data successfully written to file");
		}catch (IOException e) {
			System.out.println("Error writing to a file :"+ e.getMessage());
	}
}
}
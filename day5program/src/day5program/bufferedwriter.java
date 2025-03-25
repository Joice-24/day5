package day5program;
import java.io.BufferedWriter;
import java.io.IOException;
public class bufferedwriter {
	private static BufferedWriter writer;

	public static void main(String[] args) {
		try {
			writer = null;
			writer.write("java file handing example");
			writer.newLine();
			
			writer.write("BufferedWroting makes writing more efficient");
			
			writer.close();
			System.out.println("Data written to file successfully");
		}catch(IOException e) {
			System.out.println("Error reading file:"+e.getMessage());
		}
	}
}



















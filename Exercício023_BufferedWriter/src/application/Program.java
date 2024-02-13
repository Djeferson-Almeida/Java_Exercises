package application;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning","Good afternoon", "Good night"};
		
		String path = "D:\\Udemy-Java\\out.txt";
		
		
		try (BufferedWriter bw = new BufferedWriter (new FileWriter(path))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		}

	}



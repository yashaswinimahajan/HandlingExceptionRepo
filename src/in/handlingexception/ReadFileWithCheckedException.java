package in.handlingexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithCheckedException {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			// Creating a BufferedReader to read the file "example.txt"
			reader = new BufferedReader(new FileReader("example.txt"));
			String line;
			// Reading and printing the content of the file line by line
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// Handling IOException that might occur during file reading
			System.err.println("An IOException occurred: " + e.getMessage());
			e.printStackTrace();
		} finally {
			// Ensuring the BufferedReader is closed properly
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				System.err.println("Failed to close the reader: " + e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
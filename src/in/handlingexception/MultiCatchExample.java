package in.handlingexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultiCatchExample {
    public static void processFile(String filePath) throws IOException, IllegalArgumentException {
        if (filePath == null) {
            throw new IllegalArgumentException("File path cannot be null.");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) {
        try {
            processFile(null);
        } catch (IOException | IllegalArgumentException e) {
        	e.printStackTrace();	
        }
    }
}

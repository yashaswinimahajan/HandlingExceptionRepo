package in.handlingexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessFileWithExceptionChaining {
    public static void processFile(String filePath) throws FileProcessingException {
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new FileProcessingException("File not found: " + filePath, e);
        }
    }

    public static void main(String[] args) {
        try {
            processFile("example.txt");
        } catch (FileProcessingException e) {
        	e.printStackTrace();	
        }
    }
}

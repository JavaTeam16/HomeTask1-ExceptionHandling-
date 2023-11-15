import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class ExceptionHandling {
	public static void main(String[] args) {
		
	}
	
	//Part 1
	public void handleMultipleExceptions() {
        try {
// Code that might throw multiple exceptions
            int x = 10 / 0; // Arithmetic exception
            String str = null;
            str.length(); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General exception occurred: " + e.getMessage());
        }
    }
	
	//Part2
	
    // Re-throwing Exceptions
    public void rethrowException(int x) throws IOException {
        if (x < 0) {
            throw new IOException("Input cannot be negative");
        }
        try {
            //we can also use some certain condition here for throwing
        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace
            throw new RuntimeException("Error occurred", e); // Chain the exception
        }
    }
    
    //Part3
    // Resource Management
    public void manageResources() {
        try (FileReader reader = new FileReader("data.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    //Part4
    // Chaining Exceptions
    public void chainExceptions() {
        try {

        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace
            throw new RuntimeException("Error occurred", e); // Chain the exception
        }
    }
}

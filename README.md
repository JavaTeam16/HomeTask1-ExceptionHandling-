***Note: please open the ReadMe file individually

Group Members:
1. Faraz Chahybakhsh 7219098
2. Hamidreza Fathollahzadeh 7219187
3. Hadis Mohammadi 7219036
4. Zahra Paya 7216582


Quesion1: Give the example of the try-with-resources Statement

Answer: 
try (FileReader reader = new FileReader("data.txt");
BufferedReader bufferedReader = new BufferedReader(reader)) {
String line;
while ((line = bufferedReader.readLine()) != null) {
System.out.println(line);
}
} catch (IOException e) {
e.printStackTrace();
}
--------
Question2: What is the purpose of throw statement?
Answer: it is used in java to explicitly throw an exception from a method or any block of code. It allows you to signal that an error has occurred and transfer the control flow to the nearest enclosing try-catch block that can handle the specific type of exception. at last, its 2 main uses are: 1. Signal Errors 2. Transfer control flow
--------
Question3: Which classes inherit from Throwable class?
Answer: Error & Exception classes inherit from Throwable class and they are its sub class that inherit from it and use its features
--------
Question4: Give 5 different examples of catching and handling exceptions

Answer:
***Example1: 
try {
// Code that might throw an IOException
FileReader reader = new FileReader("data.txt");
BufferedReader bufferedReader = new BufferedReader(reader);
String line;
while ((line = bufferedReader.readLine()) != null) {
System.out.println(line);
}
bufferedReader.close();
} catch (IOException e) {
e.printStackTrace();
}
***Example2: 
try {
// Code that might throw an ArithmeticException
int result = 10 / 0;
System.out.println(result);
} catch (ArithmeticException e) {
System.out.println("An error occurred: " + e.getMessage());
}
***Example3: 
try {
// Code that might throw various exceptions
int result = 10 / 0; // ArithmeticException
FileReader reader = new FileReader("data.txt"); // FileNotFoundException
System.out.println(result);
reader.close();
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
***Example4: 
public static void calculateAverage(int[] numbers) throws ArithmeticException {
if (numbers.length == 0) {
throw new ArithmeticException("Cannot calculate average of an empty array");
}
int sum = 0;
for (int number : numbers) {
sum += number;
}
double average = (double) sum / numbers.length;
System.out.println("Average: " + average);
}

public static void main(String[] args) {
int[] numbers = {10, 20, 30};
try {
calculateAverage(numbers);
} catch (ArithmeticException e) {
System.out.println("Error: " + e.getMessage());
}
}
***Example5: 
try (FileReader reader = new FileReader("data.txt");
BufferedReader bufferedReader = new BufferedReader(reader)) {
String line;
while ((line = bufferedReader.readLine()) != null) {
System.out.println(line);
}
} catch (IOException e) {
e.printStackTrace();
}

package fileHandlingPractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {

		// Create a File
		File myFile = new File("Test.txt");
		myFile.createNewFile();

		// Write a File
		FileWriter write = new FileWriter("Test.txt");
		write.write("Hello and Welcome to Java Training\nThis course will help you to Learn Java");
		write.close();

		// Read a File
		Scanner scr = new Scanner(myFile);
		while (scr.hasNextLine()) {
			String line = scr.nextLine();
			System.out.println(line);
		}
		scr.close();

		// Delete a File
		if (myFile.delete()) {
			System.out.println("File is Deleted");
		} else {
			System.out.println("File Not Found");
		}

	}

}

/**
*Date: 6/26/20
*Author: Adam Grimshaw
*Course: OOP
*Description: Creates a file and writes 100 random integers to it.
*/

import java.io.*;
import java.util.Random;

public class CreateFileWithIntegers {
	public static void main(String[] args) throws IOException {
		try (
			// Create an output stream to the file
			FileOutputStream output = new FileOutputStream("Exercise17_01.txt");
		) {
			// Output values to the file
			Random r = new Random();
			for (int i = 1; i < 100; i++)
				output.write(r.nextInt(50));
		}

		try (
			// Create an input stream for the file
			FileInputStream input = new FileInputStream("Exercise17_01.txt");
		) {
			// Read values from the file
			int value;
			while ((value = input.read()) != -1)
				System.out.print(value + " ");
		}
	}
}

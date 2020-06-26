/**
*Date: 6/26/20
*Author: Adam Grimshaw
*Course: OOP
*Description: Creates a file and writes 100 random integers to it.
*/

import java.io.*;
import java.util.Random;

public class CreateFileSumIntegers {
	public static void main(String[] args) {
		String file = "Exercise17_03.dat";
		writeToFile(file);
		readFileSumInt(file);
	}
	
	public static void writeToFile(String filename) {
		try {
			FileOutputStream output = new FileOutputStream(filename);
			Random r = new Random();
			for (int i = 1; i < 100; i++) {
				output.write(r.nextInt(50));
			}
		} catch (Exception e) {
			System.out.println("Failed on output.");
		}
	}
	
	public static void readFileSumInt(String filename) {
		try {
			FileInputStream input = new FileInputStream(filename);
			int value;
			int sum = 0;
			while ((value = input.read()) != -1) {
				sum += value;
			}
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println("Failed on input.");
		}
	}
}
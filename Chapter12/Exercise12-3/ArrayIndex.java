//Date: 6/8/20
//Author: Adam Grimshaw
//Course: OOP
//Description: Creates array of 100 random integers.

import java.util.*;

class ArrayIndex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numArray = new int[100];
		Random random1 = new Random();
		for (int i = 0; i < 100; i++) {
			numArray[i] = random1.nextInt(50);
		}
		System.out.print("Enter a number between 0 and 99: ");
		int userNumber = input.nextInt();
		try {
			System.out.print(numArray[userNumber]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index out of bounds.");
		}
	}
}
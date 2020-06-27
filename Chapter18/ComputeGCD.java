/*
*Date: 6.26.20
*Author: Adam Grimshaw
*Course: OOP
*Description: Finds the greatest common divisor of two integers.
*/

import java.util.Scanner;

class ComputeGCD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first integer: ");
		int int1 = input.nextInt();
		System.out.print("Please enter the second integer: ");
		int int2 = input.nextInt();
		
		System.out.println(findGCD(int1, int2));
	}
	
	public static int findGCD(int m, int n) {
		if(m % n == 0) {
			return n;
		} else {
			return findGCD(n, m % n);
		}
	}
}
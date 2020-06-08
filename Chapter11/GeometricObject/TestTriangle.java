//Date: 6.6.20
//Author: Adam Grimshaw
//Course: OOP
//Description: This tests the triangle class.

import java.util.*;

class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter side 1 of a triangle: ");
		double sideA = input.nextDouble();
		System.out.print("Please enter side 2 of a triangle: ");
		double sideB = input.nextDouble();
		System.out.print("Please enter side 3 of a triangle: ");
		double sideC = input.nextDouble();
		System.out.print("The triangle is filled? true or false: ");
		boolean filled = input.nextBoolean();
		System.out.print("Please enter the color of the triangle: ");
		String color = input.next();
		
		Triangle aTriangle = new Triangle(sideA, sideB, sideC, color, filled);
		
		System.out.println("\n" + aTriangle.toString());
		System.out.println("Area: " + aTriangle.getArea());
		System.out.println("Perimeter: " + aTriangle.getPerimeter());
		System.out.println("Created: " + aTriangle.getDateCreated());
		System.out.println("Color: " + aTriangle.getColor());
		System.out.println("Filled: " + aTriangle.isFilled());
	}
}
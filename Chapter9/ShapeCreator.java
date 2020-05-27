/*
Adam Grimshaw
Date: 5/27/20
Class: OOP
Description: This program creates objects of the rectangle class.
*/

class ShapeCreator {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		System.out.println("Rectangle1 has the following measurements");
		rectangle1.printStats();
		
		System.out.println("\nRectangle2 has the following measurements");
		rectangle2.printStats();
	}
}
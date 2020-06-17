//Date: 6.15.20
//Author: Adam Grimshaw
//Course: OOP
//Description: Tests the colorable interface

class TestColorable {
	public static void main(String[] args) {
		GeometricObject[] triangleArray = {new Triangle(5, 6, 7), new Triangle(4, 2, 3), new Triangle(3, 9, 8), new Triangle(1, 2, 2), new Triangle(5, 5, 5)};
		for (int i = 0; i < triangleArray.length; i++) {
			System.out.println(triangleArray[i].getArea());
			System.out.println(((Colorable)triangleArray[i]).howToColor());
		}
	}
}
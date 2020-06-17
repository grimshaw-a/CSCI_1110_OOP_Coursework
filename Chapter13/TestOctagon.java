//Date: 6.16.20
//Author: Adam Grimshaw
//Course: OOP
//Description: Tests the octagon class

class TestOctagon {
	public static void main(String[] args) {
		Octagon firstShape = new Octagon(7);
		Octagon secondShape = new Octagon(5.5);
		Octagon thirdShape = (Octagon)firstShape.clone();
		
		System.out.println(firstShape.compareTo(secondShape));
		System.out.println(firstShape.compareTo(thirdShape));
		System.out.println(thirdShape.getArea());

	}
}
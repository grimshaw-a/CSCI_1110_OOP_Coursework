//Date: 06.01.20
//Author: Adam Grimshaw
//Class: OOP
//Description: Creates a class to test to test integers.

class TestMyInteger {
	public static void main(String[] args) {
		MyInteger sam = new MyInteger(127);
		System.out.println("The value is " + sam.getValue());
		
		System.out.println("is even? " + sam.isEven());
		System.out.println("is odd? " + sam.isOdd());
		System.out.println("is prime? " + sam.isPrime());
		
		System.out.println("Is this number even? " + MyInteger.isEven(6));
		System.out.println("Is this number odd? " + MyInteger.isOdd(6));
		System.out.println("Is this number prime? " + MyInteger.isPrime(6));
		
		System.out.println("Is this number even? " + MyInteger.isEven(sam));
		System.out.println("Is this number odd? " + MyInteger.isOdd(sam));
		System.out.println("Is this number prime? " + MyInteger.isPrime(sam));
		
		System.out.println("Value equals 19? " + sam.equals(19));
		System.out.println("Value equals MyInteger? " + sam.equals(sam));
				
		char[] fiveNumbers = {'1', '6', '8', '5', '9'};
		int newNumFromCharArray = MyInteger.parseInt(fiveNumbers);
		System.out.println(newNumFromCharArray + 1);
		int newNumFromString = MyInteger.parseInt("24984");
		System.out.println(newNumFromString + 1);
	}
}

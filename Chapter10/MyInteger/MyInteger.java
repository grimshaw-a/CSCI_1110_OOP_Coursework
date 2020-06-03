//Date: 06.01.20
//Author: Adam Grimshaw
//Class: OOP
//Description: Creates a class to test to test integers.

class MyInteger {
	private int value;
	
	MyInteger(int v) {
		value = v;
	}
	
	public int getValue() {
		return value;
	}
	public boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isOdd() {
		if (this.value % 2 == 0) {
			return false;
		}
		else {
			return true;
		}
	}	
	public boolean isPrime() {
		boolean flagged = true;
		for(int i = 2; i < value; i++) {
			if(this.value % i == 0) {
				flagged = false;
			}
		}
		return flagged;
	}
	public static boolean isEven(int v) {
		if (v % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isOdd(int v) {
		if (v % 2 == 0) {
			return false;
		}
		else {
			return true;
		}
	}

	public static boolean isPrime(int v) {
		boolean flagged = true;
		for(int i = 2; i < v; i++) {
			if(v % i == 0) {
				flagged = false;
			}
		}
		return flagged;
	}
	public static boolean isEven(MyInteger v) {
		if (v.getValue() % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isOdd(MyInteger v) {
		if (v.getValue() % 2 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	public static boolean isPrime(MyInteger v) {
		boolean flagged = true;
		for(int i = 2; i < v.getValue(); i++) {
			if(v.getValue() % i == 0) {
				flagged = false;
			}
		}
		return flagged;
	}
	public boolean equals(int v) {
		if(this.getValue() == v) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(MyInteger v) {
		if(this.getValue() == v.getValue()) {
			return true;
		} else {
			return false;
		}
	}

	static int parseInt(char[] a) {
		int sum = 0;
		int temp = 0;
		int decimalPlace = 1;
		for (int i = a.length - 1; i >= 0; i--) {
			temp = Character.getNumericValue(a[i]);
			sum = sum + temp * decimalPlace;
			decimalPlace *= 10;
		}
		return sum;
	}

	static int parseInt(String a) {
		char[] word = a.toCharArray();
		int sum = MyInteger.parseInt(word);
		return sum;
	}
}

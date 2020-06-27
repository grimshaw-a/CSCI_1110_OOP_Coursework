/*
*Date: 6.26.20
*Author: Adam Grimshaw
*Course: OOP
*Description: Prints out a string in reverse.
*/

class ReverseString {
	public static void main(String[] args) {
		String message = ".esrever ni em etirW";
		reverseDisplay(message);
	}
	public static void reverseDisplay(String value) {
		if(value.length() == 0) {
			//do nothing
		} else {
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}
}

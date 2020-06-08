//Date: 6.6.20
//Author: Adam Grimshaw
//Course: OOP
//Description: This defines the geometric object class.

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	//Construct a default geometric object
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	//Construct with specified color and filled value
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}
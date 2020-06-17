//Date: 6.15.20
//Author: Adam Grimshaw
//Course: OOP
//Description: Defines the GeometricObject class

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	//Construct default geometric object
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	//Construct geometric object with parameters
	protected GeometricObject(String color, boolean filled) {
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
	
	//Return a string representation of this object
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	//Abstract method getPerimeter
	public abstract double getPerimeter();
	
	//Abstract method getArea
	public abstract double getArea();
	
}
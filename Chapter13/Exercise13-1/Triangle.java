//Date: 6.15.20
//Author: Adam Grimshaw
//Course: OOP
//Description: Defines the Triangle class

public class Triangle extends GeometricObject {
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	//Construct default triangle
	public Triangle() {
	}
	
	//Construct triangle with specific side lengths
	public Triangle(double s1, double s2, double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	//Construct triangle with specific side lengths and define color and filled status
	public Triangle(double s1, double s2, double s3, String color, boolean filled) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
		setColor(color);
		setFilled(filled);
	}
	
	public double getSide1() {
		return side1;
	}
	
	public void setSide1(double s) {
		this.side1 = s;
	}
	
	public double getSide2() {
		return side2;
	}
		
	public void setSide2(double s) {
		this.side2 = s;
	}
	
	public double getSide3() {
		return side3;
	}
			
	public void setSide3(double s) {
		this.side3 = s;
	}
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}
	public double getArea() {
		double s = (this.side1 + this.side2 + this.side3) / 2;
		return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
	}
}